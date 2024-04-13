package ejercicio1;

public class LibroInfantil extends Libro {

    protected LibroInfantil(String nombre) {
        super(nombre, 2);
    }

    @Override
    public double calcularTotal(Alquiler alquiler) {
        double monto = 1.5;
        if (alquiler.diasAlquilados() > 3)
            monto += (alquiler.diasAlquilados() - 3) * 1.5;
        return monto;
    }
}
