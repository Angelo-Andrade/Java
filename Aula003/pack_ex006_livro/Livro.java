package pack_ex006_livro;
import java.util.Scanner;

public class Livro {
    private int paginaAtual;
    private int paginas;

    public Livro(int paginas) {
        this.paginas = paginas;
        this.paginaAtual = 1;
    }

    public void lerPagina() {
        Scanner ler = new Scanner(System.in); 
        
        while(paginaAtual != paginas) {
            System.out.println("\nPara finalizar a leitura, basta ir para a última página do livro."
                    + " O livro contém apenas " + paginas + " páginas!");
            System.out.print("\nDigite a página que deseja ler: ");
            paginaAtual = ler.nextInt();
            try {
                if(paginaAtual > paginas || paginaAtual < 1) {
                    throw new Exception("\nImpossível efetuar a leitura.\n"
                            + "O livro contém apenas " + paginas + " páginas!\n");
                }
                else {
                    System.out.println("\nPágina lida por completo!\n");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("\nLeitura finalizada!");
        ler.close();
    }

}
