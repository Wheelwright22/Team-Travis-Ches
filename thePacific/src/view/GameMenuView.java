/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author travi_000
 */
public class GameMenuView {
    
    void displayMenu() {
        System.out.println("\n*** displayMenu Stub function called *** ");
    }
    public void doAction(char selection){
        switch (selection){
            case 'V'://Travel to new my location
                this.displayMap();
            break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
                
            
        }
    }

    private void viewInventory() {
      System.out.println("viewInventory stub function called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
