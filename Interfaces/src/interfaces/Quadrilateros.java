package interfaces;

public class Quadrilateros implements Forma{
    private float l1, l2, l3, l4;

    public Quadrilateros(float l1, float l2, float l3, float l4){
        super();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }
        
    @Override
    public float calculaPerimetro(){
        return this.l1 + this.l2 + this.l3 + this.l4;
    }
    
    @Override
    public float calculaArea(){
        return l1;
    }
        
    
}
