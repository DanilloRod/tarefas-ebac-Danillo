import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author danil
 */



public class LinkedListNome {

    public static void main(String[] args) {
        List<Nome> lista = inserirNomeLista();
        listaAniversario(lista);
    }

    private static void listaAniversario(List<Nome> lista) {
        System.out.println("Lista de Aniversário (em ordem alfabética)");

        Collections.sort(lista); // Ordena a lista em ordem alfabética

        for (Nome nome : lista) {
            System.out.println(nome);
        }
        System.out.println(""); // Linha em branco para espaçamento
    }

    public static List<Nome> inserirNomeLista() {
        System.out.println("Vamos fazer a sua lista de convidados para o seu aniversário?");
        Scanner sc = new Scanner(System.in);
        List<Nome> lista = new LinkedList<>();

        String nomeDigitado;
        String continuar;

        do {
            System.out.println("Digite o nome de quem você quer convidar: ");
            nomeDigitado = sc.nextLine();
            Nome nome = new Nome(nomeDigitado);
            lista.add(nome);

            System.out.println("Deseja continuar? (Sim/Não)");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("Sim"));

        System.out.println("Fim da lista.");
        return lista;
    }
}
