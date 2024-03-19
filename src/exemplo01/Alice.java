package exemplo01;

import java.util.Random;

public class Alice {

    float tamanho;
    String corDoCabelo;
    int posX, posY, posZ;

   boolean move() {
        InOut.MsgDeInformacao("Alice", "move()");
         return true;
    }

    void turn() {
           Random rd = new Random();
        
        if(rd.nextInt(10)>= 5)
            InOut.MsgDeInformacao("Alice", "turn() - Direita");
        else    
           InOut.MsgDeInformacao("Alice", "turn() - Esquerda");
        String resul = (rd.nextInt(10)>= 5) ? "turn() - Direita": "turn( - Esquerda";
        InOut.MsgDeInformacao("Alice", resul);
    }

    void say(String texto) {
            InOut.MsgDeInformacao("Alice", texto);
    }

}
