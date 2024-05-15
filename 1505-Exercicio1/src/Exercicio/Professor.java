package Exercicio;

public abstract class Professor {

    String nome;
     int matricula;
    int cargaHoraria;

    public Professor(String nome, int matricula, int cargaHoraria) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
    }
      protected double beneficio;

    public void calcularBeneficio() {
         beneficio=matricula*cargaHoraria; 
         
    }

    public double getBeneficio() {
        return beneficio;
    }

}
