package ejercicio3;

public abstract class Gasto {
    protected int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    public abstract String obtenerNombre();

    public int sumarGastos(int gastos) {
        return gastos + monto;
    }

    public String excedeLimite() {
        return " ";
    }


}
