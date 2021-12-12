package sistema.cci;

/**
 * @author Igor T Freitas, Kaua Victor e Samara Amorim
 */

import sistema.cdp.Curso;
import sistema.cdp.Professor;
import sistema.cgt.AplGerenciarCurso;
import sistema.cgt.AplGerenciarPessoas;
import sistema.ciu.*;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.Date;

public class ControladorPrincipal {
    private JanPrincipal janPrincipal;
    private JanCadCurso janCadCurso;
    private JanCadAluno janCadAluno;
    private JanCadProfessor janCadProfessor;
    private JanCadTurma janCadTurma;
    private final AplGerenciarCurso aplGerenciarCurso;
    private final AplGerenciarPessoas aplGerenciarPessoas;

    public ControladorPrincipal (){
        exibirJanPrincipal();
        aplGerenciarCurso = new AplGerenciarCurso();
        aplGerenciarPessoas = new AplGerenciarPessoas();
    }

    public static void main(String[] args) {
        UIManager.put("ComboBox.selectionBackground", new Color(58,58,58));
        new ControladorPrincipal();
    }

    public void exibirJanPrincipal(){
        if (janPrincipal == null) janPrincipal = new JanPrincipal(this);
        janPrincipal.setVisible(true);
        if (janCadProfessor != null) janCadProfessor = null;
        if (janCadTurma != null) janCadTurma = null;
        if (janCadAluno != null) janCadAluno = null;
        if (janCadCurso != null) janCadCurso = null;
    }
    public void exibirJanCadCurso(){
        if (janCadCurso == null) janCadCurso = new JanCadCurso(this);
        janCadCurso.setVisible(true);
        janPrincipal.setVisible(false);
    }
    public void exibirJanCadAluno() throws ParseException {
        if (janCadAluno == null) janCadAluno = new JanCadAluno(this);
        janCadAluno.setVisible(true);
        janPrincipal.setVisible(false);
    }
    public void exibirJanCadProfessor() throws ParseException {
        if (janCadProfessor == null) janCadProfessor = new JanCadProfessor(this);
        janCadProfessor.setVisible(true);
        janPrincipal.setVisible(false);
    }
    public void exibirJanCadTurma() throws ParseException {
        if (janCadTurma == null) janCadTurma = new JanCadTurma(this);
        janCadTurma.setVisible(true);
        janPrincipal.setVisible(false);
    }

    public void cadastrarCurso(String nome, int ch){
        aplGerenciarCurso.cadastrarCurso(nome, ch);
        JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
        exibirJanPrincipal();
    }
    public void cadastrarProfessor(String nome, Date dataNasc, long cpf, String titulacao){
        aplGerenciarPessoas.cadastrarProfessor(nome, dataNasc, cpf, titulacao);
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
        exibirJanPrincipal();
    }
    public void cadastrarAluno(String nome, Date dataNasc, long cpf){
        aplGerenciarPessoas.cadastrarAluno(nome, dataNasc, cpf);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        exibirJanPrincipal();
    }
    public void cadastrarTurma(String horario, int limiteAluno, Date dataInicio, Date dataFim, Professor professor, Curso curso){
        aplGerenciarCurso.cadastrarTurma(horario, limiteAluno, dataInicio, dataFim, professor, curso);
        JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
        exibirJanPrincipal();
    }
}