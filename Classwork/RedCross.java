import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
* This program displays a red cross on a white
* background.
* Zawad Munshi, Period 3

* Bronx High School of Science Department of Mathematics, Computer Science & Technology
* Dr. Jean Donahue, Principal Mr. Vikram Arora, Assistant Principal
* AP Computer Science, Instructor: Ms. Qiu
*/

public class RedCross extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        g.fillRect(xCenter, yCenter, 10, 50);
        g.fillRect(xCenter, yCenter, 50, 10);
        g.fillRect(xCenter, yCenter, 10, -40);
        g.fillRect(xCenter, yCenter, -40, 10);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedCross panel = new RedCross();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}