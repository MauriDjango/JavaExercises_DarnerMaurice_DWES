package taller.exercises.basicexercises;

import taller.ui.IO;


public class Exercise2 extends BasicExercise {

  public Exercise2(IO io) {
    super(io);
    setExerciseName("Exercise 2");
    setDescription("""
Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por pantalla de tal
forma que el resultado del programa sea el mismo que en el ejercicio 1 del capítulo 1.""");
  }

  public String run(String input) {
    return(String.format("My name is %s"
        , input));
  }
}