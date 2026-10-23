package fundamentos;

public class ExercicioTryCatch {

    static void main() {


        try {

            int vetor[] = new int[4];

            System.out.println("antes da exception");

            vetor[4] = 1;

            System.out.println("Não sera impresso");


        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");

    }

}
