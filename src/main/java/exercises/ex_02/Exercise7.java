package exercises.ex_02;

import ui.IO;

public class Exercise7 extends IfSwitchExercises {
    String exerciseName = "Exercise 7";
    String description = """
            Realiza un programa que calcule la media de tres notas. 35Sentencia condicional ( if y switch )
            """;
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Type the first mark");
        question.add("Type the second mark");
        question.add("Type the third mark");
    }
    public Exercise7(IO io) {
        super(io);
    }

    public double run(double num1, double num2, double num3) {
        return getAverage(num1, num2, num3);
    }

    public double getAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
