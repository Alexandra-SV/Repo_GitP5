
package Ejs;

/**
 * <p>Ejercicio de Documentación<br>
 * Versión documentada<br>
 * <strong>Circulos</strong>: Define circulos con coordenada X, Y y el radio.</p>
 * 
 * @author AlexandraSV
 * @version 07-05-2023
 */

public class Circulos {
    
    //Atributos
    /**
     * Coordenada X.
     */
    private double centroX;
    /**
     * Coordenada Y.
     */
    private double centroY;
    /**
     * Radio.
     */
    private double radio;
    
    /**
     * Constructor.
     * @param x centro: coordenada X.
     * @param y centro: coordenada Y.
     * @param r radio.
     */
    public Circulos(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
    
    /**
     * Getter.
     * @return centro: coordenada X. 
     */
    public double getCentroX() {
        return centroX;
    }
    
    /**
     * Calcula el perimetro del circulo.
     * @return perimetro.
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Desplaza el circulo en el eje.
     * @param despX movimiento en el eje X.
     * @param despY movimiento en el eje Y.
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
    
}//Fin de clase
