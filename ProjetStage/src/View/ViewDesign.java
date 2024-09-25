package View;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class ViewDesign extends AbstractBorder {
    private final Color underlineColor = Color.GRAY;
    private final int thickness = 1;

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(underlineColor);
        g.fillRect(x, y + height - thickness, width, thickness);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, thickness, 0);
    }

    public int message(JFrame frame,String message){
        int choice;
        String title = "Confirmation";
        Object[] options = {"Oui", "Non"};
        choice = JOptionPane.showOptionDialog(frame, message, title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        return choice;
    }
}

