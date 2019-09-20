import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoinTest extends JPanel implements ActionListener{
private Coin coin;

public CoinTest (){
        Image heads = (new ImageIcon("D:\\Pictures\\APCS\\APCompSci\\Classwork\\head.jpg")).getImage();
        Image tails = (new ImageIcon("D:\\Pictures\\APCS\\APCompSci\\Classwork\\tail.jpg")).getImage();
        coin = new Coin(heads, tails);

        Timer clock = new Timer(2000, this);
        clock.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int x = getWidth() / 2;
        int y = getHeight() / 2;
        coin.draw(g, x, y);
    }

    public void actionPerformed(ActionEvent e){
        coin.flip();
        repaint();
    }

    public static void main(String[] args)
        {
            JFrame w = new JFrame("Flipping coin");
            w.setSize(1155, 1155);
            w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CoinTest panel = new CoinTest();
            panel.setBackground(Color.WHITE);
            Container c = w.getContentPane();
            c.add(panel);

            w.setVisible(true);
        }
    }
