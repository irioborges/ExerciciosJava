package asp04.c;

import java.util.Scanner;

public class ASP04C {

    public static void main(String[] args) {
        String a, b;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite as strings, uma após a outra");
        try{
          a = entrada.nextLine();
          b = entrada.nextLine();
        
          if(a.compareTo(b) == 0){
              System.out.println("As strings são iguais");
          }else if(a.compareTo(b) < 0){
              System.out.println("A String A vem antes da String B");
          }else if(a.compareTo(b) > 0){
              System.out.println("A String B vem antes da String A");
          }
        }catch(NullPointerException e){
            System.out.println("A" + e.getMessage());
        }
    }
    
}
