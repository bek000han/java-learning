/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Hideout<T> {
    private T t;

    public Hideout() {
        this.t = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }
    
    public T takeFromHideout() {
        T takenOut = this.t;
        this.t = null;
        return takenOut;
    }
    
    public boolean isInHideout() {
        if (this.t == null) {
            return false;
        } else {
            return true;
        }
    }
}
