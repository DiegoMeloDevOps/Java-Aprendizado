package PooExercicio2;

public class Main {

    static void main() {

        Carro carro = new Carro();

        carro.ano = 2001;
        carro.marca = "Corsa";
        carro.pneus = 4;
        // variaveis do tipo protected nao podemo atribuir um valor diretamente
        // podemos passar valores a ela atraves de metodos publicos
        // carro.quilometragem = 0.0;
        carro.dono = "Fábio";
        carro.funcionando();

        carro.info();

        carro.status();

        Carro carro2 = new Carro();

        carro2.ano = 2021;
        carro2.marca = "Civic";
        carro2.pneus = 4;
       // carro2.quilometragem = 0.0;
        carro2.dono = "Flavio";
        carro2.quebrado();

        carro2.info();

        carro2.status();

    }

}
