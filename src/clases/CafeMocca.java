package clases;

import Clasesabstractas.Cafe;

public class CafeMocca extends Cafe {

    public CafeMocca(TamañoCafe tamaño) {
        super("Cafe Mocca", 8.5, tamaño);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioConTamaño();
    }
}