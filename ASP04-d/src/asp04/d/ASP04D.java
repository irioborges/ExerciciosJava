package asp04.d;

public class ASP04D {

    public static void main(String[] args) {
        try{
          System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
        }catch(ArrayIndexOutOfBoundsException e)  {
            System.out.println("Quantidade de parâmetros passados " + e.getMessage() + " e a quantidade esperada é 4");
        }
    }
    
}
