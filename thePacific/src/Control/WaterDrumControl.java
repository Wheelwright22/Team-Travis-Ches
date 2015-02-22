/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author travi_000
 */
public class WaterDrumControl {
    public double calcVolumeOfWaterDrum(double height, double radius){
        
        if (height == Double.NaN ){
           //Height is not number.
           return -1; 
        }
        if (height <= 0){
            //Height is 0 or a negative number?
            return -1;
        }
        if (height > 10){
            //Height is out of range / boundary.
            return -1;
        }
	if (radius == Double.NaN ){
            //Radius is not a number.
            return -1;
        }
	if (radius <= 0){
            //Radius is 0 or a negative number?
            return -1;
        }
	if (radius > 3){
            //Radius is out of range / boundary.
            return -1;
        }
		
        double volume= (Math.PI * Math.pow(radius,2) * height);
        
        return volume;

     
        
    }
}
