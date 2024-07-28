/**
 * @author danil
 */

public class Programa {

    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {

        // Criando e configurando uma pessoa física
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Danillo");
        pf.setSobrenome("Rodrigues");
        pf.setIdade(26);
        pf.setCpf("123.456.789-10");

        // Exibindo informações da pessoa física
        System.out.println(pf.getNome() + " está cadastrado/a no CPF: " + pf.getCpf());

        // Criando e configurando uma pessoa jurídica
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Vinicius");
        pj.setSobrenome("De Moraes");
        pj.setIdade(31);
        pj.setCnpj("12.345.678/0009-10");

        // Exibindo informações da pessoa jurídica
        System.out.println(pj.getNome() + " está cadastrado/a no CNPJ: " + pj.getCnpj());
    }
}
