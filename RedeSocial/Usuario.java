package RedeSocial;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Perfil perfil;
    private boolean isBanido;

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.perfil = new Perfil();
        this.isBanido = false;
    }

    public boolean isBanido() {
        return isBanido;
    }

    public void setBanido(boolean isBanido) {
        this.isBanido = isBanido;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("Senha deve ter pelo menos 8 caracteres.");
        }
    }
    
    public String getSenha() {
    	return senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public Postagem criarPostagem(String conteudo) {
    	System.out.println("Postagem criada!");
    	Postagem novaPostagem = new Postagem(conteudo, this);
    	perfil.adicionarPostagem(novaPostagem);
    	return novaPostagem;
    }
    
    public void deletarPostagem(Postagem postagem) {
        Perfil perfilDoUsuario = postagem.getAutor().getPerfil();
        if (perfilDoUsuario.getPostagens().contains(postagem)) {
            perfilDoUsuario.getPostagens().remove(postagem);
            System.out.println("Postagem deletada do perfil com sucesso!");
        } else {
            System.out.println("A postagem não foi encontrada no perfil do usuário.");
        }
    }
    
    public boolean checkUserStatus() {
        if (this.isBanido) {
            System.out.println("Acesso negado. O usuário foi banido.");
            return false;
        }
        return true;
    }
}