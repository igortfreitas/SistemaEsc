package sistema.cgt;

import sistema.cdp.Aluno;
import sistema.cdp.Professor;
import sistema.cgd.Service;

import java.util.ArrayList;
import java.util.Date;

public class AplGerenciarPessoas {

    private final Service service = new Service("hibernate.cfg.xml");

    public static ArrayList<Professor> lstProfessor = new ArrayList<>();
    public static ArrayList<Aluno> lstAluno = new ArrayList<>();

    public void cadastrarProfessor(String nome, Date dataNasc, long cpf, String titulacao){
        service.save(new Professor(nome, dataNasc, cpf, titulacao));
        lstProfessor.add(new Professor(nome, dataNasc, cpf, titulacao));
    }
    public void cadastrarAluno(String nome, Date dataNasc, long cpf){
        service.save(new Aluno(nome, dataNasc, cpf));
        lstAluno.add(new Aluno(nome, dataNasc, cpf));
    }
}
