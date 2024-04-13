package ejercicio1;

public abstract class Libro {
    private final String nombre;
    private final int codigoPrecio;
    protected int sumarPunto = 1;

    protected Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public abstract double calcularTotal(Alquiler alquiler);

    public int puntosPorLibro(int diasAlquilados) {
        return sumarPunto;
    }

}