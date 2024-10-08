package exercises.ex_02;

import ui.IO;
import java.util.ArrayList;

public class Exercise9 extends IfSwitchExercises {
    String exerciseName = "Exercise 5";
    String description = "Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).";

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }

    public Exercise9(IO io) {
        super(io);
    }

    private Double equation(int a, int b) {
        return (double) b/(-a);
    }

    public Double run() {
        ArrayList<String> inputs = getInputs();
        int a = io.toInt(inputs.get(0));
        int b = io.toInt(inputs.get(1));

        return equation(a, b);
    }
}