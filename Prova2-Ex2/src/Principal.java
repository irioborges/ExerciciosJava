/**
 *
 * @author Írio Rafael de Menezes Borges
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static Filme filme = new Filme();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        
        while(opcao != 4){
          System.out.println("Qual operação você deseja realizar:");
          System.out.println("1. Criar novo objeto");
          System.out.println("2. Salvar objeto atual");
          System.out.println("3. Carregar objeto salvo e mostrar na tela");
          System.out.println("4. Sair");
          opcao = entrada.nextInt();
          if(opcao == 1){
              criarEpreencher();
          }else if(opcao == 2){
              try {
                  salvarObjeto();
              } catch (IOException ex) {
                  Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }       
    }
    
    public static void criarEpreencher(){
       filme.criarEpreencher();
    }
    
    public static void salvarObjeto() throws IOException{
       filme.salvarObjeto(filme);
    }
}
