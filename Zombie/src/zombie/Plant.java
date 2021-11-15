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
public class Plant {
    public void doDestroy(IDestroyable b){
        if (b instanceof WalkingZombie) {
            WalkingZombie wz=(WalkingZombie)b;
            wz.destroyed();
            System.out.println(""+wz.getZombieInfo());
            
        } else if (b instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie)b;
            jz.destroyed();
            System.out.println(""+jz.getZombieInfo());
            
        } else if (b instanceof Barrier){
            Barrier br = (Barrier)b;
            br.destroyed();
            System.out.println(""+br.getBarrierInfo());
        }
    }
}
