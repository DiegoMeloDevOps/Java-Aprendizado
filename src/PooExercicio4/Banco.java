package PooExercicio4;

import java.util.Scanner;
import java.util.Random; // classe de numeros randomicos

public class Banco {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // atributos
    public int numConta;
    protected char tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private double deposito;
    private double saque;
    private double mensalidade = 12.00;
    public char resposta;
    private double limite = -500;

    // metodos
    public void abrirConta() {
        System.out.print("Voce deseja abrir conta? (S/N)");
        this.resposta = (scanner.next().charAt(0)); // para pegar somente um caracter

        if (this.resposta == 's' || this.resposta == 'S') {
            System.out.println("Qual o tipo? corrente ou poupança?:");
            System.out.println("C para Corrente / P para poupança");

            this.setTipo(scanner.next().charAt(0));
            scanner.nextLine();

            if (this.getTipo() == 'c' || this.getTipo() == 'C') {
                System.out.println("Conta Corrente Escolhida!");
                System.out.print("Digite seu nome: ");

                this.setDono(scanner.nextLine());

                System.out.println("Informações:");
                System.out.println("Nome: " + getDono());
                System.out.println("Numero da Conta: " + getnumConta());
                System.out.println("Seu saldo sera: " + setSaldo(getSaldo() + 100.00));

                this.setStatus(true);

            } else if (this.getTipo() == 'p' || this.getTipo() == 'P') {
                System.out.println("Conta Poupança Escolhida!");
                System.out.print("Digite seu nome:");

                this.setDono(scanner.nextLine());

                System.out.println("Informações:");
                System.out.println("Nome: " + getDono());
                System.out.println("Numero da Conta: " + getnumConta());
                System.out.println("Seu saldo sera: " + setSaldo(getSaldo() + 150.00));

                this.setStatus(true);

            } else {
                System.out.println("Tipo de conta invalido!");
                this.abrirConta();
                return;
            }

        } else {
            System.out.println("Fim do programa");
        }
    }

    public void fecharConta() {
        System.out.println("Voce deseja encerrar a conta?:");
        System.out.println("Digite S para Sim e N para Não");

        this.resposta = scanner.next().charAt(0);
        scanner.nextLine();

        if (this.resposta == 's' || this.resposta == 'S') {

            if (this.getSaldo() < 0) {

                while (this.getSaldo() < 0) {

                    System.out.println("Você está em débito com o banco! no valor de: " + getSaldo());
                    System.out.println("Regularize sua conta para poder fechar");
                    System.out.println("Digite o valor do depósito: ");

                    this.setSaldo(scanner.nextDouble() + this.getSaldo());
                }

                System.out.println("Conta encerrada!");
                this.setStatus(false);

            } else if (this.getSaldo() > 0) {

                System.out.println("Faça o saque do restante do valor em conta para fechar sua conta!");
                System.out.println("Saldo disponível: " + this.getSaldo());
                System.out.println("Digite o valor do saque:");

                this.setSaque(scanner.nextDouble());
                this.sacar();

                if (this.getSaldo() == 0) {
                    System.out.println("Conta encerrada!");
                    this.setStatus(false);
                } else {
                    System.out.println("A conta não pode ser encerrada enquanto houver saldo!");
                }

            } else {

                System.out.println("Conta encerrada!");
                this.setStatus(false);
            }

        } else if (this.resposta == 'n' || this.resposta == 'N') {

            System.out.println("Conta não será encerrada!");

        } else {

            System.out.println("Tipo inválido!");
            this.fecharConta();
        }
    }

    public void depositar() {
        if (this.getStatus() == true) {
            System.out.println("Você tinha em conta: " + getSaldo());
            System.out.println("E depositou: " + getDeposito());

            this.setSaldo(this.getSaldo() + this.getDeposito());

            System.out.println("Agora você possui disponivel em conta: " + getSaldo());

        } else {
            System.out.println("Você precisa abrir sua conta primeiro!");
            this.abrirConta();
        }
    }

    public void sacar() {
        if (this.getStatus() == true) {

            double novoSaldo = this.getSaldo() - this.getSaque();

            if (novoSaldo < limite) {

                System.out.println("Você não pode realizar esse saque!");
                System.out.println("Seu limite é de: " + limite);
                System.out.println("Saldo atual: " + getSaldo());
                System.out.println("Valor do saque: " + getSaque());

            } else {

                this.setSaldo(novoSaldo);

                System.out.println("Saque realizado no valor de: " + getSaque());
                System.out.println("Valor disponível em conta: " + getSaldo());
            }

        } else {
            System.out.println("Você precisa abrir sua conta primeiro!");
            this.abrirConta();
        }
    }

    public void pagarMensal() {
        this.setSaldo(this.getSaldo() - this.getMensalidade());

        System.out.println("Mensalidade Deduzida da conta! no valor de R$" + getMensalidade());
        System.out.println("Saldo atual: " + getSaldo());
    }

    // getters e setters
    public boolean getStatus() {
        return this.status;
    }

    public boolean setStatus(boolean s) {
        this.status = s;
        return this.status;
    }

    public double getDeposito() {
        return this.deposito;
    }

    public double setDeposito(double d) {
        this.deposito = d;
        return this.deposito;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double setSaldo(double s) {
        this.saldo = s;
        return this.saldo;
    }

    public double getSaque() {
        return this.saque;
    }

    public double setSaque(double s) {
        this.saque = s;
        return this.saque;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public char getTipo() {
        return this.tipo;
    }

    public void setTipo(char t) {
        this.tipo = t;
    }

    public int getnumConta() {
        return this.numConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    // construtor
    public Banco() {
        this.numConta = random.nextInt(1000);

    }
}