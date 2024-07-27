import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author danil
 */

public class ArrayNomeSexo {

    public static void main(String[] args) {
        listaNomeSexo(); // Chama o método para obter nomes e sexo e agrupar de acordo com o sexo
    }

    private static void listaNomeSexo() {
        // Mensagem inicial para o usuário sobre o formato da entrada esperada
        System.out.println("Digite o nome e sexo (M/F) da seguinte forma: {Nome - Sexo}");
        Scanner sc = new Scanner(System.in); // Scanner para entrada do usuário

        // Lendo a linha de entrada que contém os nomes e sexos
        String entrada = sc.nextLine();

        // Divide a entrada em partes individuais usando vírgulas
        String[] arrayNomes = entrada.split(",");

        // Listas para armazenar os nomes de acordo com o sexo
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        // Processa cada par {Nome - Sexo}
        for (String par : arrayNomes) {
            par = par.trim(); // Remove espaços em branco ao redor da string

            // Separa o nome e o sexo usando o traço como delimitador
            String[] array = par.split("-");

            // Verifica se a divisão gerou exatamente duas partes
            if (array.length == 2) {
                String nome = array[0].trim(); // Obtém o nome e remove espaços extras
                String sexo = array[1].trim().toUpperCase(); // Obtém o sexo e converte para maiúsculo

                // Verifica o sexo e adiciona o nome à lista apropriada
                if (sexo.equals("M")) {
                    nomesMasculinos.add(nome);
                } else if (sexo.equals("F")) {
                    nomesFemininos.add(nome);
                }
            }
        }

        // Exibe a lista de nomes masculinos
        System.out.println("Lista de nomes do sexo masculino:");
        nomesMasculinos.forEach(System.out::println);

        // Exibe a lista de nomes femininos
        System.out.println("Lista de nomes do sexo feminino:");
        nomesFemininos.forEach(System.out::println);

        sc.close(); // Fecha o scanner para liberar os recursos
    }
}
