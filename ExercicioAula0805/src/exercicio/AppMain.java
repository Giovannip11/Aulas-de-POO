
package exercicio;


public class AppMain {
    public static void main(String[] args) {
        System.out.println("==Hipopotamo==");
        Hippo h = new Hippo();
        h.makeNoise();
        h.eat();
        h.sleep();
        
        System.out.println("==Cachorro==");
        Dog d = new Dog();
        d.makeNoise();
        d.eat();
        d.sleep();
        
        System.out.println("==Lobo==");
        Wolf w = new Wolf();
        w.makeNoise();
        w.eat();
        w.sleep();
    }
}
