
package exercicio;


public class AppMain {
    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica();
        pf.nome = "Giovanni";
        pf.cpf = (long) 32.455;
        pf.endereco = "Rua leitão da sila 11";
        pf.telefone ="1234546";
        pf.estadoCivil=1;
        
        pf.exibirDados();
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.cnpj= (long) 34.555;
        pj.endereco="Rua beija-flor 60";
        pj.nome = "Rodolfo";
        pj.nome_representante="Rodolfo";
        pj.telefone = "22231232146363";
        pj.razaoSocial="Sla lek";
        
        pj.exibirDados();
        
                
    }
}
