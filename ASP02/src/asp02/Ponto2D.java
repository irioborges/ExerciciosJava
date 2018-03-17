package asp02;

public class Ponto2D {
  private double x, y;
  
  public Ponto2D(){
      x = 0;
      y = 0;
  }
  public Ponto2D(double abscissa, double ordenada){
      this.x = abscissa;
      this.y = ordenada;
  }
  
  public void setX(double valor){
      this.x = valor;
  }
  
  public void setY(double valor){
      this.y = valor;
  }
  
  public double getX(){
      return this.x;
  }
  
  public double getY(){
      return this.x;
  }
  
  public String toString(){
      return "(" + x + "," + y + ")";
  }
  
}
