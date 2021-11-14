package sistema.cdp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
    @Id
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return nome;
    }
}
