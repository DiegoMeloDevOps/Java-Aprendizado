package fundamentos;
import java.util.*;

public class ColecaoMapPizza {
     static void main(String[] args) {

        Map<Integer,String> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        produtos.put(0,"Pizza Calabresa");
        produtos.put(1,"Pizza Pepperoni");
        produtos.put(2,"Pizza 4 Queijos");
        produtos.put(3,"Pizza Chocolate com Morango");
        produtos.put(4,"Pizza Brigadeiro");


        try{

            System.out.print("Digite o codigo da Pizza: ");
            while(!scanner.hasNextInt()){
                System.out.print("Digite o codigo da Pizza: ");
                scanner.next();
            }

            Integer codigo = scanner.nextInt();

            if(produtos.containsKey(codigo)){
                System.out.print(produtos.get(codigo));
            }else{
                System.out.print("Codigo não Existe!");
            }


        }catch(Exception e){
            System.out.print("Erro Sistema!");
        }

    }
}

