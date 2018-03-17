package loja;

public class Produtos {
  private String nome;
  private float preco;
  
  public Produtos(){
      
  }
  
  public Produtos(String nome, float preco){
      this.nome = nome;
      this.preco = preco;
  }
  
  public String getNome(){
      return this.nome;
  }
  
  public float getPreco(){
      return this.preco;
  }
  
  public void setNome(String nome){
      this.nome = nome;
  }
  
  public void setPreco(float preco){
      this.preco = preco;
  }
  
  public String toString(){
      return "Nome: " + getNome() + "Preco: " + getPreco();
  }
  
}
