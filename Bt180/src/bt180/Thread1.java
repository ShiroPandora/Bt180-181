/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MTD
 */
public class Thread1 extends Thread {

    SharedData data;

    public Thread1(SharedData data) {
        this.data = data;
    }

    //SharedData sharedData = new SharedData();
    @Override
    public void run() {

        Random random = new Random();

        while (true) {
            if (data.getTotal() < 100 && data.getTotal() > -100) {
                int nb = random.nextInt(100);
                System.out.println("T1:" + nb);
                data.add(nb);
                System.out.println("Total:" + data.getTotal());
            } else {
                this.stop();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
