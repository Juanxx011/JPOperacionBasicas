package controller;

import model.Operaciones;
import view.Vista;

/**
 * La clase Controlador actúa como intermediario entre la vista (Vista) y el modelo (Operaciones).
 * Se encarga de gestionar la lógica de la aplicación, solicitando datos a la vista y
 * utilizando la clase Operaciones para realizar cálculos matemáticos.
 *
 * Forma parte del patrón de arquitectura Modelo-Vista-Controlador (MVC).
 *
 * @author Alonso Guevara Pérez
 * @version 1.0
 * @since 2025-03-28
 * @license MIT
 */
public class Controlador {

    /**
     * Objeto de la clase Vista para interactuar con el usuario.
     */
    private Vista objVista;

    /**
     * Objeto de la clase Operaciones para realizar cálculos matemáticos.
     */
    private Operaciones objOperaciones;

    /**
     * Constructor de la clase Controlador.
     *
     * @param vista Objeto de la clase Vista que se utilizará para la interacción con el usuario.
     */
    public Controlador(Vista vista) {
        this.objVista = vista;
    }

    /**
     * Método principal que ejecuta el flujo de la aplicación.
     * Solicita dos números al usuario, realiza operaciones matemáticas y muestra los resultados.
     */
    public void ejecutar() {
        // Solicitar números al usuario
        double numeroUno = objVista.mLeerNumero("Ingrese el primer número: ");
        double numeroDos = objVista.mLeerNumero("Ingrese el segundo número: ");

        // Crear un objeto de la clase Operaciones
        objOperaciones = new Operaciones();

        // Realizar operaciones y mostrar resultados
        objVista.mMostrarResultado("La suma es: ", objOperaciones.mSuma(numeroUno, numeroDos));
        objVista.mMostrarResultado("La resta es: ", objOperaciones.mRestar(numeroUno, numeroDos));
        objVista.mMostrarResultado("La multiplicación es: ", objOperaciones.mMultiplicar(numeroUno, numeroDos));

        // Cerrar el scanner para liberar recursos
        objVista.mCerrarScanner();
    }
}
