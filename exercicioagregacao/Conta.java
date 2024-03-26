
package exercicioagregacao;


public class Conta {
    public double saldo;
    public int numero; 
    public Cliente c;
    
   public boolean sacar(double valor){
        return true;
    }
   void depositar (double valor){
       saldo+= valor;
   }
   public double transfere(double Conta){
       return Conta;
   }
    
}
