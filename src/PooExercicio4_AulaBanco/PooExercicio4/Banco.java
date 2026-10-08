package PooExercicio4_AulaBanco.PooExercicio4;


public class Banco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo:"+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo() == "CC"){
            this.setSaldo(getSaldo() + 50);
        }else{
            this.setSaldo(getSaldo() + 150);
        }
        System.out.println("Conta Aberta com Sucesso!");
    }
    public void fecharConta(){
        if ( this.getSaldo() > 0){
            System.out.println("Conta com Dinheiro! Saque o Valor para poder fechar a conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em Debito! Regularize!");
        }else {
            System.out.println("Conta Fechada!");
            this.setStatus(false);
        }
    }
    public void depositar(double v){
        if(this.getStatus()){
            setSaldo(getSaldo() + v);
            System.out.println("Deposito Realizado com Sucesso!");
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(double v){
        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossivel Sacar!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso! por "+this.getDono());
        }else{
            System.out.println("Impossivel pagar um conta fechada!");
        }
    }

    public Banco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}