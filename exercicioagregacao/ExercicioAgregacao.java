
package exercicioagregacao;


public class ExercicioAgregacao {

    
    public static void main(String[] args) {
        Conta cc1 = new Conta ();
        Cliente CL1 = new Cliente("Giggio","Aracas","123-4");
        Cliente CL1 = new Cliente("Magic","EUA","323-2");
        Cliente CL1 = new Cliente("Lebron","EUA","232-3");
        cc1.c= CL1;
        cc1.numero =1;
        cc1.depositar(100);
        cc1.addCliente(CL1);
        cc1.addCliente(CL2);
        cc1.addCliente(CL3);

        for(Cliente c: cc1.cs){
            sout(c.nome);
        }
        
        if(cc1.sacar(50))
            System.out.println("Saque com sucesso");
        else
            System.out.println("Saldo insuficiente");
        
        CL1.nome="Giovanni";
        
        cc1.c = CL1;
        sout (cc1.c.CL1);
        
        System.out.println(cc1.c.nome);
    }
    
}
