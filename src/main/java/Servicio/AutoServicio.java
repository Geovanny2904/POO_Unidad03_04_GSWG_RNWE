/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Auto;
import java.util.ArrayList;
import java.util.List;


public class AutoServicio implements IAutoServicio {
     private final List<Auto> autoList = new ArrayList<>();
     
     @Override
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
    }

     @Override
    public List<Auto> listar() {
        return this.autoList;
    }
}