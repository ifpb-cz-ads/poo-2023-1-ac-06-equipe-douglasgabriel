public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        //Set do dados de ana:
        ana.setNome("Ana Machado");
        ana.setIdade(17);
        ana.setNotaMatematica(9);
        ana.setNotaGeografia(10);
        ana.setNotaPortugues(8);

        //Set dos dados de beto:
        beto.setNome("Beto da Silva");
        beto.setIdade(17);
        beto.setNotaMatematica(10);
        beto.setNotaGeografia(6);
        beto.setNotaPortugues(8);

        //Set dos dados de carlos
        carlos.setNome("Carlos Alberto");
        carlos.setIdade(17);
        carlos.setNotaMatematica(8);
        carlos.setNotaGeografia(8);
        carlos.setNotaPortugues(6);

        //Get dos dados da Ana:
        System.out.println("Nome do aluno: " + ana.getNome());
        System.out.println("Media do aluno: " + ana.getMedia());

        //Get dos dados do Beto:
        System.out.println("Nome do aluno: " + beto.getNome());
        System.out.println("Media do aluno: " + beto.getMedia());

        //Get dos dados do Carlos:
        System.out.println("Nome do aluno: " + carlos.getNome());
        System.out.println("Media do aluno: " + carlos.getMedia());
    }
}
