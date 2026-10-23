package fundamentos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSetNomes {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> nomes = new HashSet<>();

        for(int i = 0; i<= 4; i++){
            System.out.print("Digite o "+(i+1)+" Nome: ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Os Nomes são: "+ nomes);


    }
}

