package pack_ex007_agenda;
import java.util.List;
import java.util.ArrayList;

public class Agenda {
  private List<Compromissos> lista;
  
	public Agenda () {
	  lista = new ArrayList<Compromissos>();
	}
	
	public void setCompromisso (String data, String hora, String descricao) {
	  Compromissos n = new Compromissos(data, hora, descricao);
	  lista.add(n);
	}
	
	public List getListByDate (String data) {
	  List<Compromissos> ListByDate = new ArrayList<Compromissos>();
	  for(Compromissos compromisso : lista) {
	    if(compromisso.getData() == data) {
	      ListByDate.add(compromisso);
	    }
	  }
	  return ListByDate;
	}
}
