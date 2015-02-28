/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//THIS IS MY JUNIT TEST FOR MY CONTROL LAYER CLASS

package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author travi_000
 */
public class WaterDrumControlTest {
    
    public WaterDrumControlTest() {
    }

    /**
     * Test of calcVolumeOfWaterDrum method, of class WaterDrumControl.
     */
    @Test
    public void testCalcVolumeOfWaterDrum() {
        
        /***********************
         * Test Case #1
         ***********************/
        
        //Input values for test case #1
        
        double height = 6.0;
        
        double expResult = 75.3982236861550377;
        
        //Create an Instance of WaterDrumControl
        WaterDrumControl instance = new WaterDrumControl();
        
        //Compare expected return value with actual vlue returned
        double result = instance.calcVolumeOfWaterDrum(height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeOfWaterDrum TEST #1 ACCEPTABLE VALUE SUCCESS");
        
        
        /***********************
         * Test Case #2
         ***********************/
        
        //Input values for test case #2
        
        height = 'a';   //Height is NaN
        
        expResult = -1.0;
        
        //Compare expected return value with actual vlue returned
        result = instance.calcVolumeOfWaterDrum(height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeOfWaterDrum TEST #2 NaN SUCCESS");
        
        
        /***********************
         * Test Case #3
         ***********************/
        
        //Input values for test case #3
        
        height = -15.0;    //This number is lower than the low boundary set
        
        expResult = -1.0;
        
        //Compare expected return value with actual vlue returned
        result = instance.calcVolumeOfWaterDrum(height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeOfWaterDrum TEST #3 BELOW BOUNDARY SUCCESS");
     
        
        /***********************
         * Test Case #4
         ***********************/
        
        //Input values for test case #4
        
        height = 13.0;   //This number is higher that the high boundary set.
        
        expResult = -1;
        
        //Compare expected return value with actual vlue returned
        result = instance.calcVolumeOfWaterDrum(height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeOfWaterDrum TEST #4 ABOVE BOUNDARY SUCCESS");
        
        
        /***********************
         * Test Case #5
         ***********************/
        
        //Input values for test case #5
        
        height = 3.0;
        
        expResult = 37.6991118430775189;
        
        //Compare expected return value with actual vlue returned
        result = instance.calcVolumeOfWaterDrum(height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeOfWaterDrum TEST #5 ACCEPTABLE VALUE SUCCESS");

    }
    
}
