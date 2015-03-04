/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ches
 */
public class InfectionRateTest {
    
    public InfectionRateTest() {
    }

    /**
     * Test of calcInfectionRate method, of class InfectionRate.
     */
    @Test
    public void testCalcInfectionRate() {
        System.out.println("calcInfectionRate");
         // Test Case #1/ 
        System.out.println("\tTest case #1");
        double daysInMonth = 30.0;
        double population = 1000.0;
        double Infected = 400.0;
        InfectionRate instance = new InfectionRate();
        double expResult = 1.33;
        double result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
        // TODO review the generated test code and remove the default call to fail.
    
     // Test Case #2/ 
        System.out.println("\tTest case #2");
         daysInMonth = 27.0;
         population = 1000.0;
        Infected = 400.0;
      
         expResult = -1;
         result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
         // Test Case #3/ 
        System.out.println("\tTest case #3");
         daysInMonth = 30.0;
         population = -1000.0;
        Infected = 400.0;
      
         expResult = -1;
         result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
     // Test Case #4/ 
        System.out.println("\tTest case #4");
         daysInMonth = 30.0;
         population = 1000.0;
        Infected = -400.0;
      
         expResult = -1;
         result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
         // Test Case #5/ 
        System.out.println("\tTest case #5");
         daysInMonth = 33.0;
         population = 1000.0;
        Infected = 400.0;
      
         expResult = -1;
         result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
         // Test Case #6/ 
        System.out.println("\tTest case #6");
         daysInMonth = 'a';
         population = 1000.0;
        Infected = 400.0;
      
         expResult = -1;
         result = instance.calcInfectionRate(daysInMonth, population, Infected);
        assertEquals(expResult, result, 0.004);
    }
}
