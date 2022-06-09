/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Matricula {
    int numero;
    LocalDate fechaMatricula;
    int numeroChasis;
    int duracionMatricula;
    Propietario propietario;
    Auto auto;
    
     public Matricula(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Matricula(int numero, LocalDate fechaMatricula, int numeroChasis, int duracionMatricula, Propietario propietario, Auto auto) {
        this.numero = numero;
        this.fechaMatricula = fechaMatricula;
        this.numeroChasis = numeroChasis;
        this.duracionMatricula = duracionMatricula;
        this.propietario = propietario;
        this.auto = auto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public int getDuracionMatricula() {
        return duracionMatricula;
    }

    public void setDuracionMatricula(int duracionMatricula) {
        this.duracionMatricula = duracionMatricula;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

        
    public int calcularExpiracion(){
        var retorno=1000;
        
        return retorno;
    }
    public boolean validadChasis(){
        var retorno=true;
        
        return retorno;
    }

    @Override
    public String toString() {
        return "Matricula{" + "numero=" + numero + ", fechaMatricula=" + fechaMatricula + ", numeroChasis=" + numeroChasis + ", duracionMatricula=" + duracionMatricula + ", propietario=" + propietario + ", auto=" + auto + '}';
    }
    
}
