package sistema.cci;

// Igor T Freitas e Kaua Victor

import sistema.cgt.AplGerenciarCurso;
import sistema.ciu.JanCadCurso;
import sistema.ciu.JanPrincipal;

import javax.swing.*;

public class ControladorPrincipal {

    public static void main(String[] args) {
        new JanPrincipal();
    }
    public void cadcursogui(){
        new JanCadCurso();
    }
    public void cadcurso(JTextField nomeTextfield, JTextField chTextfield){
        new AplGerenciarCurso().cadcurso(nomeTextfield, chTextfield);
    }
}
