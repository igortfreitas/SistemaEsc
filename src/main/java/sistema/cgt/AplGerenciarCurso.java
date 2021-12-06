package sistema.cgt;

import sistema.cdp.Curso;
import sistema.cdp.Professor;
import sistema.cdp.Turma;
import sistema.cgd.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AplGerenciarCurso {
    // BANCO DE DADOS DESATIVADO POR ENQUANTO
    private final Service service = new Service("hibernate.cfg.xml");
    public static final List<Curso> lstCursos = new ArrayList<>();
    public static final ArrayList<Turma> lstTurma = new ArrayList<>();

    public void cadastrarCurso(String nome, int ch) {
        service.save(new Curso(nome.trim().replaceAll("\\s+", " "), ch));
        lstCursos.add(new Curso(nome, ch));
    }

    public void cadastrarTurma(String horario, int limiteAluno, Date dataInicio, Date dataFim, Professor professor, Curso curso) {
        lstTurma.add(new Turma(horario, limiteAluno, dataInicio, dataFim, professor, curso));
    }
}