
package taller_numero_2_sofka;

import java.util.ArrayList;


/**
 * Representa la clase de Vehículos Lanzadera que heredan de la clase abstracta Naves espaciales.
 * @author USUARIO
 */
public class  Shuttle_Vehicles extends Spaceships {
    /**
     * Representa el estado de la carga útil en órbita: true = la carga ha sido soltada y puesta en órbita
     * false = la carga no ha sido soltada.
     */
    public boolean payloadinOrbit = false; 
    /**
     * Carga útil capaz de transportar el vehículo lanzadera en toneladas en órbita baja terrestre.
     */
    public double payload;
    

    @Override
    public void setFuelType(ArrayList<String> fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public int increaseSpeed() {
        this.speed=speed+10;
        return speed;
    }
    /**
     * Método para poner carga útil en órbita.
     * @param payload Estado de la carga útil true = en Órbita, false = fuera de Órbita
     */
    public void placingPayloadsInOrbit(boolean payload)
    {
        this.payloadinOrbit = true;
    }
    
    
}
