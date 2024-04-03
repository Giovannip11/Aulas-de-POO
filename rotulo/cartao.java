
package rotulo;

public class cartao {
    Rotulo t1 = new Rotulo(1);
    Rotulo t2 = new Rotulo(2);
    Rotulo t3 = new Rotulo(3);
    
    cartao(){
        System.out.println("Cartao()");
        t3 = new Rotulo(33);
    }
    void f(){
        System.out.println("f()");
    }
}
