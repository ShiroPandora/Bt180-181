/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt181.Bt181;

/**
 *
 * @author MTD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Manager data = new Manager();
        Thread1 thread1 = new Thread1(data);
        Thread2 thread2 = new Thread2(data);

        thread1.start();
        long start = System.currentTimeMillis();
        thread2.start();
    }

}
