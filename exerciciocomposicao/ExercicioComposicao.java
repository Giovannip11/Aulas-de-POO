
package exerciciocomposicao;


public class ExercicioComposicao {

    
    public static void main(String[] args) {
        Conta minhaConta= new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
    }
    
}
