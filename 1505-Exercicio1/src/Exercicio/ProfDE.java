package Exercicio;

public class ProfDE extends Professor {

    @Override
    public void calcularBeneficio() {
        super.calcularBeneficio();
        System.out.println("Beneficio: "+ beneficio);
    }

}
