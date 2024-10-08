package exercises.ex_00;

import ui.IO;


public class Exercise6 extends BasicExercise {

  public Exercise6(IO io) {
    super(io);
    setExerciseName("Exercise 3");
    setDescription("""
Crea las variables nombre, direccion y telefono y asígnale los valores corres- pondientes.
Muestra
los valores de esas variables por pantalla de tal forma que el resultado del programa sea el mismo
que en el ejercicio 2.""");
  }

  public double calculate(int x) {
    double iva = .21;
    return (x + x * iva);
  }
}

