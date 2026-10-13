package fundamentos;

public class ArrayCarros {
    static void main() {


    // array             0        1       2         3
    String carros[] = {"volvo", "bmw", "ford," , "ferrari"};
    // alternando o valor em uma posição
    carros[0] = "opala";

    String donos[] = {"Diego", "Fulano", "Pedro", "Marcos"};

    System.out.println("Neste array temos: "+carros.length+" Carros");

    // lacço for para perrcorrer um array
    for (int i = 0; i < carros.length; i++){

        // usando o iterador para mostrar o valores armazenados no mesmo indice
        System.out.println("O dono do carro "+carros[i]+" é o "+donos[i]);

    }




    }
}
