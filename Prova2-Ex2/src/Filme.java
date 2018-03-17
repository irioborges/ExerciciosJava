/**
 *
 * @author Írio Rafael de Menezes Borges
 */

import java.io.Serializable;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.Formatter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class Filme implements Serializable{
    private int codigo;
    private String titulo;
    private int ano;
    private float custo;
    static int quantidade = 1;
    
    public Filme(){}
    public Filme(int codigo, String titulo, int ano, float custo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.custo = custo;
    }
    
    private void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    private void setAno(int ano){
        this.ano = ano;
    }
    
    private void setCusto(float custo){
        this.custo = custo;
    }
    
    private int getCodigo(){
        return this.codigo;
    }
    
    private String getTitutlo(){
        return this.titulo;
    }
    
    private int getAno(){
        return this.ano;
    }
    
    private float getCusto(){
        return this.custo;
    }
    
    public void criarEpreencher(){
        Scanner entrada = new Scanner(System.in);
        Filme filme[] = new Filme[60];
        int codigo, ano;
        String nome;
        float custo;
        
        System.out.println("Digite o codigo do filme");
        codigo = entrada.nextInt();
        System.out.println("Digite o nome do filme");
        nome = entrada.nextLine();
        System.out.println("Digite o ano do filme");
        ano = entrada.nextInt();
        System.out.println("Digite o custo do filme");
        custo = entrada.nextFloat();
        
        filme[quantidade] = new Filme(codigo, nome, ano, custo);
        quantidade++;
    }
    
    public void salvarObjeto(){
        
    }
    
    void salvarObjeto(Filme filme) throws IOException {
      /* Primeiro precisa instanciar um FileOutputStream para criar o arquivo */
      FileOutputStream fs = new FileOutputStream("/home/filme.ser");
        // Grava o objeto no arquivo
        try ( /* Depois cria um ObjectOutputStream para poder gravar o objeto no arquivo */ ObjectOutputStream output = new ObjectOutputStream(fs)) {
            // Grava o objeto no arquivo
            output.writeObject(filme);
            // Um único close fecha tudo
            // Seria bom um finally aqui
        }catch(Exception e){
            System.out.println(e);
        }
    }    
    
    void CarregarData() throws ClassNotFoundException, IOException {
        Filme filme;
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("/home/filme.ser"));
        try{
          while(true){
            filme = (Filme) input.readObject();
            System.out.println("Filme: " + filme);
          }
        }catch(EOFException e){
            return;
        }
        input.close();
}
}
