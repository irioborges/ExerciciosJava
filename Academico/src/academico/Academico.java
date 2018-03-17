package academico;

import java.util.Scanner;

public class Academico {

    public static void main(String[] args) {
        Registros registro = new Registros();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a matricula do aluno\n");
        int matricula = input.nextInt();
        System.out.println("Digite a nota do aluno\n");
        int nota = input.nextInt();
        System.out.println("Digite a faltas do aluno\n");
        int faltas = input.nextInt();
        
        registro.lancar(faltas, nota);
        
        System.out.println("Matricula\tNome\tFaltas\tNota");
        System.out.println(registro.toString());
    }
    
}
