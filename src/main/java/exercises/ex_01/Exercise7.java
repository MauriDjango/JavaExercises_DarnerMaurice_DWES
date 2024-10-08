package exercises.ex_01;

import ui.IO;
import java.util.ArrayList;

public class Exercise7 extends EntradaSalidaExercise {

    String exerciseName = "Exercise7";
    String description = "Escribe un programa que calcule el total de una factura a partir de la base imponible.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("How much was the bill?");
        question.add("How much is the tax?");
    }
    public Exercise7(IO io) {
        super(io);
    }

    public double run() {
        ArrayList<String> inputs = getInputs();
        int bill = io.toInt(inputs.get(0));
        int tax = io.toInt(inputs.get(1));

        return calculatePrice(bill, tax);
    }

    private double calculatePrice(int bill, int tax) {
        return (bill + (bill*((double) tax /100)));
    }
}
