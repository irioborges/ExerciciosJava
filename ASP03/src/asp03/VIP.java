package asp03;

public class VIP extends Ingresso{

  private float valorAdicional;
  
  public float valorIngressoVip(){
      return getValor() + this.valorAdicional;
  }
    
}

