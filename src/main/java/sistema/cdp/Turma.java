package sistema.cdp;

import java.util.Date;

public class Turma {
    private final String horario;
    private final int limiteAluno;
    private final Date dataInicio;
    private final Date dataFim;
    private final Professor professor;
    private final Curso curso;

    public Turma(String horario, int limiteAluno, Date dataInicio, Date dataFim, Professor professor, Curso curso) {
        this.horario = horario;
        this.limiteAluno = limiteAluno;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = professor;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Horario: "+horario+" LimiteAlunos: "+limiteAluno+" DataInicio: "+dataInicio+" DataFim: "+dataFim+
                " Professor: "+professor+" Curso: "+curso;
    }
}
