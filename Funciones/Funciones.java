public class Funciones {

    static float promedioEnteros(float num1, float num2) {
        float promedio = (num1 + num2)/2;
        return promedio;
    }

    static int parImpar(int num) {
        double par = num%2;
        if(par == 0){
            return num-1;
        } else {
            return num+1;
        }
    }
    public static void main(String[] args) {

        /*
         * 1. Escriba una función que, dados dos números enteros recibidos como
         * parámetros, devuelva el promedio entre ellos.*/

        //System.out.println(promedioEnteros(2, 3));
        
        /* 2. Escriba una función tal que recibe un número entero positivo. Si es par,
         * debe devolver su antecesor y en caso contrario, su sucesor.
         *  */

        System.out.println(parImpar(8));
        /* 3. Escriba una función que, dada una temperatura en grados Celsius, la
         * devuelva en grados Fahrenheit.
         * Use su función en un programa que lea una cantidad indeterminada de
         * temperaturas en Celsius (que termina cuando se ingresa el valor -999) e
         * imprima en pantalla el valor correspondiente en Fahrenheit. */

        
        /*  4. Escriba una función que reciba una fecha en formato DDMMAAAA y la devuelva
         * en formato AAAAMMDD. Use su función en un programa que reciba por teclado dos fechas (en formato
         * DDMMAAAA) e imprima en pantalla la mayor. */

        
        /* 5. Escriba una función que devuelva Verdadero si un número es primo y Falso
         * en caso contrario.
         * Use su función en un programa que lea por teclado una cantidad indeterminada
         * de números positivos (que termina si se ingresa un número menor o igual a 1), e imprima
         * sucesivamente si el número es o no primo. */
    }
}
