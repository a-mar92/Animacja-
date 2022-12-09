import javax.swing.*;
import java.awt.*;
public class Main {
    int y = 75;
    int x = 75;
    public static void main(String[] args) {
        Main main = new Main();
        main.ramka();
    }
    public void ramka() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MojPanel panel = new MojPanel();

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            panel.repaint();

            try {
                Thread.sleep(25);
            } catch (Exception e) {
            }
        }
    }
    private class MojPanel extends JPanel {

        public void paintComponent(Graphics g) {

            g.setColor(Color.blue);
            g.fillOval(x, y, 40, 40);
        }
            }
}