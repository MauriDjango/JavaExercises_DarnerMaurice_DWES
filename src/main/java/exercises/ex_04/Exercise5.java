package exercises.ex_04;

import ui.IO;

public class Exercise5 extends NumAleatoriosExercises {
    String exerciseName = "Exercise 5";
    String description = "Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.\n" +
            "Muestra también el máximo, el mínimo y la media de esos números.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }
    public Exercise5(IO io) {
        super(io);
    }

    public void run() {
        int total = 0;
        int max = 0;
        int min = 0;
        int number = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            number = (int) Math.round((Math.random()*100) + 100);
            io.write(String.format("%s", number));
            total = (int) (total + number);
            if (number > max) {
                max = (int) number;
            }
            if (number < min) {
                min = (int) number;
            }
            result.append(number + " ");
        }
        io.write(String.format("The max number is %d, The minimum number is %d, adn their average is %d", max, min, (max + min) / 2));
        io.write(result.toString());
    }
}
