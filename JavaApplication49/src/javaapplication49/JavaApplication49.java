package javaapplication49;

public class JavaApplication49 {

    public static void main(String[] args) {
        Metodo2 metodo2 = new Metodo2();
        Metodo2 metodo1 = new Metodo2();
        Metodo metodo = null;
                
        metodo2.setTeste(40);
        metodo1.imprimirTeste();
        Metodo.imprimir2();
        metodo2.teste2 = 10;
        metodo1.imprimirTeste2();
        metodo.imprimir();
        
    }
    
}
