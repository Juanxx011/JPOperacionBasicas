package model; // Paquete donde se encuentra la clase

/**
 * La clase Operaciones representa un modelo matemático que permite realizar
 * operaciones básicas como suma, resta y multiplicación con dos números.
 * Forma parte del modelo en la arquitectura MVC.
 *
 * @author Alonso Guevara Pérez
 * @version 1.0
 * @since 2025-03-28
 * @license MIT
 */
public class Operaciones {

    /**
     * Primer número para realizar las operaciones matemáticas.
     */
    private double numeroUno;

    /**
     * Segundo número para realizar las operaciones matemáticas.
     */
    private double numeroDos;

    /**
     * Constructor por defecto de la clase Operaciones.
     * Inicializa los atributos en cero.
     */
    public Operaciones() {
        this.numeroUno = 0;
        this.numeroDos = 0;
    }

    /**
     * Constructor sobrecargado que inicializa los valores de los atributos.
     *
     * @param numeroUno Primer número de la operación.
     * @param numeroDos Segundo número de la operación.
     */
    public Operaciones(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    // ================= GETTERS Y SETTERS =================

    /**
     * Obtiene el valor del primer número.
     *
     * @return Valor de numeroUno.
     */
    public double getNumeroUno() {
        return numeroUno;
    }

    /**
     * Establece el valor del primer número.
     *
     * @param numeroUno Nuevo valor para numeroUno.
     */
    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    /**
     * Obtiene el valor del segundo número.
     *
     * @return Valor de numeroDos.
     */
    public double getNumeroDos() {
        return numeroDos;
    }

    /**
     * Establece el valor del segundo número.
     *
     * @param numeroDos Nuevo valor para numeroDos.
     */
    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    // ================= MÉTODOS DE OPERACIONES =================

    /**
     * Realiza la suma de dos números.
     *
     * @param numeroUno Primer número a sumar.
     * @param numeroDos Segundo número a sumar.
     * @return Resultado de la suma.
     */
    public double mSuma(double numeroUno, double numeroDos) {
        return numeroUno + numeroDos;
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param numeroUno Minuendo de la operación.
     * @param numeroDos Sustraendo de la operación.
     * @return Resultado de la resta.
     */
    public double mRestar(double numeroUno, double numeroDos) {
        return numeroUno - numeroDos;
    }

    /**
     * Realiza la multiplicación de dos números.
     *
     * @param numeroUno Primer número a multiplicar.
     * @param numeroDos Segundo número a multiplicar.
     * @return Resultado de la multiplicación.
     */
    public double mMultiplicar(double numeroUno, double numeroDos) {
        return numeroUno * numeroDos;
    }
}
