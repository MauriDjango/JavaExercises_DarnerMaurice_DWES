package exercises.ex_01;

import ui.IO;
import java.util.ArrayList;

public class Exercise5 extends EntradaSalidaExercise {

    String exerciseName = "Exercise 5";
    String description = "Escribe un programa que calcule el área de un rectángulo.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter length");
        question.add("Enter width");
    }

    public Exercise5(IO io) {
        super(io);
    }

    public int run() {
        ArrayList<String> inputs = getInputs();
        int length = io.toInt(inputs.get(0));
        int width = io.toInt(inputs.get(1));

        return (length * width);
    }
}
