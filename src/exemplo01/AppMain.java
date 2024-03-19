
package exemplo01;


public class AppMain {
    public static void main(String[] args) {
          
        int idade = 28;
        Alice obj01 = new Alice ();
        
        obj01.corDoCabelo = "Rosa";
        obj01.posX = 10;
        obj01.posY = 20;
        obj01.posZ = 30;
        
        obj01.move();
        obj01.turn();
        obj01.say("BUUUUUUUUUU");
        obj01.say("Boa n o i t e !!!");
               
        InOut.MsgDeAviso("Qual a cor do cabelo?", "É " + obj01.corDoCabelo);
        
    }
}
