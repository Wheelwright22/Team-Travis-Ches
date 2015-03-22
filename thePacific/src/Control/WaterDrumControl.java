/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.WaterDrumControlException;

/**
 *
 * @author travi_000
 */
public class WaterDrumControl {
    public double calcVolumeOfWaterDrum(double height) throws WaterDrumControlException{
        
        if (height == Double.NaN ){
           //Height is not number.
        throw new WaterDrumControlException("Your Input Is Not A Number.");
        }
        if (height <= 0){
            //Height is 0 or a negative number?
        throw new WaterDrumControlException("Your Input Is Too Low.");
        }
        if (height > 10){
            //Height is out of range / boundary.
        throw new WaterDrumControlException("Your Input Is Too High.");
        }
        
        
        double radius = 2;
        double volume = (Math.PI * Math.pow(radius,2) * height);
        
        return volume;

     
        
    }
}
