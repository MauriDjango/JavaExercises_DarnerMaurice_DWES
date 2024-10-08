package exercises.ex_01;

import exercises.Exercise;
import ui.IO;

public abstract class EntradaSalidaExercise extends Exercise {

  /**
   * Constructor to initialize the Exercise with an IO object.
   *
   * @param io An IO object for input and output.
   */
  EntradaSalidaExercise(IO io) {
    super(io);
  }
}
