package exercises.ex_03;

import ui.IO;

public class Exercise1 extends BuclesExercises {
    {
        setExerciseName("Exercise 1");
        setDescription("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.");
    }

   public Exercise1(IO io) {
        super(io);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            io.write(Integer.toString(timesFive(i)));
        }
    }

    private int timesFive(int num) {
        return num * 5;
    }
}
