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
        //test case 1
        System.out.println("\tTest Case #1");
        
        double radius = 3.0;
        double numberOfBombs = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 226.8;
        double result = instance.calcVolumeOfBombs(radius, numberOfBombs);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}