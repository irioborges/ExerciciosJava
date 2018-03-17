package interfaces;

public class Quadrados implements Forma{
      private final float lado;
      
      public Quadrados(float lado){
          this.lado = lado;
      }
      
      @Override
      public float calculaArea(){
          return lado;
      }
      
      @Override 
      public float calculaPerimetro(){
          return lado;
      }
      
}
