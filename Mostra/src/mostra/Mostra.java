
package mostra;


public class Mostra {
     static void MostraNome(Fulano r){
         System.out.println("***> "+r.Nome()+" <***");
     }
     
     public static void main(String[] args) {
        Fulano f = new Fulano();
        Cicrano c = new Cicrano();
        Beltrano b = new  Beltrano();
        
        MostraNome(f);
        MostraNome(c);
        MostraNome(b);
    }
     
}
