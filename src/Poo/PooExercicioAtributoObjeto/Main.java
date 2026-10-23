package Poo.PooExercicioAtributoObjeto;

public class Main {
    static void main() {
        // criei 2 objetos a partir da classe contato e classe enderco
        Contato contato = new Contato();
        Endereco endereco = new Endereco();

        // settei um valor ao atributo nome rua
        endereco.setNomeRua("Rua dos bobos");
        // passei para o atributo endereco que é um atributo do tipo Objeto da classe contato o valor que esta no atributo nomeRua do objeto endereco
        contato.setEndereco(endereco);
        // mostre na tela o valor do atributo endereco que é um tipo objeto endereco da classe endereco e o seu valor de atributio que esta atribuido no nomeRua
        System.out.print(contato.getEndereco().getNomeRua());

    }
}
