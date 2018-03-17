package asp04.b;

import java.util.Scanner;

public class ASP04B {

    public static void main(String[] args) {
        int n, vetor[];
        Scanner entrada;
        
        entrada = new Scanner(System.in);
                
        System.out.println("Digite o numero de posicoes do vetor: ");
        n = entrada.nextInt();
        
        vetor = alocaVetorInteiros(n);
        
        
    }
    
    public static int[] alocaVetorInteiros(int n){
      int valor[];
      
      try{
        valor = new int[n];
        return valor;      
      }catch(NegativeArraySizeException e){
          System.out.println("Erro " + e.getMessage());
          valor = new int[1];
          return valor;
      }  
    }
    
    
}
