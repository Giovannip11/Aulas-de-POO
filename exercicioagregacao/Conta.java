
package exercicioagregacao;


public class Conta {
    public double saldo;
    public int numero; 
   // public Cliente c;
    List<Cliente> cs = new ArrayList()
    void addCliente(Cliente c){
         cs.add(c);
    }
    void delCliente(CLiente c){
     cs.remove(c);
    }
    
   public boolean sacar(double valor){
        if(verificarTransacao){
         saldo-=valor;
            return true;
        }else{ return false;
    }
    }
   void depositar (double valor){
       saldo+= valor;
   }
  void transfere(double valor, Conta destino){
      this.sacar(valor);
      destino.depositar(valor);
   }

   private boolean verificarTransacao(double valor){
    //if(saldo > valor){
      //  return true;}else{return false;}
        //or
    return saldo > valor;
        
    
    }
}
