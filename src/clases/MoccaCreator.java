package clases;

import Clasesabstractas.Cafe;
import Clasesabstractas.CafeCreator;

public class MoccaCreator extends CafeCreator {

    @Override
    public Cafe crearCafe(TamañoCafe tamaño) {
        return new CafeMocca(tamaño);
    }
}