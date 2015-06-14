package animator;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    //Point pos;
    private int i;
    private int j;
    String rout;

    public Image(/*Point pos,*/ BufferedImage img, int i, int j, String rout) {
        //this.pos = pos;
        this.img = img;
        this.i = i;
        this.j = j;
        this.rout = rout;
    }

    //public Point getPos() {
    //    return pos;
    //}
    public int geti() {
        return i;
    }

    public void seti(int i) {
        this.i = i;
    }

    public int getj() {
        return j;
    }

    public void setj(int j) {
        this.j = j;
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, /*(int) pos.getX(), (int) pos.getY()*/i, j, null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move() {
       
    }
}
