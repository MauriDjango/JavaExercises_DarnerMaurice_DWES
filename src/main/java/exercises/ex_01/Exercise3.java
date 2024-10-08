package exercises.ex_01;

import static java.lang.Math.round;
import ui.IO;


public class Exercise3 extends EntradaSalidaExercise {
    String exerciseName = "Exercise 3";
    String description = "Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser\n" +
            "introducida por teclado";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter quantity of pesetas");
    }

    public Exercise3(IO io) {
        super(io);
    }

    private double convert(int quantity) {
        return round((quantity * 0.00601012)*100.0)/100.0;
    }

    public double run() {
        int quantity = io.toInt(getInputs().get(0));
        return convert(quantity);
    }
}
