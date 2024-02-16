/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author labctr
 */
public class Taxi extends Vehiculo {

    public Taxi(double dis) {
        super.setTarifa(1.5/3);
        super.setDistancia(dis);
    }
    
}
