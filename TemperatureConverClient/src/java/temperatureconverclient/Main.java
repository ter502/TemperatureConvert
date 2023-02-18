/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverclient;

import java.util.Scanner;

/**
 *
 * @author eiwte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f;
        
        System.out.print("Enter degree in Fahrenheit: ");
        f = input.nextInt();
        
        MyThread myThread = new MyThread(f);
        myThread.start();
        
        try {
            myThread.join();
        }
        catch(InterruptedException e) {
            
        }
    }
    
}
