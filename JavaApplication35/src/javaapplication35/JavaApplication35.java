package javaapplication35;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class JavaApplication35 {

    public static void main(String[] args) {
        File f = new File("/home/irio/trafegoRede-01.cap");
        
        //System.out.println(f.canRead());
        
        
        try{
            Scanner input;
            input = new Scanner(new File("/home/irio/teste.txt"));
            while(input.hasNext()){
                String linha = input.nextLine();
                System.out.println(linha);
            }
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("Deu erro");
        }
        
        
        
        
    }
    
    void gravarArquivo(){
        try{
            Formatter output = new Formatter("lixo.txt");
            for(int i = 0; i < texto.lenght; i++)
        }catch(Exception e){
            
        }
    }
    
}
