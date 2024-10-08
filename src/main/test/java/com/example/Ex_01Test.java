package com.example;

import java.io.ByteArrayInputStream;
import main.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex_01Test {

    @Test
    public void testMultiplicar() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        ByteArrayInputStream in2 = new ByteArrayInputStream("5".getBytes());
        System.setIn(in2);
        assertEquals(20, Main.EntradaSalidaExercise1.run(), 0.001);
    }

    @Test
    public void testPesetasAEuros() {
        ByteArrayInputStream in = new ByteArrayInputStream("10000".getBytes());
        System.setIn(in);
        assertEquals(60.10, Main.EntradaSalidaExercise3.run(), 0.01);
    }

    @Test
    public void testAreaRectangulo() {
        ByteArrayInputStream in = new ByteArrayInputStream("4\n5\n".getBytes());
        System.setIn(in);
        assertEquals(20, Main.EntradaSalidaExercise5.run(), 0.001);
    }

    @Test
    public void testCalcularTotalFactura() {
        ByteArrayInputStream in = new ByteArrayInputStream("100".getBytes());
        System.setIn(in);
        assertEquals(121, Main.EntradaSalidaExercise7.run(), 0.001);
    }

    @Test
    public void testVolumenCono() {
        ByteArrayInputStream in = new ByteArrayInputStream("2\n5\n".getBytes());
        System.setIn(in);
        assertEquals(20.944, Main.EntradaSalidaExercise9.run(), 0.001);
    }

    @Test
    public void testKbAMb() {
        ByteArrayInputStream in = new ByteArrayInputStream("1024".getBytes());
        System.setIn(in);
        assertEquals(1, Main.EntradaSalidaExercise11.run(), 0.001);
    }

    @Test
    public void testCalcularNotaNecesaria() {
        ByteArrayInputStream in = new ByteArrayInputStream("7\n8.5\n".getBytes());
        System.setIn(in);
        assertEquals(9.5, Main.EntradaSalidaExercise13.run(), 0.01);
    }
}
