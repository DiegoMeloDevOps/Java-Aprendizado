package Poo.PooExercicioAtributoObjeto;

public class Contato {

    private String nome;
    // alem dos tipos primitivos temos tambem o tipo Objeto
    // criamos uma classe e passamos como atributo aquela classe
    private  Endereco endereco;
    private  Telefone[] telefones;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
