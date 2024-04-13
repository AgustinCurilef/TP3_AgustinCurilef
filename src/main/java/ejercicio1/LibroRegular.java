package ejercicio1;

public class LibroRegular extends Libro {
    public LibroRegular(String nombre) {
        super(nombre, 0);
    }

    @Override
    public double calcularTotal(Alquiler alquiler) {
        double monto = 2;
        if (alquiler.diasAlquilados() > 2)
            monto += (alquiler.diasAlquilados() - 2) * 1.5;
        return monto;
    }
}
