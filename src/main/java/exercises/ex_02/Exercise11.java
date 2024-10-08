package exercises.ex_02;

import ui.IO;
import java.util.ArrayList;

//TODO should validate correct hours and minutes
public class Exercise11 extends IfSwitchExercises {
    String exerciseName = "Exercise 11";
    String description = "Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que\n" +
            "faltan para llegar a la medianoche.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Type the current hour");
        question.add("Type the current minute");
    }
    public Exercise11(IO io) {
        super(io);
    }

    public int run(int hour, int minute) {
        return getSecsToMidnight(hour, minute);
    }

    private int getSecsToMidnight(int hour, int minute) {
        return (((24-hour)*60+(60-minute))*60);
    }
}
