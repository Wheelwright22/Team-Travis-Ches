/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author travi_000
 */
public class WaterDrumControlException extends Exception {

    public WaterDrumControlException() {
    }

    public WaterDrumControlException(String string) {
        super(string);
    }

    public WaterDrumControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public WaterDrumControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public WaterDrumControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
