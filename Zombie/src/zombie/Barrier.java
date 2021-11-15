/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie;

/**
 *
 * @author -LENOVO-
 */
public class Barrier implements IDestroyable{
    private int strength;
    Barrier(int strength){
        this.strength=strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    
    @Override
    public void destroyed(){
        this.strength=(int) (this.strength-(this.strength*0.0104));
    }
    public String getBarrierInfo(){
        System.out.println("");
        return "Strength Barrier: "+this.strength;
    }
}
