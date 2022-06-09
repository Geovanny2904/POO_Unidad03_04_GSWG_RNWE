/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Propietario {
    int idPropietario;
    String nombrePropietario;
    LocalDate fechaNacPropietario;
    int numeroVehiculosPropietario;
    String tipoLicenciaPropietario;

    public Propietario(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean idValida(){
        var retorno= false;
        
        return retorno;
    }
    public int identificarNumeroVehiculos(){
        var retorno=10000;
        
        return retorno;
    }
}
