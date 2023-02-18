/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybean;

import javax.ejb.Stateless;

/**
 *
 * @author eiwte
 */
@Stateless
public class TemperatureConvertBean implements TemperatureConvertBeanRemote {
    
    @Override
    public double fToc(int f) {
        return ((5.0/9)*(f-32));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
