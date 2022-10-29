package u3.carrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainJFrame extends JFrame implements ActionListener {
    JButton jButtonStart;
    JLabel jLabelPodium;
    List<Barra> barras;

    public MainJFrame() {
        super("Carreritas");
        barras = new ArrayList<>();
        initComponents();
        paint();
    }

    public void initComponents() {
        jButtonStart = new JButton("Start");
        jButtonStart.addActionListener(this);
        jLabelPodium = new JLabel();
    }

    public void paint() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(jButtonStart);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numberOfBars = Integer.parseInt(JOptionPane.showInputDialog("Numero de barras"));
        for (int i = 1; i <= numberOfBars; i++) {
            JProgressBar progressBar = new JProgressBar();
            JLabel label = new JLabel("0%");
            add(label);
            add(progressBar);
            Barra barra = new Barra("Barra " + i, progressBar, label);
            barras.add(barra);
        }
        add(jLabelPodium);
        barras.forEach(Barra::start);
    }

    private class Barra extends Thread implements Comparable<Barra> {
        JProgressBar jProgressBar;
        JLabel jLabel;
        private int percentage;
        private final Random random = new Random();

        private final String name;
        private boolean gameOver = false;

        public Barra(String name, JProgressBar jProgressBar, JLabel jLabel) {
            this.name = name;
            this.jProgressBar = jProgressBar;
            this.jLabel = jLabel;
        }

        @Override
        public void run() {
            while (percentage < 100 && !gameOver) {
                sleep();
                percentage += random.nextInt(3);
                jLabel.setText("" + percentage + "%");
                jProgressBar.setValue(percentage);
                updatePodium();
            }
            if (!gameOver) gameOver();
        }

        private void sleep() {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public int getPercentage() {
            return percentage;
        }

        @Override
        public int compareTo(Barra o) {
            return Integer.compare(this.getPercentage(), o.getPercentage());
        }

        @Override
        public String toString() {
            return name;
        }

        public void setGameOver(boolean gameOver) {
            this.gameOver = gameOver;
        }
    }

    private void updatePodium() {
        Collections.sort(barras);
        Collections.reverse(barras);
        jLabelPodium.setText(String.format("<html><body>Primer lugar: %s<br> Segundo lugar: %s<br> Tercer lugar: %s</body></html>",
                barras.get(0),
                barras.get(1),
                barras.get(2)
        ));
    }

    private void gameOver() {
        barras.forEach(barra -> barra.setGameOver(true));
        updatePodium();
    }
}
