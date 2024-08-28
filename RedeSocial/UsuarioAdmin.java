package RedeSocial;

public class UsuarioAdmin extends Usuario {

    public UsuarioAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    @Override
    public void deletarPostagem(Postagem postagem) {
        Perfil perfilDoUsuario = postagem.getAutor().getPerfil();
        if (perfilDoUsuario.getPostagens().contains(postagem)) {
            perfilDoUsuario.getPostagens().remove(postagem);
            System.out.println("Postagem deletada do perfil do usuário: " + postagem.getAutor().getNomeUsuario());
        } else {
            System.out.println("A postagem não foi encontrada no perfil do usuário.");
        }
    }

    public void banirUsuario(Usuario usuario) {
        usuario.setBanido(true);
        System.out.println("Usuário " + usuario.getNomeUsuario() + " foi banido.");
    }
}