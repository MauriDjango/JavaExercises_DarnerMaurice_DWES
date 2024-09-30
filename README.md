# JavaExercises_DarnerMaurice_DW

# Java Exercises - Darner Maurice DW

### Ejercicios de Entrada/Salida desde teclado y consola

---

### Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser 
introducida por teclado.

---

### Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.

---

### Ejercicio 6
Escribe un programa que calcule el área de un triángulo.

---

### Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a 
razón de 12 euros la hora.

---

### Ejercicio 10
Realiza un conversor de Mb a Kb.

---

### Ejercicio 12
Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes
de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. 
Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser `nopro`, `mitad`, `meno5` o `5porc` que significan respectivamente que no se
aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.

El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

---

# Java Ejercicios Switch

---

## Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o 
buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente.
Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.

---

## Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. 
Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas
ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se 
pagan a 16 euros la hora.

---

## Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura `h`. Aplica
la fórmula `t = √(2h / g)` siendo `g = 9.81 m/s²`.

---

## Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, 
notable o sobresaliente).

---

## Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

---

## Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el 
curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de 
conocimientos en las diferentes asignaturas del curso.

---

## Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

---

## Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. 
El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta 
contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. 
Utiliza el fichero `test_infidelidad.txt` para obtener las preguntas y las conclusiones del programa.

---

## Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. 
Se permiten números de hasta 5 cifras.

---

## Ejercicio 20
Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se 
permiten números de hasta 5 cifras.

---

## Ejercicio 22
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos),
calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza 
el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, 
anterior al viernes a las 15:00h.

---

# Ejercicios de Bucles

---

## Ejercicio 2
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

---

## Ejercicio 4
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.

---

## Ejercicio 6
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.

---

## Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.

---

## Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos introducidos por 
teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha 
terminado de introducir los datos cuando meta un número negativo.

---

## Ejercicio 12
Escribe un programa que muestre los *n* primeros términos de la serie de Fibonacci. El primer 
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos 
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
144... El número *n* se debe introducir por teclado.

---

## Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

---

## Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es 
aquel que sólo es divisible entre él mismo y la unidad.

---

## Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por 
teclado y validados como distintos. El programa debe empezar por el menor de los enteros introducidos
e ir incrementando de 7 en 7.

---

## Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

---

## Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

---

# Java: Ejercicios con números aleatorios

---

## Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja 
está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por 
13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K 
y A (que sería el 1). Para convertir un número en una cadena de caracteres podemos usar `String.valueOf(n)`.

---

## Ejercicio 4
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.

---

## Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene 
para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades 
quedan y si el número introducido es menor o mayor que el número secreto.

---

## Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la probabilidad 
de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

---

## Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el 
que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. 
Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

---

## Ejercicio 12
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código 
ASCII entre el 32 y el 126. Puedes hacer casting con `(char)` para convertir un entero en un carácter.

---

## Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará 
adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.
