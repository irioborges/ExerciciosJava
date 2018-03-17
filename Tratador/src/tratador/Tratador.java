package tratador;

import java.io.FileNotFoundException;

public class Tratador {

    public static void main(String[] args) {
      int a = 10;
      int b = 0;
        
      try{
          a = a / b;
      }catch(Exception e){
          System.out.println("Deu Erro");
    }
    }
    
}
