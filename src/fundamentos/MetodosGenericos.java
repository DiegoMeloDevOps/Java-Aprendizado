package fundamentos;

public class MetodosGenericos {

    // metodo publico do tipos static ( n vou declarar objeto) do tipo <T> generico, void n retorna nada
    // metodos ou classes do tipo generico obtera o tipo do seu valor apos passarem no paramentro ou na declaração do
    // objeto
    public static <T> void mostrarDados(T dados){
        System.out.println(dados);
    }

    static void main() {

        // independente do tipo do valor passado no parametro
        // por ser o tipo generico ele ira receber e exibir
        mostrarDados("Aprendendo Java!");
        mostrarDados(50);
        mostrarDados(1.50);

    }

}
