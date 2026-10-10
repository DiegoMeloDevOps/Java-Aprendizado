package fundamentos;


import java.util.Scanner;

public class Exercicio02 {
    static void main() {

        String Nome; // string do tipo texto
        int idade;  // tipo inteiro
        double altura, calculo, peso; // tipo real
        boolean saude;

        // classe scanner para receber entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        Nome = scanner.nextLine(); // nextline para texto

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt(); // nextInt para inteiro

        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble(); // nextDouble para real

        calculo = peso / ( 2 * altura);












    }


}


