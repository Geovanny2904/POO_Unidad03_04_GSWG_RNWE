/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Vista.Auto.CreateAuto;
import Vista.Matricula.CreateMatricula;
import Vista.Matricula.DeleteMatricula;
import Vista.Matricula.UpdateMatricula;
import Vista.Propietario.CreatePropietario;


/**
 *
 * @author HP
 */
public class VistaMatricula {
        public static void main(String[] args) {
        
        var v1 = new CreateMatricula();
        var v2 = new DeleteMatricula();
        var v3 = new UpdateMatricula();
        var v4= new CreateAuto();
        var v5=new CreatePropietario();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        v5.setVisible(true);
    }
}
