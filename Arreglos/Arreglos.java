import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        /*
         * 1. Escriba un programa que permita imprimir en pantalla cada uno de los
         * elementos del siguiente
         * arreglo: [0, 28, 30, 10, 4].
         */

        int[] arreglo1 = new int[5];
        arreglo1[0] = 0;
        arreglo1[1] = 28;
        arreglo1[2] = 30;
        arreglo1[3] = 10;
        arreglo1[4] = 4;

        for (int i : arreglo1) {
            System.out.println(i);
        }

        /*
         * 2. Escriba un programa que permita imprimir al revés cada uno de los
         * elementos del siguiente
         * arreglo: [0, 28, 30, 10, 4].
         */

        ArrayList<Integer> arreglo2 = new ArrayList<Integer>(Arrays.asList(0, 28, 30, 10, 4));

        for (int i = arreglo2.size() - 1; i >= 0; i--) {
            System.out.println(arreglo2.get(i));
        }

        /*
         * 3. Escriba un programa que permita calcular la suma de todos los elementos
         * del siguiente arreglo:
         * [1, 3, 6, 82, 23].
         */

        ArrayList<Integer> arreglo3 = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 82, 23));
        int suma = 0;
        for (int i = 0; i < arreglo3.size(); i++) {
            suma += arreglo3.get(i);
        }

        System.out.println(suma);

        /*
         * 4. Escriba un programa que deduzca e imprima en pantalla el número menor en
         * el siguiente
         * arreglo: [90, 1, 38, 0, 29, 4].
         */

        ArrayList<Integer> arreglo4 = new ArrayList<Integer>(Arrays.asList(90, 1, 38, 0, 29, 4));
        int numMenor = arreglo4.get(0);

        for (int i = 0; i < arreglo4.size(); i++) {
            if (arreglo4.get(i) < numMenor) {
                numMenor = arreglo4.get(i);
            }
        }
        System.out.println(numMenor);

        /*
         * 5. Escriba un programa que permita calcular la suma y el producto entre pares
         * de todos los
         * elementos de los siguientes arreglos: [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23].
         */

        ArrayList<Integer> arreglo5 = new ArrayList<Integer>(Arrays.asList(0, 28, 30, 10, 4));
        ArrayList<Integer> arreglo6 = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 82, 23));
        ArrayList<Integer> arreglo7 = new ArrayList<Integer>();

        for (int i = 0; i < arreglo5.size(); i++) {
            arreglo7.add(arreglo5.get(i) + arreglo6.get(i));
        }
        System.out.println(arreglo7);

        /*
         * 6. Escriba un programa que lea un arreglo de seis elementos (ingresados por
         * el usuario) e
         * intercambie las posiciones de sus elementos, de tal forma que el primero pase
         * a ser el último y
         * el último el primero, el segundo el penúltimo, y así sucesivamente. Imprima
         * en pantalla el
         * arreglo resultante.
         */

        Console console = System.console();
        ArrayList<Integer> arreglo8 = new ArrayList<Integer>();
        ArrayList<Integer> arreglo9 = new ArrayList<Integer>();

        for (int i = 1; i < 7; i++) {
            int elementos = Integer.parseInt(console.readLine("ingresa el número " + i + ": "));
            arreglo8.add(elementos);
        }

        System.out.println(arreglo8);
        // No olvidar porner -1 cuando es decremento
        for (int i = arreglo8.size() - 1; i >= 0; i--) {
            System.out.println(arreglo8.get(i));
            arreglo9.add(arreglo8.get(i));
        }

        System.out.println(arreglo9);

        /*
         * 7. Escriba un programa que solicite al usuario el número de alumnos de un
         * curso y cree un arreglo
         * que almacene las notas del control 1 del curso. Luego, imprima en pantalla el
         * promedio de
         * todas las notas y muestre cuáles notas resultaron estar sobre el promedio.
         */

        int numAlumnos = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos: "));
        ArrayList<Float> alumnosNotas = new ArrayList<Float>();
        ArrayList<Float> notasSobreElPromedio = new ArrayList<Float>();
        float nota = 0;
        float sumaN = 0;

        for (int i = 1; i < numAlumnos + 1; i++) {
            nota = Float.parseFloat(console.readLine("\n Ingrese la nota del alumno " + i + " : "));
            alumnosNotas.add(nota);
        }

        for (int i = 0; i < alumnosNotas.size(); i++) {
            sumaN += alumnosNotas.get(i);
            System.out.println(sumaN);
        }
        float promedioN = sumaN / numAlumnos;// multiplico por 100 para luego redondear y dividir por 100

        for (int i = 0; i < alumnosNotas.size(); i++) {
            if (alumnosNotas.get(i) > promedioN) {
                notasSobreElPromedio.add(alumnosNotas.get(i));
            }
        }
        System.out.println(promedioN);
        System.out.println(notasSobreElPromedio);

        /*
         * 8. Escriba un programa que solicite al usuario el tamaño de un arreglo y un
         * número entero, e
         * imprima en pantalla el resultado de llenar dicho arreglo con los múltiplos
         * del número dado. Por
         * ejemplo, si se define un arreglo de tamaño 5 y se indica el valor 3, el
         * resultado será el arreglo
         * formado por los valores [3, 6, 9, 12, 15].
         */

        int tamanhoArreglo = Integer.parseInt(console.readLine("Ingrese el tamaño del arreglo: "));
        int numEntero = Integer.parseInt(console.readLine("Ingrese un número entero: "));
        int multiplosEntero = 0;
        ArrayList<Integer> resultadosEnteros = new ArrayList<Integer>();

        for (int i = 0; i < tamanhoArreglo; i++) {
            multiplosEntero += numEntero;
            resultadosEnteros.add(multiplosEntero);
        }
        System.out.println(resultadosEnteros);

    }
}