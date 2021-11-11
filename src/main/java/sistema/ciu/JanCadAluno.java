/*
 * Created by JFormDesigner on Wed Nov 10 21:28:34 BRT 2021
 */

package sistema.ciu;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Igor Tamagnoni de Freitas
 */
public class JanCadAluno extends JFrame {
    public JanCadAluno() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        cadastrarButton = new JButton();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- cadastrarButton ----
        cadastrarButton.setText("Cadastrar");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(cadastrarButton)
                            .addGap(209, 209, 209))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                            .addGap(146, 146, 146))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 257, Short.MAX_VALUE)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cadastrarButton))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton cadastrarButton;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
