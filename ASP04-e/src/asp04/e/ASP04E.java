package asp04.e;

import java.util.Scanner;

public class ASP04E {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String string;
        
        System.out.println("Digite a string");
        string = entrada.nextLine();
        System.out.println("" + verificaMaiusculos(string));
        
    }
    
    private static boolean verificaMaiusculos(String parametro){
        int i;
        try{
            for(i=0; i<parametro.length(); i++)           {
                if(Character.isLetter(parametro.charAt(i)) == true){
                    System.out.println("Letra");
                }
                if(Character.isUpperCase(parametro.charAt(i)) == true){
                    System.out.println("Existe letra maiúscula");
                }
            }
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
