/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.entity;

/**
 *
 * @author Favio
 */
public class Empleado {
     private int empleado_ID;
     private int puesto_ID;
     private String nombres;
     private String apellidos;
     private String dni;
     private String telefono;
     private String email;
     private String direccion;
     private String fechaNac;
     private String fechaContr;

    public Empleado() {
    }

    public Empleado(int empleado_ID, int puesto_ID, String nombres, String apellidos, String dni, String telefono, String email, String direccion, String fechaNac, String fechaContr) {
        this.empleado_ID = empleado_ID;
        this.puesto_ID = puesto_ID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.fechaContr = fechaContr;
    }

    public int getEmpleado_ID() {
        return empleado_ID;
    }

    public void setEmpleado_ID(int empleado_ID) {
        this.empleado_ID = empleado_ID;
    }

    public int getPuesto_ID() {
        return puesto_ID;
    }

    public void setPuesto_ID(int puesto_ID) {
        this.puesto_ID = puesto_ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaContr() {
        return fechaContr;
    }

    public void setFechaContr(String fechaContr) {
        this.fechaContr = fechaContr;
    }

    @Override
    public String toString() {
        return "Empleado{" + "empleado_ID=" + empleado_ID + ", puesto_ID=" + puesto_ID + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + ", fechaNac=" + fechaNac + ", fechaContr=" + fechaContr + '}';
    }
     
     
}
