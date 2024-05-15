
package exercicio;


public class  PessoaFisica extends Pessoa {
    long cpf;
    int estadoCivil;
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("cpf: "+ cpf);
        System.out.println("estado Civil: "+estadoCivil);
    }
}
