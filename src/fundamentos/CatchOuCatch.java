package fundamentos;

public class CatchOuCatch {

    static void main() {
        int numeros[] = {4, 8, 16, 32, 64, 128};
        int denominadores[] = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                for (int x = 0; x < numeros.length; i++) {
                    System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Ocorreu um erro! ");
            }
        }


    }
}
