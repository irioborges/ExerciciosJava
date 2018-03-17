package corretora;

public class Corretora {

    public static void main(String[] args) {
           Acionista a1, a2, a3;
           a1 = new Acionista();
           a2 = new Acionista();
           a3 = new Acionista();
           
           a1.setNome("Juca");
           a1.setNumeroAcoes(40);
           Acionista.setValorAcao(300.45);
           a1.imprimir();
           
           int x = 2;
           Integer y = 2;
           int z = x + y;
           String a = Integer.toString(x);
    }
    
}

