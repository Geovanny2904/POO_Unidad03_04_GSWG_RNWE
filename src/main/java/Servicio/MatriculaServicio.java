/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Modelo.Matricula;
import java.util.ArrayList;
import java.util.List;


public class MatriculaServicio implements IMatriculaServicio {
     private final List<Matricula> matriculaList = new ArrayList<>();
     
     @Override
    public Matricula crear(Matricula matricula) {
        this.matriculaList.add(matricula);
        return matricula;
    }

     @Override
    public List<Matricula> listar() {
        return this.matriculaList;
    }
    @Override
    public Matricula buscarPorNumero(int numero) {
        var matricula = new Matricula(numero,"Ningún Resultado");
        for(Matricula mat:this.matriculaList){
            if(mat.getNumero()==numero){
                matricula=mat;
                break;
            }
        }
        return matricula;
    }

}
