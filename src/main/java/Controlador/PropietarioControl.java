/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Propietario;
import Servicio.PropietarioServicio;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class PropietarioControl {
    private final PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Propietario crear(String [] params){
        var propietario = new Propietario(Integer.valueOf(params[0]),params[1],LocalDate.parse(params[2]),Integer.valueOf(params[3]),params[4]);
        this.propietarioServicio.crear(propietario);
        return propietario;                                                    
    }
    
    public List<Propietario> listar()
    {
        return this.propietarioServicio.listar();
    }
}

