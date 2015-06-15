/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author nbati_000
 */
public class Rectangle {
    private int i;
    private int j;
    private int width;
    private int height;
    String rout;

    
    public Rectangle(int i, int j, String rout) {
        this.i = i;
        this.j = j;
        this.width = 100;
        this.height = 50;
        this.rout = rout;
    }

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

    
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillRect(i, j, width, height);
    }

    
}
