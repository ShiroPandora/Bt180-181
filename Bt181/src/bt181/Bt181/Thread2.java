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
public class Thread2 extends Thread {

    Manager data;

    public Thread2(Manager data) {
        this.data = data;
    }

    @Override
    public void run() {

        Random random = new Random();

        synchronized (data) {
            while (true) {

                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                int charAscii = (int) data.getData();
                System.out.println((char) (charAscii - 32));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

}
