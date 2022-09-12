package u1.shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame {
    private DrawShapes drawShapes;
    private JRadioButton jRadioButtonRectangle;
    private JRadioButton jRadioButtonOval;


    public MainFrame() {
        super("");
        initComponents();
        paintView();
    }

    private void initComponents() {
        drawShapes = new DrawShapes();
        drawShapes.setShapeOption("rectangle");
        ButtonGroup buttonGroupShapes = new ButtonGroup();
        jRadioButtonRectangle = new JRadioButton("Rectangle");
        jRadioButtonOval = new JRadioButton("Oval");
        jRadioButtonRectangle.addItemListener(new ShapeSelectionListener("rectangle"));
        jRadioButtonOval.addItemListener(new ShapeSelectionListener("oval"));
        buttonGroupShapes.add(jRadioButtonRectangle);
        buttonGroupShapes.add(jRadioButtonOval);
    }

    private void paintView() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(drawShapes);
        add(jRadioButtonRectangle);
        add(jRadioButtonOval);
    }

    private class ShapeSelectionListener implements ItemListener {
        private final String shapeOption;

        public ShapeSelectionListener(String shapeOption) {
            this.shapeOption = shapeOption;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            drawShapes.setShapeOption(shapeOption);
        }
    }
}
