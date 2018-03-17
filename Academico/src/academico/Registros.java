package academico;

public class Registros {
    private int matricula;
    private String nome;
    private int faltas;
    private float nota;
    
    public void Registros(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.faltas = 0;
        this.nota = 0.0f;
    }
    public void lancar(int faltas, float nota){
        if(faltas >= 0 && faltas <= 60){
            this.faltas = faltas;            
        }
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        }
    }
    
    public String toString(){
        return this.matricula + "\t" + this.nome + "\t" + this.faltas + "\t" + this.nota;
    }
}
