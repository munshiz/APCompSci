import java.awt.Image;
import java.awt.Graphics;

public class Coin{
    
    private boolean whichCoin = true;
    private Image head;
    private Image tail;

    public Coin(Image h, Image t){
        head = h;
        tail = t;
        }

    public void flip(){ 
        whichCoin = !whichCoin;
    }

    public void draw(Graphics g, int x, int y)
    {
        if (whichCoin){
            g.drawImage(head, 50, 50, null);
        }
        if (!whichCoin){
            g.drawImage(tail, 50, 50, null);
        }
    }
}