package fundamentos;

import java.util.Scanner;

public class EhPar {

    public static int ehPar(int numero){

        if (numero % 2 == 0){
            System.out.println("O numero: "+numero+" é par!");
        }else {
           System.out.println("O numero: "+numero+" é Impar!");
        }

        return numero;
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = scanner.nextInt();
        int resposta = ehPar(valor);
    }

}
