package asp02;



public class ASP02 {

    public static void main(String[] args) {
        Contador contador = new Contador();
        Ponto2D ponto2D = new Ponto2D(5, 10);
        Circulo circulo = new Circulo(25, ponto2D);
        
        contador.incrementar();
        //System.out.println(contador.getValor());
        contador.zerar();
        //System.out.println(contador.getValor());
        
        //System.out.println(ponto2D.toString());
        
        //System.out.println(circulo.getPonto());
        //circulo.mover(10, 10);
        //System.out.println(circulo.getPonto());
        //System.out.println(circulo.area());
        
        System.out.println(Area.acreToFeet(900));
        
        
    }
    
}
