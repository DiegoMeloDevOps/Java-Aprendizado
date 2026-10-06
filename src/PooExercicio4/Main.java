package PooExercicio4;
import java.util.Scanner;

public class Main {
    static void main() {
        Banco c1 = new Banco();

        Scanner scanner = new Scanner(System.in);
        c1.abrirConta();

        System.out.print("Digite seu deposito: ");
        c1.setDeposito(scanner.nextDouble());

        c1.depositar();

        System.out.print("Digite seu saque: ");
        c1.setSaque(scanner.nextDouble());


        c1.sacar();
        c1.pagarMensal();

        c1.fecharConta();

    }
}
