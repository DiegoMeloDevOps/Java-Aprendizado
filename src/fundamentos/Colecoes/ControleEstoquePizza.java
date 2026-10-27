package fundamentos.Colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ControleEstoquePizza {

    static void printMenu() {
        System.out.println("Menu Pizzaria");
        System.out.println("Cadastrar Produto: CP");
        System.out.println("Consultar Estoque: CE");
        System.out.println("Atualizar Estoque: AE");
        System.out.println("Exibir Produtos: EP");
        System.out.println("Sair: Sair");
    }


    static void main() {

        String nomeProduto, nomeProdutoAtualizar;
        int quantidadeProduto,iterador = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> produtos = new HashMap<>();
        ArrayList<String> nomePizza = new ArrayList<>();
        String resposta ="";

        // loop infinio para mostrar o menu
        while(true){
        printMenu();
        resposta = scanner.nextLine();

        // se a reposta for igual a sair ele sai do while
        if(resposta.equalsIgnoreCase("Sair")){
                break;
        }

        switch (resposta.toUpperCase()){

            case "CP":

                System.out.print("Digite O nome do produto: ");
                nomeProduto = scanner.nextLine();

                System.out.print("Digite a Quantidade do produto: ");
                quantidadeProduto = scanner.nextInt();
                // consome o enter que ficou pendente
                scanner.nextLine();
                nomePizza.add(nomeProduto);
                produtos.put(nomeProduto,quantidadeProduto);

                System.out.println("Nome: "+nomePizza.get(iterador)+ " Unidades: "+ produtos.get(nomeProduto));
                iterador += 1;

                System.out.println("Produto Cadastrado com sucesso! ");
                System.out.println("\n");

                break;


            case "CE":
                // usando uma expressão lambda , usamos o for each para percorrer o map, e passamos a chave e o valor para as variaveis chave e valor
                produtos.forEach((nome, quantidade) -> {
                System.out.println("Pizza: " + nome + " | Estoque: " + quantidade);
            });
                System.out.println("\n");
                break;

            case "AE":

                System.out.print("Digite o nome do produto que quer atualizar: ");
                nomeProdutoAtualizar = scanner.nextLine();

                if (!produtos.containsKey(nomeProdutoAtualizar)){
                    do {
                        System.out.println("Produto Não Existe!");
                        System.out.print("Digite o nome do produto que quer atualizar: ");
                        nomeProdutoAtualizar = scanner.nextLine();

                    }while (!produtos.containsKey(nomeProdutoAtualizar));
                }

                System.out.print("Digite a quantidade para ser atualizada: ");
                produtos.replace(nomeProdutoAtualizar, scanner.nextInt());
                System.out.println(nomeProdutoAtualizar+" Atualizado com Sucesso para "+produtos.get(nomeProdutoAtualizar)+" Unidades");
                // consumir o enter
                scanner.nextLine();
                System.out.println("\n");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }

        }

        }






    }


