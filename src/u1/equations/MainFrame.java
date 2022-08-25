package u1.equations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton buttonCalculate;
    private JButton buttonClear;
    private final Font font = new Font("Courier", Font.BOLD, 20);

    public MainFrame() {
        super("2nd grade equations");
        initComponents();
        paintView();
    }

    private void initComponents() {
        OnlyNumbersKeyListener onlyNumbersKeyListener = new OnlyNumbersKeyListener();
        textFieldA = new JTextField(10);
        textFieldB = new JTextField(10);
        textFieldC = new JTextField(10);
        buttonCalculate = new JButton("Calculate");
        buttonClear = new JButton("Clear");
        textFieldA.addKeyListener(onlyNumbersKeyListener);
        textFieldB.addKeyListener(onlyNumbersKeyListener);
        textFieldC.addKeyListener(onlyNumbersKeyListener);
        buttonCalculate.addActionListener(this);
        buttonClear.addActionListener(this);
    }

    private void paintView() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(Color.BLACK);
        textFieldA.setFont(font);
        textFieldB.setFont(font);
        textFieldC.setFont(font);
        buttonCalculate.setFont(font);
        buttonClear.setFont(font);
        add(textFieldA);
        add(textFieldB);
        add(textFieldC);
        add(buttonCalculate);
        add(buttonClear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonCalculate) {
            if (validateFields()) calculate();
            else JOptionPane.showMessageDialog(null, "Please fill in all the fields");
        } else if (source == buttonClear) clearFields();
    }

    private boolean validateFields() {
        return !textFieldA.getText().isEmpty() && !textFieldB.getText().isEmpty() && !textFieldC.getText().isEmpty();
    }

    private void calculate() {
        double a = Double.parseDouble(textFieldA.getText());
        double b = Double.parseDouble(textFieldB.getText());
        double c = Double.parseDouble(textFieldC.getText());
        double radicand = Math.pow(b, 2) - 4 * a * c;
        if (radicand >= 0) {
            double x1 = (-b + Math.sqrt(radicand)) / 2 * a;
            double x2 = (-b - Math.sqrt(radicand)) / 2 * a;
            JOptionPane.showMessageDialog(null, String.format("X1: %.2f\nX2: %.2f", x1, x2));
        } else JOptionPane.showMessageDialog(null, "Complex numbers");
    }

    private void clearFields() {
        textFieldA.setText("");
        textFieldB.setText("");
        textFieldC.setText("");
    }
}
