package taller.main;

import taller.exercises.basicexercises.BasicExercise;
import taller.exercises.basicexercises.Exercise1;
import taller.exercises.basicexercises.Exercise2;
import taller.exercises.basicexercises.Exercise3;
import taller.exercises.basicexercises.Exercise4;
import taller.exercises.basicexercises.Exercise5;
import taller.exercises.basicexercises.Exercise6;
import taller.ui.ioConsole;
import taller.ui.IO;


public class Main {

  public static IO consoleio = new ioConsole();

  public static Exercise1 exercise1 = new Exercise1(consoleio);
  public static Exercise2 exercise2 = new Exercise2(consoleio);
  public static Exercise3 exercise3 = new Exercise3(consoleio);
  public static Exercise4 exercise4 = new Exercise4(consoleio);
  public static Exercise5 exercise5 = new Exercise5(consoleio);
  public static Exercise6 exercise6 = new Exercise6(consoleio);
}
