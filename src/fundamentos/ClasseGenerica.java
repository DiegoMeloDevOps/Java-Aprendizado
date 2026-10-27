package fundamentos;

public class ClasseGenerica {

    // classes do tipo generico obtera o tipo do seu valor apos declararem o tipo do seu objeto
    static class Armazenamento<T>{
        T dado;

        public void salvar(T dado){
            this.dado = dado;
        }

        public T consultar(){
            return this.dado;
        }

    }

    public class Main


    {
        public static void main(String[] args) {

            // por ser generica a classe o tipo do seu valor é passado no momento da declaração da classe
            // para instanciar o objeto
            Armazenamento<String> valor = new Armazenamento<>();
            Armazenamento<Integer> valor2 = new Armazenamento<>();

            // por ser um metodo do tipo generico qualquer valor(int,double ou string) passado como parametro ele ira
            // receber e tratar o valores
            valor.salvar("Java");
            valor2.salvar(100);

            System.out.println(valor.consultar());
            System.out.print(valor2.consultar());

        }
    }

}
