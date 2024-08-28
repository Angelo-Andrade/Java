package RedeSocial;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    @Override
    public Postagem criarPostagem(String conteudo) {
        System.out.println("Postagem em destaque criada.");
    	Postagem novaPostagem = new Postagem(conteudo, this);
    	getPerfil().adicionarPostagem(novaPostagem);
    	return novaPostagem;
    }
}
