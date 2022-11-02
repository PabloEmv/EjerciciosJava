import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funciones {

    static float PromedioEnteros(float num1, float num2) {
        float promedio = (num1 + num2)/2;
        return promedio;
    }

    static int ParImpar(int num) {
        double par = num%2;
        if(par == 0){
            return num-1;
        } else {
            return num+1;
        }
    }

    static Float GradosFahrenheit(float num) {
        float fahrenheit = num * 1.8f + 32;
            return fahrenheit;
    }

    static void fechaF2(String fecha1, String fecha2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fecha1Formateada = LocalDate.parse(fecha1, formatter); // pasamos fecha1 a un formato de fecha
        LocalDate fecha2Formateada = LocalDate.parse(fecha2, formatter); // pasamos fecha2 a un formato de fecha

        String fecha1Final = fecha1Formateada.format(formatter2); // cambiamos fecha1 de dd-MM-yyyy a yyyy-MM-dd
        String fecha2Final = fecha2Formateada.format(formatter2); // cambiamos fecha2 de dd-MM-yyyy a yyyy-MM-dd

        LocalDate fecha1F = LocalDate.parse(fecha1Final); // pasamos fecha1Final a formato de fecha
        LocalDate fecha2F = LocalDate.parse(fecha2Final); // pasamos fecha2Final a formato de fecha

        if(fecha1F.isAfter(fecha2F)) {
            System.out.println("La fecha " + fecha1F + " es mayor");
        } else {
            System.out.println("La fecha " + fecha2F + " es mayor");
        }




    }
    public static void main(String[] args) {

        /*
         * 1. Escriba una función que, dados dos números enteros recibidos como
         * parámetros, devuelva el promedio entre ellos.*/

        System.out.println(PromedioEnteros(2, 3));
        
        /* 2. Escriba una función tal que recibe un número entero positivo. Si es par,
         * debe devolver su antecesor y en caso contrario, su sucesor.
         *  */

        System.out.println(ParImpar(8));

        /* 3. Escriba una función que, dada una temperatura en grados Celsius, la
         * devuelva en grados Fahrenheit.
         * Use su función en un programa que lea una cantidad indeterminada de
         * temperaturas en Celsius (que termina cuando se ingresa el valor -999) e
         * imprima en pantalla el valor correspondiente en Fahrenheit. */

        Console console = System.console();
        
        float valorC = 0;
        while(valorC != -999){
            valorC = Float.parseFloat(console.readLine("inserte temperatura a convertir. para salir escriba -999 "));
            if (valorC != -999) {
                System.out.println("la temperatura de " + valorC + "C en Fahrenheit es de: " + GradosFahrenheit(valorC));
            }
        }

        /*  4. Escriba una función que reciba una fecha en formato DDMMAAAA y la devuelva
         * en formato AAAAMMDD. Use su función en un programa que reciba por teclado dos fechas (en formato
         * DDMMAAAA) e imprima en pantalla la mayor. */

        String fecha1 = console.readLine("inserte la fecha 1 en el formato DD-MM-AAAA: "); 
        String fecha2 = console.readLine("inserte la fecha 2 en el formato DD-MM-AAAA: ");

        fechaF2(fecha1, fecha2);
        
        /* 5. Escriba una función que devuelva Verdadero si un número es primo y Falso
         * en caso contrario.
         * Use su función en un programa que lea por teclado una cantidad indeterminada
         * de números positivos (que termina si se ingresa un número menor o igual a 1), e imprima
         * sucesivamente si el número es o no primo. */

        
    }
}
