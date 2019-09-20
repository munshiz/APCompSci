import java.awt.Image;
import java.awt.Graphics;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Coin{
    
    Graphics g;
    private boolean whichCoin;
    private Image currentImage;
    List<Image> coinSides = new ArrayList<Image>();

    public Coin(Image h, Image t){
        coinSides.add(h); 
        coinSides.add(t);
        whichCoin = true;
        currentImage = coinSides.get(0);
    }

    public void flip(){ 
        if (whichCoin){
            currentImage = coinSides.get(0);
            whichCoin = !whichCoin;
        }
        if (whichCoin == false){
            currentImage = coinSides.get(1);
            whichCoin = !whichCoin;
        }
    }

    public void draw(Graphics g, int x, int y)
    {
        g.drawImage(currentImage, x, y, null);
    }
}