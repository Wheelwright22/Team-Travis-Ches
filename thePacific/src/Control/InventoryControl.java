/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


/**
 *
 * @author Ches
 */
public class InventoryControl {
  public static double  calcVolumeOfBombs(double radius,double numberOfBombs){
		
		 if (numberOfBombs < 1){                 
                     //zero bombs?
                     return -1;
                 }
                 
		if (numberOfBombs == Double.NaN) {
		return -1;
                }
		 if (radius < 0.1){
		return -1;
                 }
		if (radius == Double.NaN){
		return -1;
                }
               
              
		double Volume = (((4.0/3.0)* Math.PI *((radius*radius)*radius) ))* numberOfBombs ;
             
		return Volume;
  }

    
    
}
