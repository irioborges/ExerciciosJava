package asp02;

public class Acionista {

  private String cliente;
  private int numeroCotas;
  private static float valorCota;
  private static String teste;
  
  public Acionista(String cliente, int numeroCotas){
      this.cliente = cliente;
      this.numeroCotas = numeroCotas;
  }
   
  
  
    public String getCliente() {
        return cliente;
    }

    public int getNumeroCotas() {
        return numeroCotas;
    }

    public float getValorCota() {
        return valorCota;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroCotas(int numeroCotas) {
        this.numeroCotas = numeroCotas;
    }

    public void setValorCota(float valorCota) {
        this.valorCota = valorCota;
    }

    public String toString() {
        return "Acionista{" + "cliente=" + cliente + ", numeroCotas=" + numeroCotas + ", valorCota=" + valorCota + '}';
    }
  
  
  
  
  
}
