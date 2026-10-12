package fundamentos;



import java.util.Scanner;

class validadorCpf{

    Scanner scanner = new Scanner(System.in);

    // validador de cpf entrado um numero validar/formatar o cpf
    public void validaCampoCpf(String cpf){

        // enquanto não for digitado nada execute
        while (cpf.isBlank()){
            System.out.print("Por favor, Digite seu CPF: ");
            cpf = scanner.nextLine();
        }
        // eu quero impedir que o tamanho seja diferente de 11 digitos
        while(cpf.length() != 11 ){
            System.out.println("Digite 11 Digitos: ");
            System.out.print("Digite seu CPF: ");
            cpf = scanner.nextLine();
        }
        // caso o cpf ja vier em algum lugar com essas string coloque nada no campo
        cpf.replace(".","").replace("-","");

        // caso o cpf fique com todos os campos igual a 0
        while (cpf.equals("00000000000")){
            System.out.print("Digite os numeros do seu CPF: ");
            cpf = scanner.nextLine();
        }

        StringBuilder sb = new StringBuilder(cpf);

        sb.insert(3,".");
        sb.insert(7,".");
        sb.insert(11,"-");

        System.out.println(sb);
    }

}

public class Exercicio06 {
    static void main() {

        String valorCampo;

        Scanner scanner = new Scanner(System.in);
        validadorCpf cpfCliente = new validadorCpf();
        System.out.print("Digite seu CPF: ");
        valorCampo = scanner.nextLine();

        cpfCliente.validaCampoCpf(valorCampo);

        scanner.close();

    }
}
