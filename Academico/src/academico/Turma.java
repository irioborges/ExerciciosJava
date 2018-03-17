/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

public class Turma {
  private int ano;
  private int semestre;
  private String disciplina;
  private int turma;
  private String curso;
  private Registros[] linha;
  private static int quantidade;
  
  public Turma(String curso, String disciplina, int ano, int semestre, int turma, int maxAlunos){
      this.curso = curso;
      this.disciplina = disciplina;
      this.ano = ano;
      this.semestre = semestre;
      this.turma = turma;
      
      linha = new Registros[maxAlunos];
      quantidade = 0;
  }
  
  public boolean cadastrar(int matricula, String nome){
      //linha[quantidade] = new Registros(matricula, nome);
      //if(quantidade < linha.lenght){
          linha[quantidade] = new Registros();
          //quantidade++;
      //}
      return true;
  }
}
