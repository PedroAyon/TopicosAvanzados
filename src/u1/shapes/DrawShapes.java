package u1.shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

public class DrawShapes extends JComponent {
    private Point dragStart;
    private Point dragEnd;
    private Stack<Shape> shapes = new Stack<>();
    private String shapeOption = "rectangle";

    public DrawShapes() {
        super();
        ShapesMouseAdapter shapesMouseAdapter = new ShapesMouseAdapter();
        addMouseListener(shapesMouseAdapter);
        addMouseMotionListener(shapesMouseAdapter);
    }

    private class ShapesMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            dragStart = new Point(e.getX(), e.getY());
            dragEnd = dragStart;
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Shape shape = createShape(dragStart.x, dragStart.y, e.getX(), e.getY());
            shapes.add(shape);
            dragStart = null;
            dragEnd = null;
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            dragEnd = new Point(e.getX(), e.getY());
            repaint();
        }
    }

    private Shape createShape(int x1, int y1, int x2, int y2) {
        return ShapeFactory.create(shapeOption, Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        for (Shape shape : shapes)
            g2.fill(shape);
        if (dragStart != null && dragEnd != null) {
            Shape shape = createShape(dragStart.x, dragStart.y, dragEnd.x, dragEnd.y);
            g2.draw(shape);
        }
    }

    public void setShapeOption(String shapeOption) {
        this.shapeOption = shapeOption;
    }
}
