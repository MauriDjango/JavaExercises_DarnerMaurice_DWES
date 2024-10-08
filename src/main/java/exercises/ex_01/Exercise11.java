package exercises.ex_01;

import ui.IO;

import java.util.ArrayList;

public class Exercise11 extends EntradaSalidaExercise {

    String exerciseName = "Exercise 11";
    String description = "Realiza un conversor de Kb a Mb.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Input the amount of Kb: ");
    }

    public Exercise11(IO io) {
        super(io);
    }

    private double conversion(int kb) {
        return (double) kb / 1024;
    }

    public double run() {
        ArrayList<String> inputs = getInputs();

        int kb = io.toInt(inputs.get(0));
        return conversion(kb);
    }
}
