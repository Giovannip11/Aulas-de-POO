package Aula;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("==SerVivo==");
        SerVivo sv = new SerVivo();
        sv.tamanho = 10;
        sv.nascer();
        sv.crescer();
        sv.morrer();
        
        
        System.out.println("==Animal==");
        Animal an = new Animal();
        an.sexo = "M";
        an.mover();
        an.respirar();
        an.nascer();
        an.crescer();
        an.morrer();
        
        System.out.println("==Mamifero==");
        Mamifero ma = new Mamifero();
        ma.nascer();
        ma.respirar();
        
        
        
        System.out.println("==Peixe==");
        Peixe px = new Peixe();
        px.nascer();
        px.mover();
        px.respirar();
    }

}
