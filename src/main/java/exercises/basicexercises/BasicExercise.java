package exercises.basicexercises;

import exercises.Exercise;
import ui.IO;

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
