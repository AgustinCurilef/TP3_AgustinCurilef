package ejercicio3;

public class AlquilerAuto extends Gasto {
    public AlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String obtenerNombre() {
        return "Alquiler de Autos";
    }

    @Override
    public int sumarGastos(int gastos) {
        return gastos;
    }
}
