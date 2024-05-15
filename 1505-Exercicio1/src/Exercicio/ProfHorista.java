package Exercicio;

public class ProfHorista extends Professor {

    private double valorHora;

    public ProfHorista(String nome, int matricula, int cargaHoraria) {
        super(nome, matricula, cargaHoraria);
    }

    @Override
    public void calcularBeneficio() {
        super.calcularBeneficio();
        System.out.println("Beneficio: " + beneficio);
    }
}
