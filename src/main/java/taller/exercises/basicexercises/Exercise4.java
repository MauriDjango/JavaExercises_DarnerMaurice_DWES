package taller.exercises.basicexercises;

import static java.lang.Math.round;

import taller.ui.IO;


public class Exercise4 extends BasicExercise {

  {
    setExerciseName("Exercise 4");
    setDescription("""
            Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
            estar almacenada en una variable.
            """);
    question.add("Enter the quantity of euros you would like to convert: ");
  }

  public Exercise4(IO io) {
    super(io);
  }

  public double convert(int euros) {
    return (euros * 166.386);
  }
}


