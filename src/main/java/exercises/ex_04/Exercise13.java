package exercises.ex_04;

import ui.IO;

public class Exercise13 extends NumAleatoriosExercises {
    String exerciseName = "Exercise 13";
    String description = "Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los\n" +
            "dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }
    public Exercise13(IO io) {
        super(io);
    }

    public void run() {
        int dice1 = rollDice();
        int dice2 = rollDice();

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
        io.write(String.format("""
                Dice 1 : Dice 2
                %d     : %d
                """,
                dice1, dice2));
        }
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
