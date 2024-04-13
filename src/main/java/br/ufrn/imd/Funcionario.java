package br.ufrn.imd;

public class Funcionario {

    protected int chMensal;
    protected double hh;

    Funcionario(int chMensal, double hh){
        this.chMensal = chMensal;
        this.hh = hh;
    }

    double calcularSalario(){
        return chMensal * hh;
    }

}
