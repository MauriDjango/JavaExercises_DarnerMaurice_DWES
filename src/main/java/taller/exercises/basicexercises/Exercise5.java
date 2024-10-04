package taller.exercises.basicexercises;

import static java.lang.Math.round;

import taller.ui.IO;


public class Exercise5 extends BasicExercise {

    {
        setExerciseName("Exercise 5");
        setDescription("""
            Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá
            estar almacenada en una variable.
            """);
        question.add("Enter the quantity of pesetas you would like to convert: ");
    }

    public Exercise5(IO io) {
        super(io);
    }

    public double convert(int pesetas) {
        return round((pesetas * 0.00601012)*100.0)/100.0;
    }

}


