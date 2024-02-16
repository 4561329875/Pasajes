/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author labctr
 */
public class Precio {
    public double calcular(Vehiculo vei){
        return vei.getDistancia()*vei.getTarifa();
    }
}
