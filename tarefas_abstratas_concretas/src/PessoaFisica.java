/**
 * @author danil
 */
/**
 * A classe PessoaFisica representa uma entidade jurídica e herda os atributos
 * e métodos da classe abstrata Pessoa.
 */

public class PessoaFisica extends Pessoa {

    //Declarando variavel especifica da classe
    private String cpf;


    //Métodos getter e setter

    /**
     * Retorna o CPF da pessoa física
     * @return
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
