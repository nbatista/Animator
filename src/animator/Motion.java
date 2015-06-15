/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;

/**
 *
 * @author nbati_000
 */
public class Motion {
    double rout;
    int i;
    int j;
    Dimension D;

    public Motion(int i, int j, Dimension D) {
        this.i = i;
        this.j = j;
        this.D = D;
        rout = 1.2;
    }
    
    public Motion(int[] a){
        i = a[0];
        j = a[1];
    }
    
   
    
    public int linear(int i, int j){
        if (i >  (int)(D.getWidth())){
            return -30;
        }
        i += 10;
        return i;
    }
}
