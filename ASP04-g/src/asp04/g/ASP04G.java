package asp04.g;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class ASP04G {
    private Queue<Number> q = new LinkedList<Number>();
    
    public static void main(String[] args) {
        int opcao = 0, valor;
        
        
        Scanner entrada = new Scanner(System.in);
        
        while(opcao != 4){
            System.out.println("1 – Inserir item no final da fila\n" +
                           "2 – Retirar e mostrar item do início da fila\n" +
                           "3 – Exibir todo o conteúdo da fila\n" +
                           "4 - Sair\n" +
                           "Digite sua opção: __");
            opcao = entrada.nextInt();
            if(opcao == 1){
                valor = entrada.nextInt();
                inserirItem(valor);
            }else if(opcao == 2){
                
            }else if(opcao == 3) {
                
            }
        }    
    }
    
    public static void inserirItem(int item){
        q.add(item);
    }
    
    public void retirarItem(int item){
        Number n = q.remove();
        System.out.println("Item removido " + n);
    }
    
    public void exibirLista(){
        while (true){
              
        }
    }
    
}
