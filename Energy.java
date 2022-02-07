
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Energía que hereda de la clase Vehículos Lanzadera.
 * @author Marleny Fernández Sandoval
 */
public class Energy extends Shuttle_Vehicles {

    Date date = new Date(88,10,15);
    public Energy() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Petróleo refinado (Queroseno)");
        fuel.add("Óxigeno líquido");
        this.speed = 9000;
        this.thrust = 3060;
        this.height = 60;
        this.payload = 100;
        this.weight = 2400;
        this.launchDate = date;
        this.model= "Energía";
        this.payloadinOrbit = false;
        this.takingOff = false;
        this.fuelType = fuel;
    }
    
    
}
