package Main;

import clases.AmericanoCreator;
import clases.DobleCreator;
import clases.MoccaCreator;
import clases.TamañoCafe;
import Clasesabstractas.Cafe;
import Clasesabstractas.CafeCreator;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        // Creadores (Factory Method)
        CafeCreator creadorAmericano = new AmericanoCreator();
        CafeCreator creadorDoble = new DobleCreator();
        CafeCreator creadorMocca = new MoccaCreator();

        // Simulación de una venta con distintos cafés y tamaños
        List<Cafe> pedido = new ArrayList<>();
        pedido.add(creadorAmericano.crearCafe(TamañoCafe.PEQUEÑO));
        pedido.add(creadorAmericano.crearCafe(TamañoCafe.GRANDE));
        pedido.add(creadorDoble.crearCafe(TamañoCafe.MEDIANO));
        pedido.add(creadorMocca.crearCafe(TamañoCafe.GRANDE));
        pedido.add(creadorMocca.crearCafe(TamañoCafe.PEQUEÑO));

        realizarVenta(pedido);
    }

    private static void realizarVenta(List<Cafe> pedido) {
        System.out.println("===== TICKET DE VENTA =====");

        double total = 0.0;
        int item = 1;

        for (Cafe cafe : pedido) {
            double precio = cafe.calcularPrecioFinal();
            total += precio;
            System.out.printf("%d. %s -> S/ %.2f%n", item, cafe.descripcion(), precio);
            item++;
        }

        System.out.println("============================");
        System.out.printf("TOTAL A PAGAR: S/ %.2f%n", total);
        System.out.println("============================");
        System.out.println("¡Gracias por su compra!");
    }
}