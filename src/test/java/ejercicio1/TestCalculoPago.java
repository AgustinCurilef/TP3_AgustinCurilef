package ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculoPago {

    @Test
    public void test01() {
        Cliente yo = new Cliente("Javier");
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        Assertions.assertEquals(0, resultado[1]);
        Assertions.assertEquals(0.0, resultado[0]);
    }

    @Test
    public void test02() {
        Libro elTunel = new LibroNuevoLanzamiento("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        Assertions.assertEquals(3, resultado[1]);
        Assertions.assertEquals(18.5, resultado[0]);

    }

    @Test
    public void test03() {
        Libro elTunel = new LibroNuevoLanzamiento("El Túnel");
        Libro antesDelFin = new LibroNuevoLanzamiento("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 1);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 1);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        Assertions.assertEquals(6.0, resultado[0]);
        Assertions.assertEquals(2, resultado[1]);
    }

    @Test
    public void test4() {
        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroNuevoLanzamiento("Antes del Fin");
        Libro unDia = new LibroInfantil("UnDia");
        CopiaLibro unDiaCopia = new CopiaLibro(unDia);
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerUnDia = new Alquiler(unDiaCopia, 4);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 2);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 1);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerUnDia);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        Assertions.assertEquals(8.0, resultado[0]);
        Assertions.assertEquals(3, resultado[1]);

    }


}
