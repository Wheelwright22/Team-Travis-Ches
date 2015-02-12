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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfBombs method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBombs() {
        System.out.println("calcVolumeOfBombs");
        // Test Case #1/ 
        System.out.println("\tTest case #1");
        double radius = 3.0;
        double numberOfBombs = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 226.19;
        double result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.03);
        
         // Test Case 2/ 
        System.out.println("\tTest case #2");
        radius = -3.0;
        numberOfBombs = 2.0;
     
        expResult = -1.0;
        result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.03);
      
          // Test Case 3/ 
        System.out.println("\tTest case #3");
        radius = 3.0;
        numberOfBombs = -2.0;
     
        expResult = -1.0;
        result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.03);
        
          // Test Case 4/ 
        System.out.println("\tTest case #4");
        radius = 'a';
        numberOfBombs = 2.0;
     
        expResult = -1.0;
        result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.03);
        
             // Test Case 5/ 
        System.out.println("\tTest case #5");
        radius = 3.0;
        numberOfBombs = 'a';
  
        expResult = -1.0;
        result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.03);
        
        
    }
    
}
