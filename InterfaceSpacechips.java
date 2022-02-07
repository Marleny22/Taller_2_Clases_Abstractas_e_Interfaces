/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_numero_2_sofka;

import java.util.Date;

/**
 * Representa la interfaz con los principales comportamientos para una Nave espacial.
 * @author Marleny Fernández Sandoval.
 */
public interface InterfaceSpacechips {
    /**
     * Método que representa el despegue de la nave espacial.
     * @return Estado del despegue.
     */
    public boolean TakeOff();
    /**
     * Método que representa el aterrizaje de la nave espacial.
     * @return Estado del aterrizaje.
     */
    public boolean Landing();
    /**
     * Método que representa el estado de la nave espacial.
     * @return Estado de la nave espacial true = en movimiento, false = suspendida.
     */
    public boolean StatusSpaceships();
    /**
     * Método que representa el ingreso de la fecha de lanzamiento de la nave espacial.
     * @return Fecha de lanzamiento.
     */
    public Date LaunchDate();
    
    
}
