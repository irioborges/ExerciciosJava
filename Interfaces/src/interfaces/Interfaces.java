package interfaces;

import java.util.Scanner;

public class Interfaces {

    public static void main(String[] args) {
        //Variáveis do tipo primitivo
        int numFormas, i, tipoForma;
        float l;
        
        //Variáveis não primitivas
        Scanner entrada;
        Forma formas[];
        
        //Instância das não primitivas
        entrada = new Scanner(System.in);
        
        System.out.println("Informe quantas formas deseja criar");
        numFormas = entrada.nextInt();
        formas = new Forma[numFormas];
        
        for(i = 0; i < numFormas; i++){
            System.out.println("Informe o tipo da figura que deseja criar");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Círculo");
            
            tipoForma = entrada.nextInt();
            
            switch (tipoForma) {
                case 1:
                    System.out.println("Informe o tamanho do lado do quadrado");
                    l = entrada.nextFloat();
                    formas[i] = new Quadrados(l);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            
        }
        
    }
    
}
