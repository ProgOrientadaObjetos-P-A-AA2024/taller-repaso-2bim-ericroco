/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombre;
    private String cedula;

    public Comprador(String name, String id) {
        nombre = name;
        cedula = id;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }
}
