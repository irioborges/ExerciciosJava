package asp02;

public class Pais {

  private String codigo_ISO;
  private String nome;
  private int populacao;
  private float dimensao;
  
  public Pais(String codigo_ISO, String nome, float dimensao){
      this.codigo_ISO = codigo_ISO;
      this.nome = nome;
      this.dimensao = dimensao;
  }

    public String getCodigo_ISO() {
        return codigo_ISO;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public float getDimensao() {
        return dimensao;
    }

    public void setCodigo_ISO(String codigo_ISO) {
        this.codigo_ISO = codigo_ISO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }

    public float densidadePopulacional(){
        return this.populacao / this.dimensao;
    }
  
    
  
}
