package PooExercicioRelacionamentoClasses;

import java.util.Random;

public class Main {
    static void main() {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pedro", "França", 31, 11, 2, 1, 68.9, 1.75);
        l[1] = new Lutador("João", "Canada", 28, 15, 3, 0, 60.5, 1.65);
        l[2] = new Lutador("Pietro", "China", 29, 18, 5, 1, 80.8, 1.95);
        l[3] = new Lutador("Douglas", "Inglaterra", 28, 22, 7, 1, 90.9, 1.90);
        l[4] = new Lutador("Paulo", "Holanda", 27, 10, 9, 0, 120.0, 1.90);
        l[5] = new Lutador("Gael", "Brasil", 26, 15, 11, 1, 68.9, 1.70);


        Luta luta1 = new Luta();
        luta1.marcarLuta(l[1], l[0]);
        luta1.lutar();
        if (luta1.getAprovada()) {
            l[0].status();
            l[1].status();
        }

    }
}
