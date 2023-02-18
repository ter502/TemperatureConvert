/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverclient;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mybean.TemperatureConvertBeanRemote;

/**
 *
 * @author eiwte
 */
public class MyThread extends Thread{
    TemperatureConvertBeanRemote tempBean = lookupTemperatureConvertBeanRemote();
    private int f;
    
    public MyThread(int f) {
        this.f = f;
    }
    
    @Override
    public void run() {
        System.out.println(f + " Fahrenheit = " + tempBean.fToc(f) + " Celsius");
    }
    
    private TemperatureConvertBeanRemote lookupTemperatureConvertBeanRemote() {
        try {
            Context c = new InitialContext();
            return (TemperatureConvertBeanRemote) c.lookup("java:comp/env/TemperatureConvertBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
