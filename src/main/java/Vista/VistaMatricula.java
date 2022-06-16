/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Vista.Matricula.CreateMatricula;
import Vista.Matricula.DeleteMatricula;
import Vista.Matricula.UpdateMatricula;


/**
 *
 * @author HP
 */
public class VistaMatricula {
        public static void main(String[] args) {
        
        var v1 = new CreateMatricula();
        var v2 = new DeleteMatricula();
        var v3 = new UpdateMatricula();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
    }
}
