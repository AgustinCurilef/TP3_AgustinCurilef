package ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReporteDeGastosTest {
    @Test
    public void test01() {
        var g1 = new Desayuno(1000);
        var g2 = new Cena(3500);
        var reporte = new ReporteDeGastos();

        Assertions.assertTrue(reporte.imprimir(List.of(g1, g2)).startsWith("Total de gastos: 4500"));
    }

    @Test
    public void test02() {
        var g1 = new Desayuno(1500);
        var g2 = new AlquilerAuto(7500);
        var reporte = new ReporteDeGastos();
        Assertions.assertTrue(reporte.imprimir(List.of(g1, g2)).startsWith("Total de gastos: 9000"));

    }

    @Test
    public void test03() {
        var reporte = new ReporteDeGastos();
        Assertions.assertTrue(reporte.imprimir(List.of()).startsWith("Total de gastos: 0"));
    }

    @Test
    public void test04() {
        var g2 = new AlquilerAuto(7500);
        var reporte = new ReporteDeGastos();

        Assertions.assertTrue(reporte.imprimir(List.of(g2)).startsWith("Total de gastos: 7500"));
    }
}
