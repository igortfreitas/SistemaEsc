package sistema.ciu;

import com.intellij.uiDesigner.core.Spacer;
import sistema.cci.ControladorPrincipal;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;

public class JanPrincipal extends JFrame {
    private JPanel panel;
    private JButton cursoButton;
    private JButton alunoButton;
    private JButton professorButton;
    private JButton turmaButton;
    private JButton matriculaButton;

    public JanPrincipal(ControladorPrincipal controladorPrincipal) {
        super("SistemaEscolar");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
        this.setContentPane(panel);

        cursoButton.addActionListener(e -> controladorPrincipal.exibirJanCadCurso());
        alunoButton.addActionListener(e -> controladorPrincipal.exibirJanCadAluno());
        professorButton.addActionListener(e -> {
            try {
                controladorPrincipal.exibirJanCadProfessor();
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        });
        turmaButton.addActionListener(e -> controladorPrincipal.exibirJanCadTurma());

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
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel.setBackground(new Color(-14738400));
        panel.setForeground(new Color(-14738400));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1);
        professorButton = new JButton();
        professorButton.setBackground(new Color(-12961222));
        professorButton.setBorderPainted(false);
        professorButton.setFocusPainted(false);
        professorButton.setFocusable(false);
        professorButton.setForeground(new Color(-257));
        professorButton.setHorizontalAlignment(0);
        professorButton.setOpaque(true);
        professorButton.setText("Professor");
        panel.add(professorButton);
        cursoButton = new JButton();
        cursoButton.setAlignmentY(0.0f);
        cursoButton.setBackground(new Color(-12961222));
        cursoButton.setBorderPainted(false);
        cursoButton.setFocusPainted(false);
        cursoButton.setFocusable(false);
        cursoButton.setForeground(new Color(-257));
        cursoButton.setHorizontalAlignment(0);
        cursoButton.setHorizontalTextPosition(0);
        cursoButton.setIconTextGap(-1);
        cursoButton.setOpaque(true);
        cursoButton.setText("Curso");
        panel.add(cursoButton);
        matriculaButton = new JButton();
        matriculaButton.setBackground(new Color(-12961222));
        matriculaButton.setBorderPainted(false);
        matriculaButton.setFocusPainted(false);
        matriculaButton.setFocusable(false);
        matriculaButton.setForeground(new Color(-257));
        matriculaButton.setHorizontalAlignment(0);
        matriculaButton.setHorizontalTextPosition(0);
        matriculaButton.setOpaque(true);
        matriculaButton.setText("Matricula");
        panel.add(matriculaButton);
        alunoButton = new JButton();
        alunoButton.setBackground(new Color(-12961222));
        alunoButton.setBorderPainted(false);
        alunoButton.setFocusPainted(false);
        alunoButton.setFocusable(false);
        alunoButton.setForeground(new Color(-257));
        alunoButton.setHorizontalAlignment(0);
        alunoButton.setHorizontalTextPosition(0);
        alunoButton.setOpaque(true);
        alunoButton.setText("Aluno");
        panel.add(alunoButton);
        turmaButton = new JButton();
        turmaButton.setBackground(new Color(-12961222));
        turmaButton.setBorderPainted(false);
        turmaButton.setFocusPainted(false);
        turmaButton.setFocusable(false);
        turmaButton.setForeground(new Color(-257));
        turmaButton.setHorizontalAlignment(0);
        turmaButton.setHorizontalTextPosition(0);
        turmaButton.setOpaque(true);
        turmaButton.setText("Turma");
        panel.add(turmaButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
