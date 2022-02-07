
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;


/**
 * Representa la clase Naves espaciales no tripuladas que hereda de la clase abstracta Naves espaciales.
 * @author Marleny Fernández Sandoval
 */
public class Unmanned_spacecraft extends Spaceships{

    /**
     * Representa la lista de cuerpos celestes que la nave espacial tiene como propósito estudiar.
     */
    public ArrayList<String> celestialBodiesToStudy;
    
    @Override
    public void setFuelType(ArrayList<String> fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public int increaseSpeed() {
        this.speed=speed+10;
        return speed;
    }


    
}
