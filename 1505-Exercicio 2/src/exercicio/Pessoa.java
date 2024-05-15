
package exercicio;


public abstract class Pessoa {
    String nome;
    String endereco;
    String telefone;
    
    
    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("endereco: "+ endereco);
        System.out.println("telefone: "+ telefone);
    }
    
    
}
