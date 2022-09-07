package u1.form;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame {
    private JLabel jLabelMessage;
    private JLabel jLabelAge;
    private JLabel jLabelEntertainment;
    private JRadioButton jRadioButton0to5;
    private JRadioButton jRadioButton6to10;
    private JRadioButton jRadioButton11to15;
    private JRadioButton jRadioButton16to20;
    private JCheckBox jCheckBoxPool;
    private JCheckBox jCheckBoxPiano;
    private JCheckBox jCheckBoxBasketball;
    private final ViewController viewController = new ViewController();
    public MainFrame() {
        super("Formulario");
        initComponents();
        paintView();
    }

    private void initComponents() {
        EntertainmentItemListener entertainmentItemListener = new EntertainmentItemListener();
        jLabelMessage = new JLabel("");
        jLabelAge = new JLabel("Edad:");
        jLabelEntertainment = new JLabel("Entretenimiento: ");
        jRadioButton0to5 = new JRadioButton("0 to 5");
        jRadioButton0to5.addItemListener(new AgeItemListener("0 to 5"));
        jRadioButton6to10 = new JRadioButton("6 to 10");
        jRadioButton6to10.addItemListener(new AgeItemListener("6 to 10"));
        jRadioButton11to15 = new JRadioButton("11 to 15");
        jRadioButton11to15.addItemListener(new AgeItemListener("11 to 15"));
        jRadioButton16to20 = new JRadioButton("16 to 20");
        jRadioButton16to20.addItemListener(new AgeItemListener("16 to 20"));
        ButtonGroup buttonGroupAge = new ButtonGroup();
        buttonGroupAge.add(jRadioButton0to5);
        buttonGroupAge.add(jRadioButton6to10);
        buttonGroupAge.add(jRadioButton11to15);
        buttonGroupAge.add(jRadioButton16to20);
        jCheckBoxPool = new JCheckBox("Alberca");
        jCheckBoxPool.addItemListener(entertainmentItemListener);
        jCheckBoxPiano = new JCheckBox("Piano");
        jCheckBoxPiano.addItemListener(entertainmentItemListener);
        jCheckBoxBasketball = new JCheckBox("Basquet");
        jCheckBoxBasketball.addItemListener(entertainmentItemListener);
    }

    private void paintView() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        JPanel jPanelForm = new JPanel();
        JPanel jPanelAge = new JPanel();
        JPanel jPanelEntertainment = new JPanel();
        JPanel jPanelMessage = new JPanel();

        GridLayout gridLayout = new GridLayout(0, 2);
        jPanelForm.setLayout(gridLayout);
        jPanelAge.setLayout(new BoxLayout(jPanelAge, BoxLayout.PAGE_AXIS));
        jPanelEntertainment.setLayout(new BoxLayout(jPanelEntertainment, BoxLayout.PAGE_AXIS));
        jPanelMessage.setLayout(new FlowLayout(FlowLayout.CENTER));

        jPanelAge.setBorder(padding);
        jPanelEntertainment.setBorder(padding);
        jPanelMessage.setBorder(padding);

        jPanelForm.add(jPanelAge);
        jPanelForm.add(jPanelEntertainment);
        add(jPanelForm);

        jPanelAge.add(jLabelAge);
        jPanelAge.add(jRadioButton0to5);
        jPanelAge.add(jRadioButton6to10);
        jPanelAge.add(jRadioButton11to15);
        jPanelAge.add(jRadioButton16to20);

        jPanelEntertainment.add(jLabelEntertainment);
        jPanelEntertainment.add(jCheckBoxPool);
        jPanelEntertainment.add(jCheckBoxPiano);
        jPanelEntertainment.add(jCheckBoxBasketball);

        jPanelMessage.add(jLabelMessage);
        add(jPanelMessage);
    }


    private class EntertainmentItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            viewController.setPool(jCheckBoxPool.isSelected());
            viewController.setPiano(jCheckBoxPiano.isSelected());
            viewController.setBasketball(jCheckBoxBasketball.isSelected());
            jLabelMessage.setText(viewController.getMessage());
        }
    }

    private class AgeItemListener implements ItemListener {
        private final String ageRange;

        public AgeItemListener(String ageRange) {
            this.ageRange = ageRange;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            viewController.setAgeRange(ageRange);
            jLabelMessage.setText(viewController.getMessage());
        }
    }
}
