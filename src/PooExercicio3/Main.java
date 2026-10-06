package PooExercicio3;

import java.util.SortedMap;

public class Main {
    static void main() {
        Computador computador = new Computador("Intel", "11-ff-22-bb", "Intel");
        computador.info();
        computador.checkUp();
        System.out.println("ligando computador...aguarde");
        computador.ligado();
        computador.checkUp();

    }

}
