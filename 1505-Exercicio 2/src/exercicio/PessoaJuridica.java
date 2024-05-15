package exercicio;

public class PessoaJuridica extends Pessoa {

    long cnpj;
    String razaoSocial;
    String nome_representante;

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("cnpj: " + cnpj);
        System.out.println("razao social: " + razaoSocial);
        System.out.println("nome do representante: " + nome_representante);
    }
}
