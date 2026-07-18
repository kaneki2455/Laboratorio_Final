package clases;

import Clasesabstractas.Cafe;

public class CafeDoble extends Cafe {

    public CafeDoble(TamañoCafe tamaño) {
        super("Cafe Doble", 7.0, tamaño);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioConTamaño();
    }
}