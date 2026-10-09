package PooExercicioRelacionamentoClasses;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double peso, altura;

    public Lutador(String nome, String nacionalidade , int idade, int vitorias, int derrotas, int empates, double peso, double altura) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if ( this.getPeso() < 52.2){
            this.categoria = "Invalido";
        } else if (this.getPeso() <=70.3) {
            this.categoria ="Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "Entrada Invalida";
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public void status(){
        System.out.println("Lutardor: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+"Anos");
        System.out.println(this.getAltura()+"m de Altura");
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empate: "+this.getEmpates());
        System.out.println("========================================");
    }
    public void apresentar(){
        System.out.println("======== Ficha Técnica ===========");
        System.out.println("O Lutardor: "+this.getNome());
        System.out.println("de Origem: "+this.getNacionalidade());
        System.out.println("e com "+this.getIdade()+" Anos de idade");
        System.out.println("possui "+this.getAltura()+"m de Altura");
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("e Empatou: "+this.getEmpates());
        System.out.println("===================================");
    }
    }





