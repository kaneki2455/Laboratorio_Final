package clases;

import Clasesabstractas.Cafe;
import Clasesabstractas.CafeCreator;

public class DobleCreator extends CafeCreator {

    @Override
    public Cafe crearCafe(TamañoCafe tamaño) {
        return new CafeDoble(tamaño);
    }
}