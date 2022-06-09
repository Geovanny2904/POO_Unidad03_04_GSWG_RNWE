/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Propietario;
import Servicio.PropietarioServicio;

/**
 *
 * @author User
 */
public class PropietarioControl {
    private final PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Propietario crear(String [] params){
        var propietario = new Propietario(Integer.valueOf(params[0]),params[1]);
        this.propietarioServicio.crear(propietario);
        return propietario;                                                    
    }
    
    public List<Propietario> listar()
    {
        return this.propietarioServicio.listar();
    }
}

