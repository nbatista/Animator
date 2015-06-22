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
public class LinearV {
    int j;
    Dimension D;

    public LinearV(int j, Dimension D) {
        this.j = j;
        this.D = D;
    }
    
   
    
    public int linear(int j){
        if (j >  (int)(D.getHeight())){
            return 0;
        }
        j += 3;
        return j;
    }    
}
