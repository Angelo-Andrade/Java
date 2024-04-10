package pack_ex007_agenda;
public class Compromissos {
  private String data;
  private String hora;
  private String descricao;

  public Compromissos (String data, String hora, String descricao) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
  }
  
  public String getData () {
    return data;
  }
  
  public String getHora () {
    return hora;
  }
  
  public String getDescricao () {
    return descricao;
  }
}
