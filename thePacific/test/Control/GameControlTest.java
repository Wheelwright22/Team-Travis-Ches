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
 * @author travi_000
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calcVolumeOfWaterDrum method, of class GameControl.
     */
    @Test
    public void testCalcVolumeOfWaterDrum() {
        System.out.println("calcVolumeOfWaterDrum");
        double height = 0.0;
        double radius = 0.0;
        GameControl instance = new GameControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfWaterDrum(height, radius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
