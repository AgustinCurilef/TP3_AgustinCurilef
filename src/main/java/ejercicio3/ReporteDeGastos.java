package ejercicio3;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;


public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos) {
        StringBuilder reporte = new StringBuilder();
        int total = 0;
        int gastosDeComida = 0;
        reporte.append("Expenses ").append(LocalDate.now()).append("\n");
        for (Gasto gasto : gastos) {
            gastosDeComida = gasto.sumarGastos(gastosDeComida);
            String nombreGasto = gasto.obtenerNombre();
            String marcaExcesoComidas = gasto.excedeLimite();
            reporte.append(nombreGasto + ": ").append("\t").append(gasto.monto + " ").append("\t").append(marcaExcesoComidas).append("\n");
            total += gasto.monto;
        }
        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        reporte.append("Total de gastos: ").append(total).append("\n");
        JOptionPane.showMessageDialog(null, reporte.toString());
        return "Total de gastos: " + total;
    }

}