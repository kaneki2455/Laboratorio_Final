package clases;

import Clasesabstractas.Cafe;

public class CafeAmericano extends Cafe {

    public CafeAmericano(TamañoCafe tamano) {
        super("Cafe Americano", 5.0, tamaño);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioConTamaño();
    }
}