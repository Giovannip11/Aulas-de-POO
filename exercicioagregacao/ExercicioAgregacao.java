
package exercicioagregacao;


public class ExercicioAgregacao {

    
    public static void main(String[] args) {
        Conta cc1 = new Conta ();
        Cliente CL1 = new Cliente();
        
        cc1.numero =1;
        cc1.depositar(100);
        
        if(cc1.sacar(50))
            System.out.println("Saque com sucesso");
        else
            System.out.println("Saldo insuficiente");
        
        CL1.nome="Giovanni";
        
        cc1.c = CL1;
        
        System.out.println(cc1.c.nome);
    }
    
}
