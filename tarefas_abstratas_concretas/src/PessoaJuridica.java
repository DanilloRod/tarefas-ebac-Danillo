/**
 * @author danil
 */

/**
 * A classe PessoaJuridica representa uma entidade jurídica e herda os atributos
 * e métodos da classe abstrata Pessoa.
 */

public class PessoaJuridica extends Pessoa {

    //Atributo especifica da classe concreta
    private String cnpj;


    //Métodos getter e setter da variavel

    /**
     * Retorna o CNPJ
     * @return
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ
     * @param cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
