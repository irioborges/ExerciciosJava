package estatico;

public class Teste {
  private static int valor;    
  private int teste54;
  
  public Teste(int valor){
      Teste.valor = valor;
  }
  
  public Teste(){
      
  }
  
  public static void alteraValor(int valor){
      Teste.valor = valor;
  }
  
  public static int getValor(){
      return Teste.valor;
  }
  
  public void setTeste54(int valor){
      this.teste54 = valor;
  }
  
}
