package PooExercicio2;

public class Carro {

    // public = todos tem acesso
    // private = somente a classe tem acesso ( so podemos atribuir valores aos atributos na classe)
    // protected = somente quem herda consegue acessar/atribuir os valores do atributo

   public int pneus;
   public String marca;
   protected int ano;
   private Double quilometragem;
   private boolean estado;
   protected String dono;

    void funcionando(){
        this.estado = true;
    }

    void quebrado(){
        this.estado = false;
    }

    void info (){
        System.out.println("Ano: "+ano);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
        System.out.println("Quilometragem: "+quilometragem);
    }

    void status(){
        if(this.estado = false){
            System.out.println("O carro esta quebrado! leve ao mecanico!");
        }else{
            System.out.println("O carro esta funcionando! vamos para a praia!");
        }
    }
}
