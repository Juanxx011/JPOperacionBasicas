package view;

/**
 * La clase Vista se encarga de la interacción con el usuario en la consola.
 * Proporciona métodos para mostrar mensajes, leer números y presentar resultados.
 * Actúa como la capa de presentación en la arquitectura MVC.
 *
 * @author Alonso Guevara Pérez
 * @version 1.0
 * @since 2025-03-28
 * @license MIT
 */
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    /**
     * Constructor de la clase Vista.
     * Inicializa el objeto Scanner para la entrada de datos desde la consola.
     */
    public Vista() {
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra un mensaje en la consola.
     *
     * @param mensaje Mensaje que se mostrará al usuario.
     */
    public void mMostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Solicita al usuario un número y lo devuelve como un valor de tipo double.
     *
     * @param mensaje Mensaje de solicitud para el usuario.
     * @return Número ingresado por el usuario.
     */
    public double mLeerNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    /**
     * Muestra un resultado en la consola junto con un mensaje descriptivo.
     *
     * @param mensaje Mensaje que acompaña al resultado.
     * @param resultado Valor numérico a mostrar.
     */
    public void mMostrarResultado(String mensaje, double resultado) {
        System.out.println(mensaje + resultado);
    }

    /**
     * Cierra el Scanner para liberar recursos y evitar pérdidas de memoria.
     */
    public void mCerrarScanner() {
        scanner.close();
    }
}
