package clases;

import Clasesabstractas.Cafe;
import Clasesabstractas.CafeCreator;

public class AmericanoCreator extends CafeCreator {

    @Override
    public Cafe crearCafe(TamañoCafe tamaño) {
        return new CafeAmericano(tamaño);
    }
}