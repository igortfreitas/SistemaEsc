package sistema.cci;

// Igor T Freitas e Kaua Victor

import sistema.cdp.Curso;
import sistema.cdp.Professor;
import sistema.cgt.AplGerenciarCurso;
import sistema.cgt.AplGerenciarPessoas;
import sistema.ciu.*;

import java.util.Date;

public class ControladorPrincipal {
    JanPrincipal janPrincipal;
    JanCadCurso janCadCurso;

    public static void main(String[] args) {
        //exibirJanPrincipal();
        new JanPrincipal();
    }
    public void exibirJanCadCurso(){
        new JanCadCurso();
    }
    public void exibirJanCadAluno(){
        new JanCadAluno();
    }
    public void exibirJanCadProfessor(){
        new JanCadProfessor();
    }
    public void exibirJanCadTurma(){
        new JanCadTurma();
    }

    public void cadastrarCurso(String nome, int ch){
        new AplGerenciarCurso().cadastrarCurso(nome, ch);
    }
    public void cadastrarProfessor(String nome, Date dataNasc, long cpf, String titulacao){
        new AplGerenciarPessoas().cadastrarProfessor(nome, dataNasc, cpf, titulacao);
    }
    public void cadastrarAluno(String nome, Date dataNasc, long cpf){
        new AplGerenciarPessoas().cadastrarAluno(nome, dataNasc, cpf);
    }
    public void cadastrarTurma(String horario, int limiteAluno, Date dataInicio, Date dataFim, Professor professor, Curso curso){
        new AplGerenciarCurso().cadastrarTurma(horario, limiteAluno, dataInicio, dataFim, professor, curso);
    }
}
