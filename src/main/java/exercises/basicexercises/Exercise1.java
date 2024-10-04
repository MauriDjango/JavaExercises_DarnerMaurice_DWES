package exercises.basicexercises;

import ui.IO;


public class Exercise1 extends BasicExercise {
  private static final int X = 144;
  private static final int Y = 999;

  public Exercise1(IO io) {
    super(io);
    this.setExerciseName("Exercise 1");
    this.setDescription("""
Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.""");
  }

  private int add() {
    return Exercise1.X + Exercise1.Y;
  }

  private int minus() {
    return Exercise1.X - Exercise1.Y;
  }

  private int multiply(){
    return Exercise1.X * Exercise1.Y;
  }

  private float divide() {
    return (float) Exercise1.Y / Exercise1.X;
  }

  public String run() {
    return(String.format("""
                        The numbers added = %s
                        The numbers subtracted = %s
                        The numbers multiplied = %s
                        The numbers divided = %.2f"""
        , this.add(), this.minus(), this.multiply(), this.divide()));
  }
}