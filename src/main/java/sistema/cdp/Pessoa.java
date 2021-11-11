package sistema.cdp;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNasc;
    private long cpf;

    public Pessoa(String nome, Date dataNasc, long cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }
}
