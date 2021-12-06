package sistema.cdp;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Professor extends Pessoa{
    private String titulacao;

    public Professor(String nome, Date dataNasc, long cpf, String titulacao) {
        super(nome, dataNasc, cpf);
        this.titulacao = titulacao;
    }

    public Professor() {

    }
}
