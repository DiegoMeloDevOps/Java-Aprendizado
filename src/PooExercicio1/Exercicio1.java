package PooExercicio1;

public class Exercicio1 {
    static void main() {
        // Instanciando o objeto c1 atraves de uma classe Caneta
        Caneta c1 = new Caneta();
        // objeto + atributo
        c1.marca = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 10;

        // objeto + metodo
        c1.tampada();
        c1.status();
        c1.rabiscar();

        System.out.println("===============");

        Caneta c2 = new Caneta();

        c2.marca = "BIC";
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.carga = 50;

        c2.destampada();
        c2.status();
        c2.rabiscar();

    }
}
