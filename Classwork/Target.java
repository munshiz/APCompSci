import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
* This program displays a red Target Logo on a white
* background.
* Zawad Munshi, Period 3
*
* Bronx High School of Science Department of Mathematics, Computer Science & Technology
* Dr. Jean Donahue, Principal Mr. Vikram Arora, Assistant Principal
* AP Computer Science, Instructor: Ms. Qiu
*/

public class Target extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        g.fillOval(xCenter - 50, yCenter - 50, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xCenter - 35, yCenter - 35, 70, 70);
        g.setColor(Color.RED);
        g.fillOval(xCenter - 20, yCenter - 20, 40, 40);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Target panel = new Target();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}