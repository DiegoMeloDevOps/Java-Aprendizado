package PooExercicio5;
import java.util.Scanner;

class Somar{
    double a,b;

    public double soma(double a, double b){
        return a + b;
    }

}

class Subtrair{
    double a,b;

    public double subtrai(double a, double b){
        return a - b;
    }
}

class Dividir{
    double a,b;

    public double dividi(double a, double b){
        return a / b;
    }
}

class Multiplicar{
    double a,b;

    public double multiplica(double a, double b){
        return a * b;
    }
}

public class Main
{
    static void main() {

        //variaveis
        String resposta;
        double resultado;

        // objetos instanciados/criados
        Scanner scanner = new Scanner(System.in);
        Somar so = new Somar();
        Subtrair su = new Subtrair();
        Dividir di = new Dividir();
        Multiplicar mu = new Multiplicar();

        System.out.println("========= Calculadora =========");
        System.out.println("Digite uma opção: ");
        System.out.println("somar ");
        System.out.println("subtrair ");
        System.out.println("dividir ");
        System.out.println("multiplicar ");
        System.out.print("Digite uma resposta: ");
        resposta = scanner.nextLine().toLowerCase();

        while(!resposta.equals("somar") && !resposta.equals("subtrair") && !resposta.equals("dividir") && !resposta.equals("multiplicar"))
        {
            System.out.println("====== ERRO =========");
            System.out.println("Valor incorreto! digite novamente!: ");
            System.out.println("Digite uma opção: ");
            System.out.println("somar ");
            System.out.println("subtrair ");
            System.out.println("dividir ");
            System.out.println("multiplicar ");
            System.out.print("Digite uma resposta: ");
            resposta = scanner.nextLine().toLowerCase();
        }
            switch (resposta) {

                case "somar":
                    System.out.println("===== SOMAR ====");
                    System.out.print("Digite o primeiro valor: ");
                    while (!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o primeiro valor: ");
                    }
                    so.a = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    while(!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o segundo valor: ");
                    }
                    so.b = scanner.nextDouble();
                    resultado = so.soma(so.a, so.b);
                    System.out.println("O resultado de "+so.a+" + "+so.b+" = "+resultado);

                    break;

                case "subtrair":
                    System.out.print("Digite o primeiro valor: ");
                    while(!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o primeiro valor: ");
                    }
                    su.a = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    while(!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o segundo valor: ");
                    }
                    su.b = scanner.nextDouble();
                    resultado = su.subtrai(su.a , su.b);
                    System.out.println("O resultado de "+su.a+" - "+su.b+" = "+resultado);
                    break;

                case "dividir":
                    System.out.print("Digite o primeiro valor:");
                    while (!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o primeiro valor:");
                    }
                    di.a = scanner.nextDouble();
                    System.out.print("Digite o segundo valor:");
                    while (!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o segundo valor:");
                    }

                    di.b = scanner.nextDouble();
                    resultado = di.dividi(di.a, di.b);
                    System.out.println("O resultado de "+di.a+" / "+di.b+" = "+ resultado);
                    break;

                case "multiplicar":
                    System.out.print("Digite o primeiro valor: ");
                    while (!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.print("Digite o Primeiro valor: ");
                    }
                    mu.a = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    while (!scanner.hasNextDouble()){
                        System.out.println("Digite somente numeros !!!");
                        scanner.next();
                        System.out.println("Digite o segundo valor: ");
                    }
                    mu.b = scanner.nextDouble();
                    resultado = mu.multiplica(mu.a, mu.b);
                    System.out.println("O resultado de "+mu.a+" x "+mu.b+" = "+ resultado);
                    break;
            }
        }
    }



