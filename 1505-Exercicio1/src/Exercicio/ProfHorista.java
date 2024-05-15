package Exercicio;

public class ProfHorista extends Professor {

    private double valorHora;

    @Override
    public void calcularBeneficio() {
        super.calcularBeneficio();
        System.out.println("Beneficio: " + beneficio);
    }
}
