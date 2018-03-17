package asp06.pkg1;

public class Primos implements Runnable{
  private int inicio, fim;
  
  public Primos(int inicio, int fim){
    this.inicio = inicio;
    this.fim = fim;
  }
  
  public boolean testaPrimo(int numero){
    int i, cont = 0;
    
    for(i=1; i <= numero; i++){
      if(numero % i == 0){
        //System.out.println("É divisivel por " + i);
        cont++;
      }  
    }
     
    if(cont == 2){
        return true;
    }else{
        return false;
    }
          
  }
 
  @Override
  public void run() {
      int i;
      try{
          System.out.println("Inicio" + this.inicio);
          System.out.println("Fim" + this.fim);
          
          for(i = this.inicio; i <= this.fim; i++){
              if(testaPrimo(i) == true){
                System.out.println("Numero " + i + " é primo")   ;
              }
          }
          
      }catch(Exception e){
          
      }
    
  }
  
}