
package imc;


public class IMC {

  
    public static void main(String[] args) {
                float IMC;
                float H;
                float P;
                
               H = InOut.leFloat("Digite a sua altura em metros.");
               P = InOut.leFloat("Digite seu peso em KG");
               
               
               if(P<0 || H<=0){
                   InOut.MsgDeErro("Erro", "Digite apenas números Positivos");
               }else{
                  IMC = P /(H*H);
               
               if(18.5>=IMC || IMC<=25.0){
                   InOut.MsgDeAviso("IMC: ", "Seu IMC é normal");
               }else if(IMC>25.0){
                   InOut.MsgDeAviso("IMC", "Seu IMC é acima do peso");
               }else {
                   InOut.MsgDeAviso("IMc", "Seu IMC é abaixo do peso");
               }
               
    }
    }
    
}
