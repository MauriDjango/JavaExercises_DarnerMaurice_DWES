package exercises.ex_02;

import ui.IO;

public class Exercise1 extends IfSwitchExercises {

    String exerciseName = "Exercise 1";
    String description = "Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a\n" +
            "primera hora ese día.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Type the day of which you want to know the first class.");
    }


    public Exercise1(IO io) {
        super(io);
    }

    //TODO Check for complextity
    public String run(String input) {
        switch (input.toLowerCase()) {
            case "sunday", "saturday":
                return ("No Class");
            case "monday", "friday":
                return ("DWES");
            case "tuesday":
                return ("EIE");
            case "wednesday", "thursday":
                return ("DWEC");
            default:
                return ("""
                        The day you entered was not recognized.
                        Please enter one of the days of the week.""");
        }
    }
}
