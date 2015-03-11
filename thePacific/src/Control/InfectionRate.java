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
public class InfectionRate {
    public double calcInfectionRate(double daysInMonth){
        
 		
		if(daysInMonth < 28){
			return -1;
                }
		if (daysInMonth > 31){
			return -1;
                }
		if(daysInMonth ==Double.NaN){
			return -1;
                }
                double population = 1000;
                double Infected = 100;
      double IR =(Infected/(population* daysInMonth))* 100;
        return IR;
    }
}