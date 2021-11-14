package sistema.ciu;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import sistema.cci.ControladorPrincipal;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.MaskFormatter;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.ParseException;
import java.util.Locale;

public class JanCadProfessor extends JFrame {
    private JButton cadastrarButton;
    private JPanel panel;
    private JTextField titulacaoField;
    private JTextField dataNascField;
    private JTextField cpfField;
    private JTextField nomeField;
    private final ControladorPrincipal controladorPrincipal;

    public JanCadProfessor(ControladorPrincipal controladorPrincipal) throws ParseException {

        nomeField.setBorder(BorderFactory.createEmptyBorder());
        cpfField.setBorder(BorderFactory.createEmptyBorder());
        dataNascField.setBorder(BorderFactory.createEmptyBorder());
        titulacaoField.setBorder(BorderFactory.createEmptyBorder());

        nomeField.setDocument(new Reg());
        cpfField.setDocument(new Reg3());
        cadastrarButton.addActionListener(e -> cadastrar());

        MaskFormatter dataFormatter = new MaskFormatter("####/##/##");
        dataFormatter.install((JFormattedTextField) dataNascField);

        this.controladorPrincipal = controladorPrincipal;

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setContentPane(panel);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exJanPrin();
            }
        });
    }

    private void cadastrar() {
        controladorPrincipal.cadastrarProfessor(nomeField.getText(), Date.valueOf(dataNascField.getText()), Long.parseLong(cpfField.getText()), titulacaoField.getText());
        nomeField.setText("");
        dataNascField.setText("");
        cpfField.setText("");
        titulacaoField.setText("");
    }

    public void exJanPrin() {
        controladorPrincipal.exibirJanPrincipal();
        this.dispose();
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
        panel.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel.setBackground(new Color(-14738400));
        cadastrarButton = new JButton();
        cadastrarButton.setBackground(new Color(-12961222));
        cadastrarButton.setBorderPainted(false);
        cadastrarButton.setFocusPainted(false);
        cadastrarButton.setFocusable(true);
        cadastrarButton.setForeground(new Color(-257));
        cadastrarButton.setOpaque(true);
        cadastrarButton.setText("Cadastrar");
        panel.add(cadastrarButton, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        titulacaoField = new JTextField();
        panel.add(titulacaoField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        cpfField = new JTextField();
        panel.add(cpfField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        nomeField = new JTextField();
        panel.add(nomeField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-257));
        label1.setText("Nome:");
        panel.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-257));
        label2.setText("CPF:");
        panel.add(label2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setForeground(new Color(-257));
        label3.setText("Data Nascimento:");
        panel.add(label3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setForeground(new Color(-257));
        label4.setHorizontalAlignment(11);
        label4.setText("Titulacao:");
        panel.add(label4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dataNascField = new JFormattedTextField();
        Font dataNascFieldFont = this.$$$getFont$$$(null, -1, 14, dataNascField.getFont());
        if (dataNascFieldFont != null) dataNascField.setFont(dataNascFieldFont);
        panel.add(dataNascField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
