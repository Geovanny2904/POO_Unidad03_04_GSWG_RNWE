/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Auto;
import Vista.Auto.CreateAuto;
import Vista.Auto.DeleteAuto;
import Vista.Auto.UpdateAuto;


/**
 *
 * @author HP
 */
public class VistaAuto {
     public static void main(String[] args) {
        
        var v1 = new CreateAuto();
        var v2 = new DeleteAuto();
        var v3 = new UpdateAuto();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        

    }
}
