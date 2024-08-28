package RedeSocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem implements Curtivel {
    private String conteudo;
    private Date dataCriacao;
    private int curtidas;
    private List<String> comentarios;
    private Usuario autor;
    private boolean emDestaque;

    public Postagem(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.dataCriacao = new Date(); 
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
        this.autor = autor;
    }

    public boolean isEmDestaque() {
        return emDestaque;
    }

    public void setEmDestaque(boolean emDestaque) {
        this.emDestaque = emDestaque;
    }

    @Override
    public String toString() {
        return (emDestaque ? "Destaque: " : "") + conteudo;
    }
    
    public String getConteudo() {
        return conteudo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public void curtir() {
        this.curtidas++;
    }

    @Override
    public int getCurtidas() {
        return curtidas;
    }

    public void comentar(String comentario) {
    	System.out.println(comentario + " Este comentário foi adicionado na postagem.");
        this.comentarios.add(comentario);
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public Usuario getAutor() {
        return autor;
    }
}