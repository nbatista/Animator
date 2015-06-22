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
public class Circle {
    private int i;
    private int j;
    private int width;
    private int height;
    String rout;

    
    public Circle(int i, int j, String rout) {
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

    public String getrout() {
        return rout;
    }

    public void setrout(String rout) {
        this.rout = rout;
    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(i, j, width, width);
    }  
}
