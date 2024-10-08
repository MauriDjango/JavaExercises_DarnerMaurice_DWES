package exercises.ex_02;

import ui.IO;

public class Exercise17 extends IfSwitchExercises {

    String exerciseName = "Exercise17";
    String description = "Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number");
    }

    public Exercise17(IO io) {
        super(io);
    }

    public int run(int number) {
        return findLastNumber(number);
    }

    private int findLastNumber(int number) {
        return number % 10;
    }
}
