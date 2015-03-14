/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ches
 */
public class Game implements Serializable {
    private String winner;
    private double time;
    
    private Actor[] actor;
    private Map map;
    private Jeep jeep;
    private Player player;
    private Item[] item;
  // constuctor function

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Jeep getJeep() {
        return jeep;
    }

    public void setJeep(Jeep jeep) {
        this.jeep = jeep;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem (Item[] item) {
        this.item = item;
    }

    public Game() {
    }

    // getter and setter functions
    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
 // toString function

    @Override
    public String toString() {
        return "Game{" + "winner=" + winner + ", time=" + time + '}';
    }
 // equals and hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.winner);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.winner, other.winner)) {
            return false;
        }
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        return true;
    }    
}
