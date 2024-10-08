package com.example;

import java.io.ByteArrayInputStream;
import main.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex01Test {

    @Test
    public void testMultiplicar() {
        assertEquals(20, Main.EntradaSalidaExercise1.run(), 0.001);
        ByteArrayInputStream in = new ByteArrayInputStream("4\n5\n".getBytes());
        System.setIn(in);
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(60.10, Main.EntradaSalidaExercise3.run(), 0.01);
        ByteArrayInputStream in = new ByteArrayInputStream("10000".getBytes());
        System.setIn(in);
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, Main.EntradaSalidaExercise5.run(), 0.001);
        ByteArrayInputStream in = new ByteArrayInputStream("4\n5\n".getBytes());
        System.setIn(in);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(121, Main.EntradaSalidaExercise7.run(), 0.001);
        ByteArrayInputStream in = new ByteArrayInputStream("100".getBytes());
        System.setIn(in);
    }

    @Test
    public void testVolumenCono() {
        assertEquals(20.944, Main.EntradaSalidaExercise9.run(), 0.001);
        ByteArrayInputStream in = new ByteArrayInputStream("2\n5\n".getBytes());
        System.setIn(in);
    }

    @Test
    public void testKbAMb() {
        assertEquals(1, Main.EntradaSalidaExercise11.run(), 0.001);
        ByteArrayInputStream in = new ByteArrayInputStream("1024".getBytes());
        System.setIn(in);
    }

    @Test
    public void testCalcularNotaNecesaria() {
        assertEquals(9.5, Main.EntradaSalidaExercise13.run(), 0.01);
        ByteArrayInputStream in = new ByteArrayInputStream("7\n8.5\n".getBytes());
        System.setIn(in);
    }
}
