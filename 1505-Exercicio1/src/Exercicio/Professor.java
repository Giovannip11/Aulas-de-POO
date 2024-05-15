package Exercicio;

public abstract class Professor {

    String nome;
     int matricula;
    int cargaHoraria;
     double beneficio;

    public void calcularBeneficio() {
         beneficio=matricula*cargaHoraria; 
         
    }

    public double getBeneficio() {
        return beneficio;
    }

}
