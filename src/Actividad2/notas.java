package Actividad2;

import java.util.Scanner;

/**
 * La clase notas permite gestionar las notas de un estudiante, 
 * incluyendo su ingreso, validación, cálculo de nota y 
 * resultado final (aprobado o suspendido).
 * 
 * Esta clase incluye métodos para:
 * Ingresar notas desde consola
 * Comprobar si las notas están en el rango válido
 * Calcular la nota definitiva con ponderaciones
 * Mostrar resultados
 * Determinar si el estudiante ha aprobado
 * 
 * @author Javier
 * @version 1.0
 * @since 29-03-2025
 */
public class notas {

    /** Nota correspondiente a la Unidad Formativa 1 */
    private double unidadFormativa1;

    /** Nota correspondiente a la Unidad Formativa 2*/
    private double unidadFormativa2;

    /** Nota correspondiente a la Unidad Formativa 3*/
    private double unidadFormativa3;

    /** Acumulado ponderado de la UF1 (35%) */
    private double acu1;

    /** Acumulado ponderado de la UF2 (35%) */
    private double acu2;

    /** Acumulado ponderado de la UF3 (30%) */
    private double acu3;

    /** Nota definitiva calculada con las ponderaciones */
    private double def;

    /** Scanner utilizado para la entrada de datos del usuario */
    private final Scanner entrada = new Scanner(System.in);

    /**
     * Solicita al usuario que introduzca las notas correspondientes a las tres unidades formativas.
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante:");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Verifica si las notas introducidas están en un rango válido (0 a 10)
     * y muestra un mensaje por cada nota indicando si es correcta o no.
     */
    public void comprobarcion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Calcula las notas acumuladas aplicando los porcentajes de ponderación
     * y obtiene la nota definitiva del estudiante.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Muestra por consola las notas introducidas, los acumulados de cada unidad formativa
     * y la nota definitiva calculada.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Determina si el estudiante ha aprobado en función de su nota definitiva.
     * Menor a 5: Suspendido
     * Entre 5 y 10: Aprobado
     * Fuera de ese rango: Error
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else if (def >= 5 && def <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Error en las notas");
        }
    }

    /**
     * Método principal que inicia la ejecución del programa.
     * Llama a los métodos de la clase para ingresar, verificar,
     * calcular, mostrar las notas y determinar el resultado.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     * @see notas#IngresaNotas()
     * @see notas#comprobarcion()
     * @see notas#Calculonotas()
     * @see notas#Mostrar()
     * @see notas#aprobado()
     */
    public static void main(String[] args) {
        notas fc = new notas();
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}


