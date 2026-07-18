package clases;

public final class TamañoCafe {

    public static final TamañoCafe PEQUEÑO = new TamañoCafe("PEQUEÑO", 0.0);
    public static final TamañoCafe MEDIANO = new TamañoCafe("MEDIANO", 2.0);
    public static final TamañoCafe GRANDE  = new TamañoCafe("GRANDE", 3.0);

    private final String nombre;
    private final double recargo;

    private TamañoCafe(String nombre, double recargo) {
        this.nombre = nombre;
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}