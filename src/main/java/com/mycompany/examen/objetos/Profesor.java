/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen.objetos;

/**
 *
 * @author Seba-PC
 */
public class Profesor extends Persona {
    private String legajo;

    public Profesor() {
    }
    

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Profesor(String legajo) {
        this.legajo = legajo;
    }

   

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellido() {
        return super.getApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDocumento(String documento) {
        super.setDocumento(documento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDocumento() {
        return super.getDocumento(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
