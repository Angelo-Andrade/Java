package RedeSocial;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String biografia;
    private String fotoPerfil;
    private List<Postagem> postagens;

    public Perfil() {
        this.biografia = "";
        this.fotoPerfil = "";
        postagens = new ArrayList<>();
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    
    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void adicionarPostagem(Postagem postagem) {
        this.postagens.add(postagem);
        System.out.println("Postagem adicionada em suas postagens!");
    }
    
    public void removerPostagem(Postagem postagem) {
    	this.postagens.remove(postagem);
        System.out.println("Postagem removida de suas postagens!");
    }
}
