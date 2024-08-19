import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cities = new String[3];
        cities[0] = "Campinas";
        cities[1] = "Hortolândia";
        cities[2] = "Sumaré";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Digite a cidade que deseja adicionar (ou digite \\p para parar): ");
                String input = reader.readLine();

                if (input.equals("\\p")) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                if (input.isEmpty() || Arrays.asList(cities).contains(input)) {
                    System.out.println("Erro: Nome inválido ou cidade já existe no array.");
                } else {
                    // Adicionar a nova cidade ao array
                    cities = addCity(cities, input);
                    System.out.println("Cidade adicionada com sucesso!");
                }

                System.out.println("Array de cidades: " + Arrays.toString(cities));

            } catch (IOException e) {
                System.out.println("Erro na leitura da entrada.");
            }
        }
    }

    private static String[] addCity(String[] cities, String newCity) {
        String[] newCities = Arrays.copyOf(cities, cities.length + 1);
        newCities[newCities.length - 1] = newCity;
        return newCities;
    }
}
