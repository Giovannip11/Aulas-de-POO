
package atividade.pkg2;


public class Atividade2 {

    
    public static void main(String[] args) {
        float pesoTotal=0 ;
         Float pesoMÁX= Float.MIN_VALUE;
         Float pesoMIN= Float.MAX_VALUE;
         int qtdBois = 0;
         float peso;
         float media = pesoTotal / qtdBois;
       
      while(true){
          peso = InOut.leFloat("Digite o peso do boi(kg)");
          if (peso <= 0){
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
          
          InOut.MsgDeInformacao("Resultado", "Peso médio do rebanho é: "+ media + "kg");
          InOut.MsgDeInformacao("Resultado", "Peso do boi mais gordo é: " + pesoMÁX + "kg");
          InOut.MsgDeInformacao("Resultado", "Peso do boi mais leve é: " + pesoMIN + "kg");
      }
        
        
   
    }
    
}
