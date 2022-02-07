
package taller_numero_2_sofka;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa una clase para crear naves espaciales genéricas.
 * @author Marleny Fernández Sandoval.
 */
public class Generic_spacecraft_interface implements  InterfaceSpacechips {
    /**
     * Representa el color de la nave espacial.
     */
    public String color;
    /**
     * Representa la fecha de lanzamiento de la nave espacial.
     */
    public Date launchDate;
    /**
     * Representa la lista de los tipos de combustible de la nave espacial. 
     */
    public ArrayList<String> fuelType;
    /**
     * Representa el modelo de la nave espacial.
     */
    public String model;
    /**
     * Representa el estado del despegue de la nave espacial.
     */
    public boolean takeoff = false;
    /**
     * Representa el estado del aterrizaje de la nave espacial.
     */
    public boolean landing = false;
    /**
     * Representa es estado en movimiento o suspendido de la nave espacial.
     */
    public boolean statusspaceships;
    
    /**
     * Constructor que permite crear un objeto Nave espacial genérica.
     * @param color Color de la nave espacial.
     * @param launchDate Fecha de lanzamiento.
     * @param fuelType Combustible. 
     * @param model Modelo.
     * @param statusspaceships Estado de la nave espacial. 
     */

    public Generic_spacecraft_interface(String color, Date launchDate, ArrayList<String> fuelType, String model, boolean statusspaceships) {
        this.color = color;
        this.launchDate = launchDate;
        this.fuelType = fuelType;
        this.model = model;
        this.statusspaceships = statusspaceships;
    }
    /**
     * Constructor que permite crear un objeto de la clase Nave espacial genérica.
     * @param color Color de la nave espacial.
     * @param model Modelo de la nave espacial.
     */
    public Generic_spacecraft_interface(String color, String model) {
        this.color = color;
        this.model = model;
    }
    

    @Override
    public boolean TakeOff() {
        this.takeoff = true;
        return takeoff;
    }

    @Override
    public boolean Landing() {
        this.landing = true;
        return landing;
    }

    @Override
    public boolean StatusSpaceships() {
        this.statusspaceships = true;
        return statusspaceships;
    }

    @Override
    public Date LaunchDate() {
        return launchDate;
    }
    
    
    
    
    
}
