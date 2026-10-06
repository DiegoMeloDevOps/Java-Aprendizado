package PooExercicio1;


public class Caneta {

    // classe possui atributos = variaveis, metodos e estados

    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    // this é uma forma de auto refernciar o objeto
    // se o objeto se chama caneta1 ent
    // this.marca é o equivalente ao caneta1.marca
    void rabiscar(){
        if(this.tampa == false){
            System.out.println("Retire a tampa para rabiscar!");
        }else {
            System.out.println("Podemos rabiscar!");
        }
    }

    void status(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println("Tampada: "+ this.tampa);
    }

    void tampada(){
        this.tampa = false;
    }

    void destampada(){
        this.tampa = true;
    }


}
