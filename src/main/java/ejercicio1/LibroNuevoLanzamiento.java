package ejercicio1;

public class LibroNuevoLanzamiento extends Libro {
    private final int sumarPuntos = 2;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre, 1);
    }

    @Override
    public double calcularTotal(Alquiler alquiler) {
        double monto;
        return monto = alquiler.diasAlquilados() * 3;
    }

    @Override
    public int puntosPorLibro(int diasAlquilados) {
        if (diasAlquilados > 1) {
            return this.sumarPuntos;
        }
        return sumarPunto;
    }
}
