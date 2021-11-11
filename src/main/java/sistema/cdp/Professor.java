package sistema.cdp;

import java.util.Date;

public class Professor extends Pessoa{
    private String titulacao;

    public Professor(String nome, Date dataNasc, long cpf, String titulacao) {
        super(nome, dataNasc, cpf);
        this.titulacao = titulacao;
    }
}
