package ejercicio3;

public class Cena extends Gasto {
    private final int limiteCena = 5000;

    public Cena(int monto) {
        super(monto);
    }

    @Override
    public String obtenerNombre() {
        return "Cena";
    }

    @Override
    public String excedeLimite() {
        return super.monto > limiteCena ? "X" : " ";
    }
}
