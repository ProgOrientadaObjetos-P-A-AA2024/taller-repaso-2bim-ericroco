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
public class TipoSedan extends Auto {

    private double porcentajeDescuento, valorDescuento, seguroAdicional;

    public TipoSedan(Comprador prop, String brand, double baseValue, double percent) {
        super(prop, brand, baseValue);
        porcentajeDescuento = percent;
    }

    public void establecerPorcentajeDescuento(double x) {
        porcentajeDescuento = x;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    public void establecerSeguroAdicional() {
        seguroAdicional = precioBase * 0.01;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase - valorDescuento + seguroAdicional;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicional() {
        return seguroAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje descuento: %.2f\n"
                + "Valor descuento: %.2f\nSeguro adicional: %.2f\n"
                + "Precio final: %.2f\n", super.toString(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguroAdicional(),
                obtenerPrecioFinal());
        return cadena;
    }

}
