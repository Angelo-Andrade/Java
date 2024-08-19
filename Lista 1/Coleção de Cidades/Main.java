import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Campinas");
        cities.add("Hortolândia");
        cities.add("Sumaré");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Digite a cidade que deseja adicionar (ou digite \\p para parar): ");
                String city = r.readLine();

                if (input.equals("\\p")) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                if (input.isEmpty() || cities.contains(city)) {
                    System.out.println("Erro: Nome inválido ou cidade já existe na lista.");
                } else {
                    cities.add(city);
                    System.out.println("Cidade adicionada com sucesso!");
                }

                System.out.println("Lista de cidades: " + cities);

            } catch (IOException e) {
                System.out.println("Erro na leitura da entrada.");
            }
        }
    }
}
