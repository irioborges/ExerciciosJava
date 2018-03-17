package asp04.f;

import java.util.Scanner;
import java.util.Stack;

public class ASP04F {

    public static void main(String[] args) {
        int opcao = 0, valor;
        Scanner entrada = new Scanner(System.in);
        Stack<Number> stk = new Stack<Number>();
        
        while(opcao != 3){
          System.out.println("1. Inserir item no topo");
          System.out.println("2. Retirar item do topo");
          System.out.println("3. Sair");
          System.out.println("Digite sua opção");
          opcao = entrada.nextInt();
          if(opcao == 1){
              try{
                valor = entrada.nextInt();
                stk.push(valor);
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }
          }else if(opcao == 2){
              System.out.println(stk.pop());
          }
        }     
        
        
        
    }
    
    public void inserir(){
        
    }
    
}
