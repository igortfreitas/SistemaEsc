package sistema.ciu;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import sistema.cci.ControladorPrincipal;
import sistema.cdp.Curso;
import sistema.cdp.Professor;
import sistema.cgt.AplGerenciarCurso;
import sistema.cgt.AplGerenciarPessoas;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.util.ArrayList;

public class JanCadTurma extends JFrame {

    private JPanel panel;
    private JButton cadastrarButton;
    private JTextField dataFimField;
    private JTextField dataIniField;
    private JTextField limiteAluField;
    private JTextField horarioField;
    private JComboBox<Professor> profComboBox;
    private JComboBox<Curso> cursoComboBox;
    private final AplGerenciarCurso aplGerenciarCurso = new AplGerenciarCurso();
    private final AplGerenciarPessoas aplGerenciarPessoas = new AplGerenciarPessoas();
    DefaultComboBoxModel<Curso> cbmCurso = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<Professor> cbmProfessor = new DefaultComboBoxModel<>();

    public JanCadTurma() {

        //cursoComboBox.setModel(cbmCurso);
        //profComboBox.setModel(cbmProfessor);
        teste();

        //cbmCurso.addAll(aplGerenciarCurso.lstCursos);
        //cbmProfessor.addAll(aplGerenciarPessoas.lstProfessor);
        aplGerenciarPessoas.atualizaComboBoxProf(cbmProfessor);
        aplGerenciarCurso.atualizaComboBoxCurso(cbmCurso);

        cadastrarButton.addActionListener(e -> cadastrar());

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setContentPane(panel);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void cadastrar() {
        new ControladorPrincipal().cadastrarTurma(horarioField.getText(), Integer.parseInt(limiteAluField.getText()), Date.valueOf(dataIniField.getText()), Date.valueOf(dataFimField.getText()), (Professor) profComboBox.getSelectedItem(), (Curso) cursoComboBox.getSelectedItem());
        horarioField.setText("");
        limiteAluField.setText("");
        dataIniField.setText("");
        dataFimField.setText("");
    }

    private void teste() {
        for (int i = 0; i < aplGerenciarCurso.lstCursos.size(); i++) {
            cursoComboBox.addItem(aplGerenciarCurso.lstCursos.get(i));
            //cbmCurso.addElement(aplGerenciarCurso.lstCursos.get(i));
            System.out.println(aplGerenciarCurso.lstCursos.get(i));
        }
        for (int j = 0; j < aplGerenciarPessoas.lstProfessor.size(); j++) {
            profComboBox.addItem(aplGerenciarPessoas.lstProfessor.get(j));
            //cbmProfessor.addElement(aplGerenciarPessoas.lstProfessor.get(j));
            System.out.println(aplGerenciarPessoas.lstProfessor.get(j));
        }
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(8, 2, new Insets(0, 0, 0, 0), -1, -1));
        cadastrarButton = new JButton();
        cadastrarButton.setText("Cadastrar");
        panel.add(cadastrarButton, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        dataFimField = new JTextField();
        panel.add(dataFimField, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        dataIniField = new JTextField();
        panel.add(dataIniField, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        limiteAluField = new JTextField();
        panel.add(limiteAluField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        horarioField = new JTextField();
        panel.add(horarioField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Horário:");
        panel.add(label1, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Limite Alunos:");
        panel.add(label2, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Data Inicio:");
        panel.add(label3, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Data Fim:");
        panel.add(label4, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        profComboBox = new JComboBox();
        panel.add(profComboBox, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cursoComboBox = new JComboBox();
        panel.add(cursoComboBox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Professor:");
        panel.add(label5, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Curso");
        panel.add(label6, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
