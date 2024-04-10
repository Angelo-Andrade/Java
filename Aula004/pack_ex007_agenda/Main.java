import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) {
		Agenda a = new Agenda();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;
		
		do {
      System.out.printf("\nMenu:\n\tDigite o número de acordo com a função\n\t1 -- Adicionar compromisso" +
          "\n\t2 -- Filtrar compromissos por data\n\t3 -- Encerrar agenda");
      
      int op = 0;
      try {
        op = Integer.parseInt(br.readLine());
  
        if (op < 1 || op > 3) {
          throw new Exception("Valor digitado inválido");
        }
        
        switch (op) {
          case 1:
            System.out.println("\n\nDigite a data do compromisso:");
            String data = br.readLine();
            System.out.println("Digite a hora do compromisso:");
            String hora = br.readLine();
            System.out.println("Digite a descrição do compromisso:");
            String descricao = br.readLine();
            a.setCompromisso(data, hora, descricao);
            break;
            
          case 2:
            System.out.println("\n\nDigite a data para filtrar os compromissos:");
            String queryData = br.readLine();
            List<Compromissos> b = a.getListByDate(queryData);
            
          	for(Compromissos c : b) {
          	  System.out.printf("\nData: %s\nHora: %s\nDescrição: %s\n", c.getData(), c.getHora(), c.getDescricao());
          	}
            break;
            
          case 3:
            System.out.println("\nEncerrando agenda...");
            loop = false; 
            break;
            
          default:
            System.out.println("\nOpção inválida.");
            break;
        }
      }
      catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
        continue;
      }
    } while (loop);
  }
}
