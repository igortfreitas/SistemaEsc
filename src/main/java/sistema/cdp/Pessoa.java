package sistema.cdp;

import java.util.Date;

public class Pessoa {
    private final String nome;
    private final Date dataNasc;
    private final long cpf;

    public Pessoa(String nome, Date dataNasc, long cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" DataNasc: "+dataNasc+" CPF: "+cpf;
    }
}
