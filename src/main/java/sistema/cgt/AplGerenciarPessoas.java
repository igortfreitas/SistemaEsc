package sistema.cgt;

import sistema.cdp.Aluno;
import sistema.cdp.Curso;
import sistema.cdp.Professor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class AplGerenciarPessoas {

    public ArrayList<Professor> lstProfessor = new ArrayList<>();
    private ArrayList<Aluno> lstAluno = new ArrayList<>();

    public AplGerenciarPessoas(){
    }

    public void cadastrarProfessor(String nome, Date dataNasc, long cpf, String titulacao){
        lstProfessor.add(new Professor(nome, dataNasc, cpf, titulacao));
    }
    public void cadastrarAluno(String nome, Date dataNasc, long cpf){
        lstAluno.add(new Aluno(nome, dataNasc, cpf));
    }
    public void atualizaComboBoxProf(DefaultComboBoxModel<Professor> cbmProf){
        for (Professor professor : lstProfessor) {
            cbmProf.addElement(professor);
            System.out.println(lstProfessor.size());
        }
    }
}
