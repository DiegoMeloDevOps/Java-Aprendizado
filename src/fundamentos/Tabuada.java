package fundamentos;

import java.util.Scanner;

public class Tabuada {
    static void main() {

    int a,b;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero que queira saber a tabuada: ");
    // metodos que verifica se tem string ou double. enqto for false faça a repetição do laço
    while(!scanner.hasNextInt()){
        System.out.println("Digite apenas numeros inteiros !!!");
        // para n entrar em loop infinito , é como se eu digitasse enter
        scanner.next();
        System.out.print("Digite um numero que queira saber a tabuada: ");
    }

    // atribui após confirmação do laço que o valor inserido era inteiro
    a = scanner.nextInt();

    System.out.print("Digite até onde quer saber: ");
    while(!scanner.hasNextInt()){
        System.out.println("Digite apenas numeros inteiros !!!");
        scanner.next();
        System.out.print("Digite um numero que queira saber a tabuada: ");
    }

    b = scanner.nextInt();
    System.out.println(" =========== TABUADA DO NUMERO "+a+" ===========");
    for (int i = 1; i <=b; i++){
        System.out.println(a+" x "+i+" = "+ a*i);
    }


    }


}
