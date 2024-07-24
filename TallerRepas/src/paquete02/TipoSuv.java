/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete03.*;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Auto {

    double seguroPersonas, porcentajeAdicional;

    public TipoSuv(Comprador prop, String brand, double baseValue,
            double additionalPercent) {
        super(prop, brand, baseValue);
        porcentajeAdicional = additionalPercent;
    }

    public void establecerSeguroPersonas() {
        seguroPersonas = precioBase * (porcentajeAdicional / 100);
    }

    public void establecerPorcentajeAdicional(double x) {
        porcentajeAdicional = x;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje adicional: %.2f\n"
                + "Seguro personas: %.2f\n"
                + "Precio final: %.2f\n", super.toString(),
                obtenerPorcentajeAdicional(),
                obtenerSeguroPersonas(),
                obtenerPrecioFinal());
        return cadena;
    }
}
