package Poo.ExercicioHeranca;

public abstract class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodos abstratos na classe mãe deixa para as classe que irão utilizar o metodo fazer sua implementação
    // de como ela ira funcionar na classe filha/ que herda
    public abstract void emitirSom();

}
