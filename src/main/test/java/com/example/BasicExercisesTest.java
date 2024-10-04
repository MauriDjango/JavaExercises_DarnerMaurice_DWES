package com.example;

import taller.exercises.basicexercises.BasicExercise;
import taller.exercises.basicexercises.Exercise1;
import taller.exercises.basicexercises.Exercise3;
import taller.exercises.basicexercises.Exercise5;
import taller.main.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicExercisesTest {

    Main testMain = new Main();

    @Test
    public void testEjercicio1() {
        String resultado = Main.exercise1.run();
        assertTrue(resultado.contains("1143"));
        assertTrue(resultado.contains("855"));
        assertTrue(resultado.contains("6.94"));
        assertTrue(resultado.contains("143856"));
    }

    @Test
    public void testEjercicio2() {
        assertEquals("My name is Maurice Darner", Main.exercise2.run("Maurice Darner"));
    }

    @Test
    public void testEjercicio3() {
        String resultado = Main.exercise3.run("Juan Pérez", "Calle Mayor 1, Madrid", "123456789");
        assertTrue(resultado.contains("Juan Pérez"));
        assertTrue(resultado.contains("Calle Mayor 1, Madrid"));
        assertTrue(resultado.contains("123456789"));
    }

    @Test
    public void testExercise4() {
        assertEquals(16638.6, Main.exercise4.convert(100), 0.01);
    }

    @Test
    public void testExercise5() {
        assertEquals(60.10, Main.exercise5.convert(10000), 0.01);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(121.0, Main.exercise6.calculate(100), 0.01);
    }
}