package Poo.PooExercicioHeranca;

public class Teste {
    static void main() {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // a classe aluno herdou da classe pessoa o atributo nome
        // atributo que é comum tanto para a classe professo quanto aluno
        aluno.setNome("Diego");
        System.out.println(aluno.getNome());

        professor.setNome("Viviane");
        System.out.println(professor.getNome());


    }
}
