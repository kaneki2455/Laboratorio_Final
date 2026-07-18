package Clasesabstractas;

import clases.TamañoCafe;

public abstract class Cafe {

    protected String nombre;
    protected double precioBase;
    protected TamañoCafe tamaño;

    protected Cafe(String nombre, double precioBase, TamañoCafe tamaño) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tamaño = tamaño;
    }

    public abstract double calcularPrecioFinal();

    public String descripcion() {
        return nombre + " (" + tamaño + ")";
    }

    protected double precioConTamaño() {
        return precioBase + tamaño.getRecargo();
    }

    public String getNombre() {
        return nombre;
    }

    public TamañoCafe getTamaño() {
        return tamaño;
    }
}