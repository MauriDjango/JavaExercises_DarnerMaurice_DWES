package exercises.ex_01;

import ui.IO;

import java.util.ArrayList;

public class Exercise9 extends EntradaSalidaExercise {

    String exerciseName = "Exercise 9";
    String description = "Escribe un programa que calcule el volumen de un cono según la fórmula";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce the radius of the cone");
        question.add("Introduce the height of the cone");
    }
    public Exercise9(IO io) {
        super(io);
    }

    private double volume(int radius, int height) {
        return (Math.PI * radius * radius * height) / 3;
    }

    public double run() {
        ArrayList<String> inputs = getInputs();
        int radius = io.toInt(inputs.get(0));
        int height = io.toInt(inputs.get(1));

        return volume(radius, height);
    }
}
