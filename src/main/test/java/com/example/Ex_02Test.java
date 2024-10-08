package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import main.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class Ex_02Test {

    // Ejercicio 1
    @ParameterizedTest
    @CsvSource({
            "monday, DWES",
            "tuesday, EIE",
            "wednesday, DWEC",
            "thursday, DWEC",
            "friday, DWES",
            "saturday, No Class"
    })
    void testAsignaturaPorDia(String dia, String expectedAsignatura) {
        assertEquals(expectedAsignatura, Main.IfSwitchExercise1.run(dia));
    }

    // Ejercicio 3
    @ParameterizedTest
    @CsvSource({
            "1, Lunes",
            "2, Martes",
            "3, Miércoles",
            "4, Jueves",
            "5, Viernes",
            "6, Sábado",
            "7, Domingo",
            "8, Número no válido"
    })
    void testNombreDiaSemana(String numero, String expectedDia) {
        assertEquals(expectedDia, Main.IfSwitchExercise3.run(numero));
    }

    // Ejercicio 5
    @ParameterizedTest
    @CsvSource({
            "1, -2, x = 2.0",
            "2, 4, x = -2.0",
            "0, 0, Infinitas soluciones",
            "0, 1, No hay solución"
    })
    void testResolverEcuacionPrimerGrado(String a, String b, String expected) {
        assertEquals(expected, Main.IfSwitchExercise5.run(a, b));
    }

    // Ejercicio 7
    @Test
    void testCalcularMediaNotas() {
        assertEquals(7.0, Main.IfSwitchExercise7.run(7, 8, 6), 0.01);
    }

    // Ejercicio 9
/*    @ParameterizedTest
    @CsvSource({
            "1, -5, 6, x1 = 3.00, x2 = 2.00",
            "1, 2, 1, x = -1.00",
            "1, 1, 1, No hay soluciones reales"
    })
    void testResolverEcuacionSegundoGrado(double a, double b, double c, String expected) {
        assertEquals(expected, Main.IfSwitchExercise9.run(a, b));
    }
    */

    // Ejercicio 11
    @ParameterizedTest
    @CsvSource({
            "23, 59, 60",
            "0, 0, 86400",
            "12, 30, 41400"
    })
    void testCalcularSegundosHastaMedianoche(int horas, int minutos, int expectedSegundos) {
        assertEquals(expectedSegundos, Main.IfSwitchExercise11.run(horas, minutos));
    }

    // Ejercicio 13
/*
    @Test
    void testOrdenarTresNumeros() {
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertArrayEquals(expectedList, Main.IfSwitchExercise13.run(2, 3, 1));
    }
*/

    // Ejercicio 16
    @Test
    void testCalcularProbabilidadInfidelidad() {
        // Este test dependerá de cómo implementes el cálculo
        assertTrue(EjerciciosSwitch.calcularProbabilidadInfidelidad() >= 0 && EjerciciosSwitch.calcularProbabilidadInfidelidad() <= 100);
    }

    // Ejercicio 17
    @ParameterizedTest
    @ValueSource(ints = {123, 456, 789, 1000})
    void testObtenerUltimaCifra(int numero) {
        assertEquals(numero % 10, Main.IfSwitchExercise17.run(numero));
    }

    // Ejercicio 19
    @ParameterizedTest
    @CsvSource({
            "12345, 5",
            "100, 3",
            "-9876, 4",
            "7, 1"
    })
    void testContarDigitos(int numero, int expectedDigitos) {
        assertEquals(expectedDigitos, Main.IfSwitchExercise19.run(numero));
    }

    // Ejercicio 21
    @Test
    void testCalcularNotaTrimestre() {
        assertEquals(5.0, Main.IfSwitchExercise21.run(4, 5, true), 0.01);
        assertEquals(7.5, Main.IfSwitchExercise21.run(7, 8, false), 0.01);
    }
}