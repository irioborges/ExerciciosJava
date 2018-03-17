package estudos;

import java.util.Scanner;
import java.util.Random;

public class Estudos {
     
    
    public static void main(String[] args) {
        int tam, vetor[], i;
        Scanner entrada;
        Random rnd;
        
        entrada = new Scanner(System.in);
        rnd = new Random();
        
        System.out.println("Digite o tamanho do vetor: ");
        tam = entrada.nextInt();
        vetor = new int[tam];
        
        for(i=0; i<tam;i++){
            vetor[i] = rnd.nextInt(10);
        }
        
        for(i=0; i<tam;i++){
            System.out.println("O numero eh: " + vetor[i]);
        }
        
    }
    
}
