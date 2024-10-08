package exercises.ex_03;

import ui.IO;
import java.util.ArrayList;

public class Exercise9 extends BuclesExercises {
    String exerciseName = "Exerciser 9";
    String description = "Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number to see how many digits it has.");
    }
    public Exercise9(IO io) {
        super(io);
    }

    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));

        io.write("The number of digits is " + countDigits(number));
    }

    private int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
