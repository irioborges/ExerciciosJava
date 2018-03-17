package loja;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        int tipoProduto, numProdutos, i, numeroFaixas, duracao;
        String nome, autor;
        float preco;
        
        Scanner entrada;
        Produtos produto[];
        
        entrada = new Scanner(System.in);
        
        System.out.println("Escolha o numero de produtos que deseja adicionar ao carrinho: ");
        numProdutos = entrada.nextInt();
        
        produto = new Produtos[numProdutos];
        
        for(i = 0; i < numProdutos; i++ ){
          System.out.println("Escolha o tipo de produto que voce deseja adicionar a seu carrinho");
          System.out.println("1. Livro");
          System.out.println("2. CD");
          System.out.println("3. DVD");
          tipoProduto = entrada.nextInt();
          
          System.out.println("Digite o nome");
          nome = entrada.nextLine();
          System.out.println("Digite o preco");
          preco = entrada.nextFloat();
          
          if(tipoProduto == 1){
            System.out.println("Digite o autor");
            autor = entrada.nextLine();
            produto[i] = new Livros(nome, preco, autor);
          }else if(tipoProduto == 2){
            System.out.println("Digite o numero de faixas");
            numeroFaixas = entrada.nextInt();
            produto[i] = new CDs(nome, preco, numeroFaixas);
          }else if(tipoProduto == 3){
            System.out.println("Digite a duracao");
            duracao = entrada.nextInt();
            produto[i] = new DVDs(nome, preco, duracao);
          }
        }  
        
        for(i = 0; i < numProdutos; i++){
            System.out.println(produto[i].toString());
        }
       
        
        
        
    }
    
}
