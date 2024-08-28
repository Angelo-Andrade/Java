package RedeSocial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuarioComum = new Usuario("usuario1", "senhaSegura", "usuario1@exemplo.com");
        UsuarioPremium usuarioPremium = new UsuarioPremium("usuarioPremium", "senhaPremium", "premium@exemplo.com");
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("admin", "senhaAdmin", "admin@exemplo.com");

        usuarios.add(usuarioComum);
        usuarios.add(usuarioPremium);
        usuarios.add(usuarioAdmin);

        Postagem postagem1 = usuarioComum.criarPostagem("Esta é minha primeira postagem!");
        Postagem postagemDestaque = usuarioPremium.criarPostagem("Postagem em destaque!");
        usuarioAdmin.deletarPostagem(postagemDestaque);
        
        Usuario usuarioLogado = null;
        while (usuarioLogado == null) {
            System.out.println("1. Fazer login");
            System.out.println("2. Criar uma conta");
            System.out.print("Escolha uma opção: ");
            int opcaoInicial = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoInicial) {
                case 1:
                    usuarioLogado = login(scanner, usuarios);
                    break;
                case 2:
                    usuarioLogado = criarConta(scanner, usuarios);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Ver feed de postagens");
            System.out.println("2. Curtir uma postagem");
            System.out.println("3. Comentar em uma postagem");
            System.out.println("4. Acessar meu perfil");
            if (usuarioLogado instanceof UsuarioAdmin) {
                System.out.println("5. Banir um usuário");
                System.out.println("6. Apagar uma postagem");
            }
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    verFeed(usuarios);
                    break;
                case 2:
                    curtirPostagem(scanner, usuarios);
                    break;
                case 3:
                    comentarPostagem(scanner, usuarios);
                    break;
                case 4:
                    acessarPerfil(usuarioLogado);
                    break;
                case 5:
                    if (usuarioLogado instanceof UsuarioAdmin) {
                        banirUsuario(scanner, usuarios);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 6:
                    if (usuarioLogado instanceof UsuarioAdmin) {
                        apagarPostagem(scanner, usuarios);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static Usuario login(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
            	boolean validUser = usuario.checkUserStatus();
            	if(validUser) return null;
            	else return usuario;
            }
        }

        System.out.println("Usuário ou senha incorretos.");
        return null;
    }

    private static Usuario criarConta(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Escolha um tipo de conta (1. Comum, 2. Premium): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        Usuario novoUsuario;
        if (tipo == 2) {
            novoUsuario = new UsuarioPremium(nomeUsuario, senha, email);
            System.out.println("Conta premium criada com sucesso!");
        } else {
            novoUsuario = new Usuario(nomeUsuario, senha, email);
            System.out.println("Conta comum criada com sucesso!");
        }

        usuarios.add(novoUsuario);
        return novoUsuario;
    }

    private static void verFeed(List<Usuario> usuarios) {
        List<Postagem> feed = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            feed.addAll(usuario.getPerfil().getPostagens());
        }

        Collections.sort(feed, Comparator.comparing(Postagem::isEmDestaque).reversed());

        System.out.println("\nFeed de Postagens:");
        for (int i = 0; i < feed.size(); i++) {
            System.out.println((i + 1) + ". " + feed.get(i).toString());
        }
    }

    private static void curtirPostagem(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Digite o número da postagem que deseja curtir: ");
        int numCurtida = scanner.nextInt();
        scanner.nextLine();

        List<Postagem> feed = gerarFeed(usuarios);
        if (numCurtida > 0 && numCurtida <= feed.size()) {
            feed.get(numCurtida - 1).curtir();
            System.out.println("Postagem curtida com sucesso!");
        } else {
            System.out.println("Número de postagem inválido.");
        }
    }

    private static void comentarPostagem(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Digite o número da postagem que deseja comentar: ");
        int numComentario = scanner.nextInt();
        scanner.nextLine(); 

        List<Postagem> feed = gerarFeed(usuarios);
        if (numComentario > 0 && numComentario <= feed.size()) {
            System.out.print("Digite seu comentário: ");
            String comentario = scanner.nextLine();
            feed.get(numComentario - 1).comentar(comentario);
            System.out.println("Comentário adicionado com sucesso!");
        } else {
            System.out.println("Número de postagem inválido.");
        }
    }

    private static void acessarPerfil(Usuario usuarioLogado) {
        System.out.println("Meu Perfil:");
        System.out.println("Nome de Usuário: " + usuarioLogado.getNomeUsuario());
        System.out.println("Email: " + usuarioLogado.getEmail());
        System.out.println("Biografia: " + usuarioLogado.getPerfil().getBiografia());
        System.out.println("Foto de Perfil: " + usuarioLogado.getPerfil().getFotoPerfil());
    }

    private static void banirUsuario(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Digite o nome do usuário que deseja banir: ");
        String nomeUsuario = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equals(nomeUsuario)) {
                usuarios.remove(usuario);
                System.out.println("Usuário banido com sucesso!");
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }

    private static void apagarPostagem(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Digite o número da postagem que deseja apagar: ");
        int numPostagem = scanner.nextInt();
        scanner.nextLine();

        List<Postagem> feed = gerarFeed(usuarios);
        if (numPostagem > 0 && numPostagem <= feed.size()) {
            Postagem postagem = feed.get(numPostagem - 1);
            Usuario autor = postagem.getAutor();
            autor.deletarPostagem(postagem);
            System.out.println("Postagem apagada com sucesso!");
        } else {
            System.out.println("Número de postagem inválido.");
        }
    }

    private static List<Postagem> gerarFeed(List<Usuario> usuarios) {
        List<Postagem> feed = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            feed.addAll(usuario.getPerfil().getPostagens());
        }

        feed.sort(Comparator.comparing(Postagem::isEmDestaque).reversed());
        return feed;
    }
}
