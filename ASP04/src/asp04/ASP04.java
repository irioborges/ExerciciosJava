package asp04;

import java.util.Scanner;

public class ASP04 {

    public static void main(String[] args) {
        int a, b, resultado;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = entrada.nextInt();
        
        try{
          resultado = a / b;
          System.out.println(resultado);
        }
        catch(ArithmeticException e2){
            System.out.println("Erro aritmético: " + e2.getMessage());
            e2.printStackTrace();
        }       
        
    }
    
}
