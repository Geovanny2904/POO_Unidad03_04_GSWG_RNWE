/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Matricula;
import Servicio.MatriculaServicio;

/**
 *
 * @author User
 */
public class MatriculaControl {
    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    
    public Matricula crear(String [] params){
        var matricula = new Matricula(Integer.valueOf(params[0]),params[1]);
        this.matriculaServicio.crear(matricula);
        return matricula;                                                    
    }
    
    public List<Matricula> listar()
    {
        return this.matriculaServicio.listar();
    }
}

