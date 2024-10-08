package exercises.ex_03;

import ui.IO;

public class Exercise5 extends BuclesExercises {
    {
        setExerciseName("Exercise 5");
        setDescription("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.");
    }

    public Exercise5(IO io) {
        super(io);
    }

    public void run() {
        int num = 320;
        while (num >= 160) {
            io.write(Integer.toString(num));
            num = countByTwenty(num);
        }
    }

    private int countByTwenty(int num) {
        return num - 20;
    }
}
