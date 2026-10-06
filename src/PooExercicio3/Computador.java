package PooExercicio3;

public class Computador {

    public String marca;
    public String processador;
    private String macAdress;
    private boolean estado;

    public void ligado(){
        this.estado = true;
    }

    public void desligado(){
        this.estado = false;;
    }

    // criando metodos getters e setters

    // get é um metodo acessor, atraves dele retornamos dados de uma forma segura
    public boolean getEstado(){
        return this.estado;
    }

    public void setEstado(boolean e){
        this.estado = e;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public String getMacAdress(){
        return this.macAdress;
    }

    public void setMacAdress(String a){
        this.macAdress = a;
    }

    public String getProcessador(){
        return this.processador;
    }

    public void setProcessador(String p){
        this.processador = p;
    }
    // metodo construtor

    public Computador(String m, String a, String p){
        this.setMarca(m);
        this.setMacAdress(a);// aleatorio
        this.setProcessador(p);
        this.desligado();
    }


    public void info(){
        System.out.println("Marca: "+getMarca());
        System.out.println("MacAdress: "+getMacAdress());
        System.out.println("Processador: "+getProcessador());
    }

    public void checkUp(){
        if (this.getEstado()== true){
            System.out.println("O computador está ligado? "+ this.getEstado());
        }else {
            System.out.println("O computador está ligado? "+ this.getEstado());
        }
    }
}
