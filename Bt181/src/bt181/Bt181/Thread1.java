/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt181.Bt181;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MTD
 */
public class Thread1 extends Thread {

    Manager data;

    public Thread1(Manager data) {
        this.data = data;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }

        String abc = "abcdefghijklmnopqrstuvwxyz";

        Random random = new Random();

        synchronized (data) {
            while (true) {

                char rad = abc.charAt(random.nextInt(26));
                System.out.print("\t" + rad);
                data.setData(rad);
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }

}
