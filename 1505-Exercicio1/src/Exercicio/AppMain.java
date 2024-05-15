
package Exercicio;


public class AppMain {
    public static void main(String[] args) {
        ProfDE PD = new ProfDE();
        PD.nome="Giovanni";
        PD.matricula=40;
        PD.beneficio=5;
        PD.cargaHoraria=7;
        
        PD.calcularBeneficio();
        
        
        ProfHorista PH = new ProfHorista();
        PH.nome="Max";
        PH.matricula=50;
        PH.beneficio=4;
        PH.cargaHoraria=6;
        
        PH.calcularBeneficio();
    }
}
