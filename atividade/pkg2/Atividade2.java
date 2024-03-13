
package atividade.pkg2;


public class Atividade2 {

    
    public static void main(String[] args) {
         double pesoTotal=0 ;
         double pesoMÁX= Double.MIN_VALUE;
         double pesoMIN= Double.MAX_VALUE;
         int qtdBois = 0;
         double peso;
       
      while(true){
          peso = InOut.leFloat("Digite o peso do boi(kg)");
          if (peso < 0){
              break;
          }
          qtdBois++;
          pesoTotal += peso;
           if(peso > pesoMÁX){
               pesoMÁX = peso;
           }
           if (peso < pesoMIN){
               pesoMIN = peso;
           }
          
          }
      if(qtdBois == 0){
          InOut.MsgDeInformacao("Informação", "Nenhum boi foi registrado");
      }else{
          double media = pesoTotal / qtdBois;
          InOut.MsgDeInformacao("Resultado", "Peso médio do rebanho é: "+ media + "kg");
          InOut.MsgDeInformacao("Resultado", "Peso do boi mais gorddo é: " + pesoMÁX + "kg");
          InOut.MsgDeInformacao("Resultado", "Peso do boi mais leve é: " + pesoMIN + "kg");
      }
        
        
   
    }
    
}
