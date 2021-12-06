package sistema.cdp;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Aluno extends Pessoa{
    public Aluno(String nome, Date dataNasc, long cpf) {
        super(nome, dataNasc, cpf);
    }

    public Aluno() {
        super();
    }
}
