package fundamentos;

public class Exercicio05 {
    static void main() {

        int idade[] = {60, 40, 50, 30};

        System.out.println("Temos "+idade.length+" pessoa no array");

        int menorIdade = idade[0];

        for(int valor:idade){
            if (menorIdade > valor){
                menorIdade = valor;
            }
        }

        System.out.println("A menor idade é "+menorIdade);

    }


}
