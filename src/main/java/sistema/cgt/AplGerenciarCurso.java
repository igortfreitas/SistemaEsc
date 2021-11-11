package sistema.cgt;

import sistema.cdp.Curso;
import sistema.cgd.Service;
import javax.swing.*;
import java.util.ArrayList;

public class AplGerenciarCurso {
    // BANCO DE DADOS DESATIVADO POR ENQUANTO
    //private final Service service = new Service("hibernate.cfg.xml");
    private final ArrayList<Curso> lstCursos = new ArrayList<>();

    public AplGerenciarCurso() {
    }

    public void cadcurso(JTextField nomeTextfield, JTextField chTextfield) {
        //service.save(new Curso(nomeTextfield.getText().trim().replaceAll("\s+", " "), Integer.parseInt(chTextfield.getText())));
        lstCursos.add(new Curso(nomeTextfield.getText().trim().replaceAll("\\s+", " "), Integer.parseInt(chTextfield.getText())));
        nomeTextfield.setText("");
        chTextfield.setText("");
    }
}