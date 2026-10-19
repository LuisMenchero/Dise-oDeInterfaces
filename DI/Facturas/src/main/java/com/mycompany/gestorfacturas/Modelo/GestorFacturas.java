/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorfacturas.Modelo;

import com.mycompany.gestorfacturas.Controladores.ControladorFacturas;
import static com.mycompany.gestorfacturas.Controladores.ControladorFacturas.gf;
import static com.mycompany.gestorfacturas.Controladores.ControladorFacturas.pantallaPrincipal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author m
 */
public class GestorFacturas {

    private ArrayList<Factura> facturas;

    public GestorFacturas() {
        this.facturas = new ArrayList<>();
    }

    public boolean añadirOActualizarFactura(Factura facturaNueva) {
        // Comprobar que no exista factura con mismo asunto
        for (Factura facturaAct : facturas) {
            if (facturaAct.getAsunto().equals(facturaNueva.getAsunto())) {
                ControladorFacturas.colocarMensajeError("El asunto no puede coincidir con el de otra factura.", true);
                return false;
            }
        }

        // Comprobar asunto válido
        char[] letrasAsunto = facturaNueva.getAsunto().toCharArray();
        if (letrasAsunto.length < 1 || letrasAsunto.length > 10) {
            ControladorFacturas.colocarMensajeError("El asunto debe tener entre 1 y 10 caractéres", true);
            return false;
        } else {
            ControladorFacturas.colocarMensajeError("", true);
        }

        // Comprobar fecha válida
        if (facturaNueva.getFecha().isAfter(LocalDate.now())) {
            ControladorFacturas.colocarMensajeError("La fecha no puede ser posterior a la fecha actual.", true);
            return false;
        } else if (facturaNueva.getFecha().isBefore(LocalDate.of(2000, 1, 1))) {
            ControladorFacturas.colocarMensajeError("La fecha no puede ser anterior al 1/1/2000.", true);
            return false;
        }

        // Comprobar que la cantidad sea correcta
        int num = facturaNueva.getCantidad();
        if (num < 0) {
            ControladorFacturas.colocarMensajeError("La cantidad debe ser igual o mayor que 0.", true);
            return false;
        } else {
            ControladorFacturas.colocarMensajeError("", true);
        }

        facturas.add(facturaNueva);
        return true;
    }

    public boolean editarFactura() {
        for (Factura facturaAct : facturas) {
            if (facturaAct.getAsunto().equals(pantallaPrincipal.getAsuntoElementoSeleccionado())) {
                facturaAct.setAsunto(pantallaPrincipal.getAsunto());
                facturaAct.setFecha(pantallaPrincipal.getFecha());
                facturaAct.setCantidad(pantallaPrincipal.getCantidad());
                facturaAct.setTipoFactura(pantallaPrincipal.getTipoFactura());
                ControladorFacturas.colocarMensajeError("Factura actualizada con éxito.", false);
                return true;
            }
        }
        return false;
    }

    public void borrarFactura(Factura facturaBorrar) {

        for (int i = facturas.size() - 1; i >= 0; i--) {
            if (facturaBorrar.getAsunto().equals(facturas.get(i).getAsunto())) {
                facturas.remove(facturaBorrar);
            }
        }
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

}
