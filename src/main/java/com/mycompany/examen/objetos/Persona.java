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
public class Persona {
    private String documento;
    private String nombre;
    private String apellido;

    public String getDocumento() {
        return documento;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
