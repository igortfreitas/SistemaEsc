package sistema.cdp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Entity
public class Pessoa {
    @Id
    private long cpf;
    private String nome;
    private Date dataNasc;



    public Pessoa(String nome, Date dataNasc, long cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }
    public Pessoa(){

    }

    @Override
    public String toString() {
        return nome;
    }

    public int getIdade(){
        LocalDate date = LocalDate.now();
        LocalDate localDate = dataNasc.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
        Period period = Period.between(localDate,date);
        return period.getYears();
    }
}
