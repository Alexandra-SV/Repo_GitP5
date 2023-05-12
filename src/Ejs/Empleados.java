
package Ejs;

/**
 * <p>Ejercicio de Documentación<br>
 * Versión documentada<br>
 * <strong>Empleados</strong>: Define empleados con nombre, apellido, edad y salario.</p>
 * 
 * @author AlexandraSV
 * @version 07-05-2023
 */

public class Empleados {
    
    //Atributos
    /**
     * Nombre del empleado.
     */
    private String nombre;
    /**
     * Apellido del empleado.
     */
    private String apellido;
    /**
     * Edad del empleado.
     */
    private int edad;
    /**
     * Salario del empleado.
     */
    private double salario;
    
    /**
     * Comprueba que se pueda aumentar el salario acorde a la edad(>40) y la validez del nombre.
     * @param sueldoPlus sueldo a&ntilde;adido
     * @return boolean aumento.
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    
    /**
     * Comprueba que el nombre sea valido.
     * @return boolean.
     */
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
    
    /**
     * Constructor sin parametros.
     */
    public Empleados() {
        this("", "", 0, 0);
    }
    
    /**
     * Constructor.
     * @param nombre nombre del empleado.
     * @param apellido apellido del empleado.
     * @param edad edad del empleado.
     * @param salario salario del empleado.
     */
    public Empleados(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    
}//Fin de clase
