package exercises.ex_02;

import ui.IO;

public class Exercise5 extends IfSwitchExercises {
    String exerciseName = "Exercise 5";
    String description = "Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter the value of a:");
        question.add("Enter the value of b:");
    }

    public Exercise5(IO io) {
        super(io);
    }

    private Double equation(int a, int b) {
        return (double) b/(-a);
    }

    public Double run(String num1, String num2) {
        int a = io.toInt(num1);
        int b = io.toInt(num2);

        return equation(a, b);
    }
}

