/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180;

/**
 *
 * @author MTD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread1 thread1 = new Thread1(sharedData);
        Thread2 thread2 = new Thread2(sharedData);
        thread1.start();
        thread2.start();

    }

}
