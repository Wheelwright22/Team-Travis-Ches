/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepacific;

import Model.Game;
import Model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import view.StartProgramView;

/**
 *
 * @author Ches
 */
public class ThePacific {

    private static Game currentGame = new Game();
    private static Player player = new Player();

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        StartProgramView startProgramView = null;
        try {

            //Open Character Stream Files For The End User Input And Output
            ThePacific.inFile = new BufferedReader(new InputStreamReader(System.in));
            ThePacific.outFile = new PrintWriter(System.out, true);

            //Open Log File            
            String filePath = "log.txt";
            ThePacific.logFile = new PrintWriter(filePath);
            startProgramView = new StartProgramView();
            startProgramView.displayMenu();

        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayMenu();
        } finally {
            try {
                if (ThePacific.inFile != null) {
                    ThePacific.inFile.close();
                }

                if (ThePacific.outFile != null) {
                    ThePacific.outFile.close();
                }

                if (ThePacific.logFile != null) {
                    ThePacific.outFile.close();
                }

                if (ThePacific.logFile != null) {
                    ThePacific.outFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error Closing File!");
            }
        }

    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThePacific.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ThePacific.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ThePacific.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ThePacific.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ThePacific.logFile = logFile;
    }
}
