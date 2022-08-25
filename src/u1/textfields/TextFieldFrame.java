package u1.textfields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;

    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());
        textField1 = new JTextField(20);
        add(textField1);
        textField2 = new JTextField("Texto escrido desde codigo");
        add(textField2);
        textField3 = new JTextField("Campo no editable", 20);
        textField3.setEditable(false);
        add(textField3);
        passwordField = new JPasswordField("Texto oculto");
        add(passwordField);
        TextFieldManager manager = new TextFieldManager();
        textField1.addActionListener(manager);
        textField2.addActionListener(manager);
        textField3.addActionListener(manager);
        passwordField.addActionListener(manager);
    }

    private class TextFieldManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "";
            Object source = e.getSource();
            if (textField1.equals(source)) s = "Campo 1: ";
            else if (textField2.equals(source)) s = "Campo 2: ";
            else if (textField3.equals(source)) s = "Campo 3: ";
            else if (passwordField.equals(source)) s = "Campo Contrasena: ";
            showMessage(s, e);
        }

        private void showMessage(String message, ActionEvent e) {
            JOptionPane.showMessageDialog(null, message + e.getActionCommand());
        }
    }
}


