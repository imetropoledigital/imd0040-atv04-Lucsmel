package br.ufrn.imd;

public class Gerente extends Funcionario {

    public enum Nivel {
        JUNIOR(1000), PLENO(2000), SENIOR(3000);

        private double bonus;

        private Nivel(double bonus){
            this.bonus = bonus;
        }

        public double getBonus(){
            return bonus;
        }
    }

    protected Nivel nivel;

    Gerente(int chMensal, double hh, Nivel nivel){
        super(chMensal, hh);
        this.nivel = nivel;
    }

    public double calcularSalario(){
        return super.calcularSalario() + nivel.getBonus();
    }

}
