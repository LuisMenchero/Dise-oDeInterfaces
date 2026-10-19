/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorfacturas.Modelo;

import java.time.LocalDate;

/**
 *
 * @author m
 */
public class Factura {

    private String asunto;
    private LocalDate fecha;
    private int cantidad;
    private TipoFactura tipoFactura;

    public Factura(String asunto, LocalDate fecha, int cantidad, TipoFactura tipoFactura) {
        this.asunto = asunto;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoFactura = tipoFactura;
    }

    public String getAsunto() {
        return asunto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

}
