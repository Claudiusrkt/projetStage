package View;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    private static final int DIAMETER = 30;
    private int angle = 0;
    public void animate(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animation de Chargement");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(new BorderLayout());

            Animation animation = new Animation();
            animation.LoadingAnimation();
            frame.add(animation);
            frame.setVisible(true);
            animation.start();
        });
    }
    public void LoadingAnimation() {
        setPreferredSize(new Dimension(100, 100));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);
        g2d.fillArc(20, 20, DIAMETER, DIAMETER, angle, 120);

        g2d.setColor(Color.GRAY);
        g2d.fillArc(20, 20, DIAMETER, DIAMETER, angle + 120, 120);

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillArc(20, 20, DIAMETER, DIAMETER, angle + 240, 120);
    }

    public void start() {
        Timer timer = new Timer(100, e -> {
            angle = (angle + 10) % 360;
            repaint();
        });
        timer.start();
    }
}

