package asp02;

public class Circulo {

  private int raio;
  private Ponto2D ponto;  
    
  public Circulo(int raio, Ponto2D ponto){
      this.raio = raio;
      this.ponto = ponto;
  }
  
  public Circulo(){
      this.ponto.setX(0);
      this.ponto.setY(0);
  }
  
  public int getRaio(){
      return this.raio;
  }
  
  public void setRaio(int valor){
      this.raio = valor;
  }
  
  public Ponto2D getPonto(){
      return this.ponto;
  }
  
  public void inflar(int valor){
      this.raio = this.raio + valor;
  }
  
  public void desinflar(int valor){
      if(valor > this.raio){
        System.out.println("Valor maio que o tamanho do raio!");  
      }else{
        this.raio = this.raio - valor;
      }
  }
  
  public void mover(double x, double y){
      this.ponto.setX(this.ponto.getX() + x); 
      this.ponto.setY(this.ponto.getY() + y);
  }
  
  public double area(){
      return (raio * raio) * 3.1415926;
  }
  
}
