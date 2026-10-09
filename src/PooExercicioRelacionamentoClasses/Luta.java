package PooExercicioRelacionamentoClasses;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("======= RESULTADO ===========");
                    System.out.println("Empatou");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    System.out.println("=============================");
                    break;
                case 1:
                    System.out.println("======= RESULTADO ===========");
                    System.out.println("Vitoria do "+this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    System.out.println("=============================");
                    break;
                case 2:
                    System.out.println("======= RESULTADO ===========");
                    System.out.println("Vitoria do "+this.getDesafiado().getNome());
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
                    System.out.println("=============================");
                    break;

            }
        }else {
            System.out.println("Esta luta não Pode Acontecer!");
        }

     }

}


