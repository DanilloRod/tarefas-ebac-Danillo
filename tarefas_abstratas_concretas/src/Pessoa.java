/**
 * @author danil
 */
/**
 * Classe abstrata que serve como classe pai para as classes concretas
 * de pessoas, como PessoaFisica e Pessoa Juridica
// */
public abstract class Pessoa {

    //Declaração de atributos comuns a todas as pessoas
    private String nome;

    private String sobrenome;

    private int idade;



    //Declarando métodos getters e setters para as variáveis
    /**
     * Retorna o nome da pessoa.
     *
     * @return o nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome o nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o sobrenome da pessoa.
     *
     * @return o sobrenome da pessoa.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     *
     * @param sobrenome o sobrenome a ser definido.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Retorna a idade da pessoa.
     *
     * @return a idade da pessoa.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param idade a idade a ser definida.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}