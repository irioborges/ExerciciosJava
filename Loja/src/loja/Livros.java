package loja;

public class Livros extends Produtos{
    private String autor;
    
    public Livros(String nome, float preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return this.autor;
    }
       
    @Override
    public String toString(){
        return ("Nome eh " + getNome() + "Preco eh: " + getPreco() + "Autor eh: ");
    }
    
}
