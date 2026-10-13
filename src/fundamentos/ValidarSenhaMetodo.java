package fundamentos;

import java.util.Scanner;

public class ValidarSenhaMetodo {
    public static boolean validaSenha(String senha){

        return senha.length() > 8;

    }

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senhaUsuario = scanner.nextLine();

        boolean verificador = validaSenha(senhaUsuario);

        while(!verificador){
            System.out.println("Digite uma senha com 8 digitos: ");
            scanner.next();
            senhaUsuario = scanner.nextLine();
            verificador = validaSenha(senhaUsuario);
        }

        System.out.println("Senha definida com sucesso!");

    }

}
