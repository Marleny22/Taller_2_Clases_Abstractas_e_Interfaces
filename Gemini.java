
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Gemini que hereda de la clase Naves espaciales tripuladas.
 * @author Marleny Fernández Sandoval
 */
public class Gemini extends Manned_spacecraft {

    Date date = new Date(66,10,11);
    public Gemini() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Combustible sólido");
        this.speed = 28915;
        this.thrust = 1.13;
        this.height = 5.6;
        this.weight = 3.8;
        this.launchDate = date;
        this.model= "Gemini";
        this.takingOff = false;
        this.fuelType = fuel;
        this.crewSize = 2;
        this.mainfunction = "Mantenimiento de satélites";
    }
    
    
    
}
