/**
 * Abra a sua IDE NetBeans e implemente as classes
 * RegistraAluno e AppRegistraAluno que já foram
 * explicadas. Depois teste os exemplos.
 */

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    //Retorna o nome
    public String getNome(){
        return nome;
    }

    //Define o nome
    public void setNome(String temp){
        nome = temp;
    }

     //Retorna o endereço
    public String getEndereco(){
        return endereco;
    }

    //Define o endereço
    public void getEndereco(String temp){
        endereco = temp;
    }    

     //Retorna a idade
    public int getIdade(){
        return idade;
    }

    //Define a idade
    public void setIdade(int temp){
        idade = temp;
    }

    //Retorna nota de matemática
    public double getNotaMatematica(){
        return notaMatematica;
    }

    //Define nota de matemática
    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }

    //Retorna nota de portugues
    public double getNotaPortugues(){
        return notaPortugues;
    }

     //Define nota de português
     public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }

    //Retorna nota de geografia
    public double getNotaGeografia(){
        return notaGeografia;
    }

     //Define nota de geografia
     public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }

    //Retorna a media;
    public double getMedia(){
        double resultado = 0;
        resultado = (notaGeografia + notaMatematica + notaPortugues)/3;
        return resultado;
    }

    //Retornddo a quantidade de alunos:
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}
