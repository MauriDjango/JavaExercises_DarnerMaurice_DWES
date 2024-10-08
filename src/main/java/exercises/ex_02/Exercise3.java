package exercises.ex_02;

import ui.IO;

public class Exercise3 extends IfSwitchExercises {

    String exerciseName = "Exercise 3";
    String description = """
            Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día
            de la semana.
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Choose a number between 1 and 7 to see which day of the week it corresponds to.");
    }

    public Exercise3(IO io) {
        super(io);
    }

    public String run(String input) {
        switch (io.toInt(input)) {
            case 1:
                return ("Sunday!");
            case 2:
                return ("Monday!");
            case 3:
                return ("Tuesday!");
            case 4:
                return ("Wednesday!");
            case 5:
                return ("Thursday!");
            case 6:
                return ("Friday!");
            case 7:
                return ("Saturday!");
            default:
               return ("Invalid input!");
        }
    }
}

