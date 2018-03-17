package loja;

public class CDs extends Produtos{
    private int numeroFaixas;
    
    public CDs(){
        
    }
    
    public CDs(String nome, float preco, int numeroFaixas){
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }
    
    public void setNumeroFaixas(int numeroFaixas){
        this.numeroFaixas = numeroFaixas;
    }
    
    public int getNumeroFaixas(){
        return this.numeroFaixas;
    }
    
    @Override
    public String toString(){
        return "Nome eh " + getNome() + "Preco eh " + getPreco() + "Numero de faixas eh: " + getNumeroFaixas();
    }
    
}
