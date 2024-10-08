package exercises.ex_02;

import ui.IO;
import java.util.ArrayList;

public class Exercise19 extends IfSwitchExercises {
    String exerciseName = "Exercise 19";
    String description = "Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo\n" +
            "o negativo. Se permiten números de hasta 5 dígitos.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number to find its length.");
    }

    public Exercise19(IO io) {
        super(io);
    }

    public short run(int number) {
        return (short) findIntLength(number);
    }

    private int findIntLength(int number) {
        if (number < 0) {
            number = number * -1;
        }
        return Integer.toString(number).length();
    }
}
