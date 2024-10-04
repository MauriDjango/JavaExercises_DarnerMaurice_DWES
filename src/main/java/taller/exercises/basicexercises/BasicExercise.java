package taller.exercises.basicexercises;

import taller.exercises.Exercise;
import taller.ui.IO;

public abstract class BasicExercise extends Exercise {

  /**
   * Constructor to initialize the Exercise with an IO object.
   *
   * @param io An IO object for input and output.
   */
  BasicExercise(IO io) {
    super(io);
  }
}
