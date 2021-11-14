package sistema.cgt;

import sistema.cdp.Aluno;
import sistema.cdp.Professor;
import java.util.ArrayList;
import java.util.Date;

public class AplGerenciarPessoas {

    public static ArrayList<Professor> lstProfessor = new ArrayList<>();
    public static ArrayList<Aluno> lstAluno = new ArrayList<>();

    public void cadastrarProfessor(String nome, Date dataNasc, long cpf, String titulacao){
        lstProfessor.add(new Professor(nome, dataNasc, cpf, titulacao));
    }
    public void cadastrarAluno(String nome, Date dataNasc, long cpf){
        lstAluno.add(new Aluno(nome, dataNasc, cpf));
    }
}
