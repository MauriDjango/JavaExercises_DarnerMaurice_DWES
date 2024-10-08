package exercises.ex_01;

import java.util.ArrayList;
import ui.IO;


public class Exercise1 extends EntradaSalidaExercise {
    public Exercise1(IO io) {
        super(io);
    }

    String exerciseName = "Exercise 1";
    String description = "Realiza un programa que pida dos números y que luego muestre el resultado de su multiplica";

    //TODO Check this method of init blocks using sonarLint
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter first number: ");
        question.add("Enter second number: ");
    }

    public short run() {
            ArrayList<String> inputs = getInputs();

            int num1 = io.toInt(inputs.get(0));
            int num2 = io.toInt(inputs.get(1));

            return (short) (num1 * num2);
    }
}
