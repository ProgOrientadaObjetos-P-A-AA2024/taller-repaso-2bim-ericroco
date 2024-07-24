/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete03.Comprador;

/**
 *
 * @author utpl
 */
public abstract class Auto {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase, precioFinal;

    public Auto(Comprador prop, String brand, double baseValue) {
        propietario = prop;
        marca = brand;
        precioBase = baseValue;
    }

    public void establecerPropietario(Comprador x) {
        propietario = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerPrecioBase(double x) {
        precioBase = x;
    }

    public abstract void establecerPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }
    @Override
    public String toString(){
        String cadena = String.format("Propietario:\n"
                + "Nombre: %s\nCedula: %s\nMarca: %s\n"
                + "Precio base: %.2f\n",
                propietario.obtenerNombre(),propietario.obtenerCedula()
                ,obtenerMarca(),obtenerPrecioBase());
        return cadena;
    }
}
