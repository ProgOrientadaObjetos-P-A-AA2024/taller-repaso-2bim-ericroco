/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.*;
import paquete03.*;
import java.util.*;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Auto> lista = new ArrayList();

        Comprador c1 = new Comprador("Erick Rodas", "1900897917");
        Comprador c2 = new Comprador("Daniel Campoverde", "19002893");
        Comprador c3 = new Comprador("Erick Toledo", "11101381");

        TipoSedan sedan1 = new TipoSedan(c1, "toyota", 9000, 15);
        sedan1.establecerValorDescuento();
        sedan1.establecerSeguroAdicional();
        lista.add(sedan1);
        
        TipoSedan sedan2 = new TipoSedan(c2, "nissan", 12000, 8);
        sedan2.establecerValorDescuento();
        sedan2.establecerSeguroAdicional();
        lista.add(sedan2);
        
        TipoSuv suv = new TipoSuv(c3, "citroen", 17000, 9);
        suv.establecerSeguroPersonas();
        lista.add(suv);
        
        TipoCamioneta cam = new TipoCamioneta(c1, "suzuki", 19000);
        cam.establecerValorAdicional();
        cam.establecerSeguroAdicional();
        lista.add(cam);
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerPrecioFinal();
            System.out.println(lista.get(i));
        }
    }

}
