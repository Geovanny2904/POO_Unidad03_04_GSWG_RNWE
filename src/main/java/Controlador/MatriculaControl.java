/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Matricula;
import Servicio.AutoServicio;
import Servicio.MatriculaServicio;
import Servicio.PropietarioServicio;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class MatriculaControl {
    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    private final AutoServicio autoServicio= new AutoServicio();
    private final PropietarioServicio propietarioServicio= new PropietarioServicio();
    
    public Matricula crear(String [] params){
        var auto= this.autoServicio.buscarporPlaca(params[4]);
        var propietario= this.propietarioServicio.buscarporId(Integer.valueOf(params[5]));
        var matricula = new Matricula(Integer.valueOf(params[0]),
                LocalDate.parse(params[1]),Integer.valueOf(params[2]),
                Integer.valueOf(params[3]));
        this.matriculaServicio.crear(matricula);
        return matricula;                                                    
    }
    
    public List<Matricula> listar()
    {
        return this.matriculaServicio.listar();
    }
}

