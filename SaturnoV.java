
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase Saturno V que hereda de la clase Vehículos Lanzadera.
 * @author Marleny Fernández Sandoval 
 */
public class SaturnoV extends Shuttle_Vehicles{

Date date = new Date(73,4,14);

    public SaturnoV() {
        ArrayList<String> fuel = new ArrayList<String>();
        fuel.add("Hidrógeno líquido");
        fuel.add("Óxigeno líquido");
        this.speed = 64500;
        this.thrust = 3500;
        this.height = 110.6;
        this.payload = 118;
        this.weight = 2900;
        this.launchDate = date;
        this.model= "Saturno V";
        this.payloadinOrbit = false;
        this.takingOff = false;
        this.fuelType = fuel;
        
    }
    
  
  
    
}
