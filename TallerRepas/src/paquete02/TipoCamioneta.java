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
public class TipoCamioneta extends Auto {

    private double porcentajeAdicional = 15;
    private double valorAdicional;
    private double seguroAdicional;

    public TipoCamioneta(Comprador prop, String brand, double baseValue) {
        super(prop, brand, baseValue);
    }

    public void establecerValorAdicional() {
        valorAdicional = precioBase * (porcentajeAdicional / 100);
    }

    public void establecerSeguroAdicional() {
        seguroAdicional = valorAdicional * 1.5;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorAdicional + seguroAdicional;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    public double obtenerSeguroAdicional() {
        return seguroAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje adicional: %.2f\n"
                + "Valor adicional: %.2f\nSeguro adicional: %.2f\n"
                + "Precio final: %.2f\n", super.toString(),
                obtenerPorcentajeAdicional(),
                obtenerValorAdicional(),
                obtenerSeguroAdicional(),
                obtenerPrecioFinal());
        return cadena;
    }
}
