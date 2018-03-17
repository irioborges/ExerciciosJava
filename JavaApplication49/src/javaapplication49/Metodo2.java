package javaapplication49;

public class Metodo2 
{
    private static int teste;
    static int teste2 = 45;
    
    public void setTeste(int valor)
    {
        Metodo2.teste = valor;
    }
    public void imprimirTeste()
    {
        System.out.println(Metodo2.teste);
    }
    
    public void imprimirTeste2()
    {
        System.out.println(this.teste2);
    }
    
}
