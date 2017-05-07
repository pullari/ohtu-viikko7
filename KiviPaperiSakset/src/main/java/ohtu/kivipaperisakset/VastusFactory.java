/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.pelimoodit.*;

/**
 *
 * @author pullis
 */
public class VastusFactory {
    
    public static KPSPelaajaVsPelaaja getPelaaja(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPSTekoaly getTekoaly(){
        return new KPSTekoaly();
    }
    
    public static KPSParempiTekoaly getParempiTekoaly(){
        return new KPSParempiTekoaly();
    }
}
