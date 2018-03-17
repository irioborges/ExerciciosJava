package erro;

import java.util.Scanner;

public class Erro {
    public static void main(String[] args) {
        int x, y, z;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de x");
        x = input.nextInt();
        System.out.println("Digite o valor de y");
        y = input.nextInt();
        try {
          z = x / y;
        } catch(Exception e){
            System.out.println("Deu erro");
            System.out.println(e);
        }  
        System.out.println(x + " " + y);
    }
    
}
