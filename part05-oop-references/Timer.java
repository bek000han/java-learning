/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hunds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hunds = new ClockHand(100);
    }
    
    public void advance() {
        this.hunds.advance();
        if (this.hunds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.hunds;
    }
}
