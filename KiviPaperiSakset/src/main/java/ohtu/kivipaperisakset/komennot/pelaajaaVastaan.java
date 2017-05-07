/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.komennot;
import ohtu.kivipaperisakset.VastusFactory;

/**
 *
 * @author pullis
 */
public class pelaajaaVastaan extends Komento {

    @Override
    public void suoritaKomento() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        VastusFactory.getPelaaja().pelaa();
    }
    
}
