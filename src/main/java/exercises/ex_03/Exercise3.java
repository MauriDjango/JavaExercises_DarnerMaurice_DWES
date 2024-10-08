package exercises.ex_03;

import ui.IO;

public class Exercise3 extends BuclesExercises {
    {
        setExerciseName("Exercise 3");
        setDescription("\"Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.");
    }

    public Exercise3(IO io) {
        super(io);
    }

    public void run() {
        int i = 0;
        do {
            io.write(Integer.toString(timesFive(i)));
            i += 1;
        }
        while (i <= 100);
    }

    private int timesFive(int num) {
        return num * 5;
    }
}
