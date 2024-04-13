package ejercicio3;

public class Desayuno extends Gasto {
    private final int limiteDesayuno = 1000;

    public Desayuno(int monto) {
        super(monto);
    }

    @Override
    public String obtenerNombre() {
        return "Desayuno";
    }

    @Override
    public String excedeLimite() {
        return super.monto > limiteDesayuno ? "X" : " ";
    }
}
