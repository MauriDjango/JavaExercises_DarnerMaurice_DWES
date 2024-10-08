package exercises.ex_03;

import ui.IO;
import java.util.ArrayList;

public class Exercise7 extends BuclesExercises {
    String exerciseName ="Exercise 7";
    String description = """
            Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
            programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
            “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
            satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Input a 4 number combination to attempt to open the safe.");
    }
    public Exercise7(IO io) {
        super(io);
    }

    public void run() {
        int i = 4;
        do {
            ArrayList<String> inputs = getInputs();
            if (testCombination(io.toInt(inputs.get(0)))) {
                io.write("La caja fuerte se ha abierto satisfactoriamente");
                i = 0;
            }  else {
                io.write("Lo siento, esa no es la combinación");
                i -= 1;
            }
        } while (i > 0);
    }

    private Boolean testCombination(int combination) {
        return combination == 1992;
    }
}
