package exercises.basicexercises;

import ui.IO;


public class Exercise3 extends BasicExercise {

    public Exercise3(IO io) {
        super(io);
        setExerciseName("Exercise 3");
        setDescription("""
Crea las variables nombre, direccion y telefono y asígnale los valores corres- pondientes.
Muestra
los valores de esas variables por pantalla de tal forma que el resultado del programa sea el mismo
que en el ejercicio 2.""");
    }

    public String run(String name, String address, String phone) {
        return(String.format("""
                        Name = %s
                        Address = %s
                        Phone = %s
                        """
                , name, address, phone));
    }
}

