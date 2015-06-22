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
public class LinearH {
    int i;
    Dimension D;

    public LinearH(int i, Dimension D) {
        this.i = i;
        this.D = D;
    }
    
   
    
    public int linear(int i){
        if (i >  (int)(D.getWidth())){
            return 0;
        }
        i += 3;
        return i;
    }
}
