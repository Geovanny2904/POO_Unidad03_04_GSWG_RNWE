/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import Modelo.Matricula;

/**
 *
 * @author User
 */
interface IMatriculaServicio {
    public Matricula crear(Matricula matricula);
    public List<Matricula> listar();
}
