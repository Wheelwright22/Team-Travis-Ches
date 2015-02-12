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


    
    @Test
    public void testCalcVolumeOfWaterDrum() {
        
        System.out.println("CalcVolumeOfWaterDrum");
        
        /*******************************
         * Test Case #1
         *******************************/
        System.out.println("\t Test Case #1");
        
        // Input Values For Test Case #1
        double height = 9.0;
        double radius = 2.0;
        
        double expResult = 113.0973355292325566;    //expected output returned value
        
        // Create Instance Of GameControl Class
        GameControl instance = new GameControl();
        
        // Call Function To Run Test
        double result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
 
        /*******************************
         * Test Case #2
         *******************************/
        System.out.println("\t Test Case #2");
        
        // Input Values For Test Case #2
        height = -9.0;
        radius = 2.0;
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
        /*******************************
         * Test Case #3
         *******************************/
        System.out.println("\t Test Case #3");
        
        // Input Values For Test Case #3
        height = 9.0;
        radius = -2.0;
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
        /*******************************
         * Test Case #4
         *******************************/
        System.out.println("\t Test Case #4");
        
        // Input Values For Test Case #4
        height = 'a';
        radius = 2.0;
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
        /*******************************
         * Test Case #5
         *******************************/
        System.out.println("\t Test Case #5");
        
        // Input Values For Test Case #5
        height = 9.0;
        radius = 'z';
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
        /*******************************
         * Test Case #6
         *******************************/
        System.out.println("\t Test Case #6");
        
        // Input Values For Test Case #6
        height = 9.0;
        radius = 0.0;
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
        
        /*******************************
         * Test Case #7
         *******************************/
        System.out.println("\t Test Case #7");
        
        // Input Values For Test Case #7
        height = 9.0;
        radius = 0.0;
        
        expResult = -1;    //expected output returned value
        
        // Call Function To Run Test
        result = instance.calcVolumeOfWaterDrum(height, radius);
        
        //Compare Expected Return Value With Actual Value Returned
        assertEquals(expResult, result, 0.0001);
       
    }
       
    }