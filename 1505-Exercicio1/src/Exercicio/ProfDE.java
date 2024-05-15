package Exercicio;

public class ProfDE extends Professor {

    public ProfDE(String nome, int matricula, int cargaHoraria) {
        super(nome, matricula, cargaHoraria);
    }

    @Override
    public void calcularBeneficio() {
        super.calcularBeneficio();
        System.out.println("Beneficio: "+ beneficio);
    }

}
