/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Auto;
import Servicio.AutoServicio;

/**
 *
 * @author User
 */
public class AutoControl {
    private final AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(String [] params){
//        var auto = new Auto(Integer.valueOf(params[0]),params[1]);
        var auto = new Auto(params[0], params[1], Integer.valueOf(params[2]), Integer.valueOf(params[3]), params[4]);
        this.autoServicio.crear(auto);
        return auto;                                                    
    }
    
    public List<Auto> listar()
    {
        return this.autoServicio.listar();
    }
}
