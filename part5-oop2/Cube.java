/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int length) {
        this.edgeLength = length;
    }
    
    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
