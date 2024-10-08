package exercises.ex_03;

import ui.IO;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise13 extends BuclesExercises {
    String exerciseName = "Exercise 13";
    String description = "Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuán-\n" +
            "tos son negativos.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
    }
    public Exercise13(IO io) {
        super(io);
    }

    public void run() {
        ArrayList<String> inputs = getInputs();
        AtomicInteger positives = new AtomicInteger();
        AtomicInteger negatives = new AtomicInteger();
        inputs.forEach(input -> {
            if (io.toInt(input) >= 0) {
                positives.addAndGet(1);
            } else {
                negatives.addAndGet(1);
            }
        });
        io.write(String.format("There are %d positive numbers and %d negative numbers.", positives.get(), negatives.get()));
    }
}
