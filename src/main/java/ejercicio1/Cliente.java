package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static int puntosAlquilerFrecuente;
    private final List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private final String name;
    private Double deuda;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        int puntosAlquilerFrecuente = 0;
        double total = 0;
        for (Alquiler alquiler : alquileres) {
            double monto = 0;
            total += alquiler.copia().libro().calcularTotal(alquiler);
            // sumo puntos por alquiler
            puntosAlquilerFrecuente += alquiler.copia().libro().puntosPorLibro(alquiler.diasAlquilados());
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}