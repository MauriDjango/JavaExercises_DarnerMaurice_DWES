package exercises.ex_01;

import java.util.ArrayList;
import ui.IO;


public class Exercise13 extends EntradaSalidaExercise {

    String exerciseName = "Exercise 13";
    String description = """
            Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
            Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
            examen cuenta el 40% y la del segundo examen un 60
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce the marks of the first exam");
        question.add("What marks would do you want for the trimester?");
    }

    public Exercise13(IO io) {
        super(io);
    }

    //TODO Update to getDouble
    public double run() {
        ArrayList<String> inputs = getInputs();
        int firstMark = io.toInt(inputs.get(0));
        int expectedMark = io.toInt(inputs.get(1));
        return calculateGrade(firstMark, expectedMark);
    }

    private double calculateGrade(int firstMark, int expectedMark) {

        return (expectedMark - (firstMark * .4)) / .6;
    }
}
