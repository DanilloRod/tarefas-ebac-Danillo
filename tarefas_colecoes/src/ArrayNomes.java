import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author danil
 */

public class ArrayNomes {

    public static void main(String[] args) {
        listaArray(); // Chama o método para obter e ordenar os nomes

    }

    private static void listaArray() {
        Scanner sc = new Scanner(System.in); // Cria um scanner para ler a entrada do usuário
        ArrayList<String> nomes = new ArrayList<>(); // Cria uma lista dinâmica para armazenar os nomes

        // Mensagem solicitando ao usuário que insira os nomes
        System.out.println("Digite os nomes separados por vírgulas: ");
        String nome = sc.nextLine(); // Lê a linha de entrada do usuário contendo os nomes
        String[] arrayNomes = nome.split(","); // Divide a linha em nomes individuais usando vírgulas como delimitadores

        // Adiciona os nomes separados ao ArrayList
        Collections.addAll(nomes, arrayNomes);

        // Ordena a lista de nomes em ordem alfabética
        Collections.sort(nomes);

        // Exibe a lista de nomes ordenados
        System.out.println("Lista de nomes em ordem alfabética:");
        nomes.forEach(System.out::println); // Para cada nome na lista, imprime o nome

        sc.close(); // Fecha o scanner para liberar os recursos
    }


}
