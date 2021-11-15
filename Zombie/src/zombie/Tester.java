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
public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz=new WalkingZombie(100,1);
        JumpingZombie jz=new JumpingZombie(100,2);
        Barrier b = new Barrier(100);
        Plant p=new Plant();
        System.out.println(""+wz.getZombieInfo());
        System.out.println("");
        System.out.println(""+jz.getZombieInfo());
        System.out.println("");
        System.out.println(""+b.getBarrierInfo());
        System.out.println("");
        System.out.println("----------------------");
        for (int i = 0; i < 32; i++) {
            wz.destroyed();
            jz.destroyed();
            b.destroyed();
        }
        p.doDestroy(wz);
        p.doDestroy(jz);
        p.doDestroy(b);
        
    }
}
