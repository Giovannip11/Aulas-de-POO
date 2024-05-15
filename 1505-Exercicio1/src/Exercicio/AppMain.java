
package Exercicio;


public class AppMain {
    public static void main(String[] args) {
        ProfDE PD = new ProfDE("Giovanni", 40, 5);
        
        
        PD.calcularBeneficio();
        
        
        ProfHorista PH = new ProfHorista("Max", 50, 4);
        
        
        PH.calcularBeneficio();
    }
}
