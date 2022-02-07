
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Apolo que hereda de la clase Naves espaciales tripuladas.
 * @author Marleny Férnandez Sandoval
 */
public class Apolo extends Manned_spacecraft {

    Date date = new Date(69,6,16);
    public Apolo() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Tetróxido de Nitrógeno");
        fuel.add("UDMH");
        this.speed = 45000;
        this.thrust = 10;
        this.height = 10.6;
        this.weight = 30.3;
        this.launchDate = date;
        this.model= "Apolo";
        this.takingOff = false;
        this.fuelType = fuel;
        this.crewSize = 3;
        this.mainfunction = "Misiones lunares";
    }
    
    
}
