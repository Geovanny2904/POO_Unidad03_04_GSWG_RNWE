/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Vista.Propietario.CreatePropietario;
import Vista.Propietario.DeletePropietario;
import Vista.Propietario.UpdatePropietario;

/**
 *
 * @author HP
 */
public class VistaPropietario {
    public static void main(String[] args) {
        
        var v1 = new CreatePropietario();
        var v2 = new DeletePropietario();
        var v3 = new UpdatePropietario();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
    }
}
