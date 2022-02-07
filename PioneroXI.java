
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Pionero XI que hereda de la clase Naves espaciales no tripuladas.
 * @author Marleny Fernández Sandoval
 */
public class PioneroXI extends Unmanned_spacecraft {

    Date date = new Date(73,3,5);
    public PioneroXI() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Hidracina");
        ArrayList<String> celestebodies = new ArrayList<String>();
        celestebodies.add("Júpiter");
        this.speed = 41040;
        this.thrust = 0.026;
        this.height = 2.9;
        this.weight = 0.258;
        this.launchDate = date;
        this.model= "Pionero XI";
        this.takingOff = false;
        this.fuelType = fuel;
        this.celestialBodiesToStudy = celestebodies;
    }
    
    
}
