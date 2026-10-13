package fundamentos;

import java.util.Scanner;

public class MediaMetodo {

    public static double media(double a, double b, double c){

        return (a + b + c)/3;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        double n1,n2,n3,resultado;

        System.out.print("Digite sua primeira nota: ");
        while(!scanner.hasNextDouble()){
            System.out.print("Digite sua nota: ");
            scanner.next();
            }

        n1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        while(!scanner.hasNextDouble()){
            System.out.print("Digite sua nota: ");
            scanner.next();
        }

        n2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        while(!scanner.hasNextDouble()){
            System.out.print("Digite sua nota: ");
            scanner.next();
        }

        n3 = scanner.nextDouble();

        resultado = media(n1,n2,n3);

        if (resultado >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }


        }

    }


