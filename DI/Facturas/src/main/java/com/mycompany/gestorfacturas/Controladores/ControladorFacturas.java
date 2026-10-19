/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorfacturas.Controladores;

import com.mycompany.gestorfacturas.Modelo.Factura;
import com.mycompany.gestorfacturas.Modelo.GestorFacturas;
import com.mycompany.gestorfacturas.Modelo.TipoFactura;
import com.mycompany.gestorfacturas.Vista.PantallaPrincipal;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author m
 */
public class ControladorFacturas {

    public static PantallaPrincipal pantallaPrincipal;
    public static boolean modoEdicion;

    public static void iniciar() {
        pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setVisible(true);
    }
    public static GestorFacturas gf = new GestorFacturas();

    public static boolean añadirOActualizarFactura() {
        boolean añadidoCorrectamente;
        if (modoEdicion) {
            añadidoCorrectamente = gf.editarFactura();
            if (añadidoCorrectamente) {
                ControladorFacturas.colocarMensajeError("Factura editado con éxito.", false);
                modoEdicion = false;
                return true;
            }

        } else {
            if (pantallaPrincipal.getTipoFactura() == null) {
                pantallaPrincipal.setTipoFactura(TipoFactura.EMPRESAS);
            }

            Factura facturaNueva = new Factura(pantallaPrincipal.getAsunto(), pantallaPrincipal.getFecha(), pantallaPrincipal.getCantidad(), pantallaPrincipal.getTipoFactura());

            añadidoCorrectamente = gf.añadirOActualizarFactura(facturaNueva);
            if (añadidoCorrectamente) {
                ControladorFacturas.colocarMensajeError("Factura añadida con éxito.", false);
            }
        }

        return añadidoCorrectamente;
    }

    public static boolean eliminarFactura(String asuntoFactura) {

        for (Factura facturaAct : gf.getFacturas()) {
            if (facturaAct.getAsunto().equalsIgnoreCase(asuntoFactura)) {
                gf.getFacturas().remove(facturaAct);
                ControladorFacturas.colocarMensajeError("Factura eliminada con éxito.", false);
                return true;
            }
        }
        colocarMensajeError("La factura seleccionada no se ha podido eliminar", true);
        return false;
    }

    public static Factura editarFactura(String asuntoFactura) {
        Factura facturaAEditar = null;
        for (Factura facturaAct : gf.getFacturas()) {
            if (facturaAct.getAsunto().equals(asuntoFactura)) {
                facturaAEditar = facturaAct;

            }
        }

        if (facturaAEditar == null) {
            colocarMensajeError("La factura no se ha podido editar.", true);
        } else {
            colocarMensajeError("La factura no se ha podido editar.", false);
        }

        return facturaAEditar;
    }

    public static DefaultListModel<String> actualizarJList() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        String linea;
        for (Factura facturaAct : ControladorFacturas.gf.getFacturas()) {
            linea = facturaAct.getAsunto() + ":" + facturaAct.getTipoFactura() + ":" + facturaAct.getCantidad() + ":" + facturaAct.getFecha().getYear() + "-" + facturaAct.getFecha().getMonthValue() + "-" + facturaAct.getFecha().getDayOfMonth();
            modelo.addElement(linea);
        }
        return modelo;
    }

    public static void colocarMensajeError(String mensajeError, boolean esError) {
        pantallaPrincipal.setTextojLabelMensajesError(mensajeError, esError);
    }
}
