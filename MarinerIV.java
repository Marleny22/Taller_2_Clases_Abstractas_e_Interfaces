
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Mariner IV que hereda de la clase Naves espaciales no tripuladas.
 * @author Marleny Fernández Sandoval
 */
public class MarinerIV extends Unmanned_spacecraft{

    Date date = new Date(65,6,14);
    public MarinerIV() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Hidracina");
        ArrayList<String> celestebodies = new ArrayList<String>();
        celestebodies.add("Marte");
        this.speed = 25200;
        this.thrust = 0.02244;
        this.height = 2.89;
        this.weight = 0.26;
        this.launchDate = date;
        this.model= "Mariner IV";
        this.takingOff = false;
        this.fuelType = fuel;
        this.celestialBodiesToStudy = celestebodies;
    }
    
    
}
