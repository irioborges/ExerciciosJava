package loja;

public class DVDs extends Produtos{
    private int duracao;
    
    public DVDs(){
        
    }
    
    public DVDs(String nome, float preco, int duracao){
        super(nome, preco);
        this.duracao = duracao;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    @Override
    public String toString(){
        return "Nome eh " + getNome() + "Preco eh " + getPreco() + "Duracao eh: " + getDuracao();
    }
    
}
