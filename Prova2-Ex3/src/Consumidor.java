/**
 *
 * @author Írio Rafael de Menezes Borges
 */

import java.util.Random;

public class Consumidor implements Runnable{
    
    public int gerarNumero(){
        Random rnd = new Random();
        return rnd.nextInt();
    }
    
    public void dormirTempo(){
        
    }
    
    @Override
    public void run(){
        
    }
    
}
