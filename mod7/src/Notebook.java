/**
 * @author danil
 */

/**
 * Criação de classe, representação de um objeto do mundo real
 */
public class Notebook {

    /**
     * propriedades do notebook
     */
    private String marca;
    private String modelo;
    private int valor;

    /**
     *
     * @param marca
     * @param modelo
     * @param valor
     */
    public Notebook(String marca, String modelo, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    /**
     * método usado para obter o valor do atributo, nesse caso, a marca do notebook
     * @return retorna a marca escolhida
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * método usado para armazenar o valor obtido
     * @param marca o método recebe o parametro marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * método usado para obter o valor do atributo, nesse caso, o modelo do notebook
     * @return retorna o modelo escolhida
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * método usado para armazenar o valor obtido
     * @param modelo o método recebe o parametro modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * método usado para obter o valor do atributo, nesse caso, o valor do notebook
     * @return retorna o valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * método usado para armazenar o valor obtido
     * @param valor o método recebe o parametro valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * método para receber as informações do notebook e exibir
     */
    public void notebookEscolhido() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor: " + valor + " " + "reais");
    }

    /**
     * método main para teste
     * @param args
     */
    public static void main(String[] args) {
        // criando um objeto Notebook com valores específicos
        Notebook meuNotebook = new Notebook("Lenono", "Ideapad3", 2599);
        meuNotebook.notebookEscolhido();
    }


}
