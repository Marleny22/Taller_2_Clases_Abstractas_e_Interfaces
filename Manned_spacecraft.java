
package taller_numero_2_sofka;

import java.util.ArrayList;



/**
 * Representa la clase Naves espaciales tripuladas que hereda de la clase abstracta Naves espaciales.
 * @author Marleny Fernández Sandoval
 */
public class Manned_spacecraft extends Spaceships {
    /**
     * Representa la cantidad de tripulantes de la nave.
     */
    public int crewSize;
    /**
     * Representa la función principal de la nave espacial
     * 1. Misiones lunares.
     * 2. Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula.
     * 3. Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos.
     */
    public String mainfunction;
    /**
     * Representa el estado del aterrizaje.
     */
    public boolean landingStatus = false;

    @Override
    public void setFuelType(ArrayList<String> fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public int increaseSpeed() {
        this.speed=speed+20;
        return speed;
    }
    
    /**
     * Método para el modificar el estado del aterrizaje de la nave tripulada.
     * @return 
     */
    public boolean Landing()
    {
        this.landingStatus = true;
        return landingStatus;
    }

}
