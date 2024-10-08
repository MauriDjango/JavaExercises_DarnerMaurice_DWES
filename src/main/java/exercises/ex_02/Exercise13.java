package exercises.ex_02;

import ui.IO;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise13 extends IfSwitchExercises {
    String exerciseName = "Exerecise 13";
    String description = "Escribe un programa que ordene tres números enteros introducidos por teclado.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce the first number");
        question.add("Introduce the second number");
        question.add("Introduce the third number");
    }
    public Exercise13(IO io) {
        super(io);
    }

    public ArrayList<Integer> run(int num1, int num2, int num3) {
        return order(num1, num2, num3);
    }


    private ArrayList<Integer> order(int num1, int num2, int num3) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        Collections.sort(numList);

        return numList;
    }
}
