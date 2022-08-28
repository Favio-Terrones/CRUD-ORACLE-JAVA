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
public class Mueble {
    private int idMueble;
    private int idColor;
    private int idTipo;
    private int idModelo;
    private String nombre;
    private int costo;
    private int precioVenta;
    private int stock;

    public Mueble() {
    }

    public Mueble(int idMueble, int idColor, int idTipo, int idModelo, String nombre, int costo, int precioVenta, int stock) {
        this.idMueble = idMueble;
        this.idColor = idColor;
        this.idTipo = idTipo;
        this.idModelo = idModelo;
        this.nombre = nombre;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getIdMueble() {
        return idMueble;
    }

    public void setIdMueble(int idMueble) {
        this.idMueble = idMueble;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Mueble{" + "idMueble=" + idMueble + ", idColor=" + idColor + ", idTipo=" + idTipo + ", idModelo=" + idModelo + ", nombre=" + nombre + ", costo=" + costo + ", precioVenta=" + precioVenta + ", stock=" + stock + '}';
    }
    
    
    
}
