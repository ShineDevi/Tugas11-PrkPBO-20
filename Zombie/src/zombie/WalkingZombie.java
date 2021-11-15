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
public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level){
        super.health=health;
        super.level=level;
    }
    @Override
    public void heal(){
        if (super.level==1) {
            super.health=(int) (super.health+(super.health*0.1));
        } else if (this.level==2) {
            super.health=(int) (super.health+(super.health*0.3));
        } else if (this.level==3) {
            super.health=(int) (super.health+(super.health*0.4));
        }
    }
    @Override
    public void destroyed(){
        super.health=(int) (super.health-(super.health*0.02));
    }
    
    @Override
    public String getZombieInfo(){
        System.out.println("Walking Zombie Data");
        return super.getZombieInfo();
    }
    
}
