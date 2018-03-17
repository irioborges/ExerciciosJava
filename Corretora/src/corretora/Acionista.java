
package corretora;

public class Acionista {
    private String nome;
    private static double valorAcao;
    private int numeroAcoes;

    public String getNome() {
        return nome;
    }

    public static double getValorAcao() {
        return valorAcao;
    }

    public int getNumeroAcoes() {
        return numeroAcoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setValorAcao(double valorAcao) {
        Acionista.valorAcao = valorAcao;
    }

    public void setNumeroAcoes(int numeroAcoes) {
        this.numeroAcoes = numeroAcoes;
    }
    
    public void imprimir(){
        
        System.out.println("Nome: " + nome + "Saldo: " + (numeroAcoes * valorAcao));
    }
    
}
