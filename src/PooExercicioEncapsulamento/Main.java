package PooExercicioEncapsulamento;

public class Main {
    static void main() {
        ControleRemoto c = new ControleRemoto();
        // definindo o setLigado para true
        c.ligar();
        // trazendo o getLigado, getVolume , getTocando e as barrinhas
        c.abrirMenu();
        // desligando
        c.desligar();
        // ira aparecer mensagem de erro pois esta desligado
        c.maisVolume();
        c.pause();
        c.play();
        // alterando o atributo ligado foi alterado para true
        c.ligar();
        // não ira mais dar erro pois o atributo ligado foi mudado para true
        c.play();
        c.pause();





    }
}
