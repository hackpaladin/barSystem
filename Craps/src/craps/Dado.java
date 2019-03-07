
package craps;

/**
 * Juego Craps 
 * Programación Interactiva
 * Escuela de Ingeniería de Sistemas y Computación 
 * Universidad del Valle
 * 
 * @author paolajr-EISC
 *
 */
import java.util.Random;

public class Dado {
    private int cara;
    
	/**
	 * @return retorna el valor aleatorio de la cara visible del dado
	 */
	public int getCara() {
		Random aleatorio= new Random();
	    cara = aleatorio.nextInt(6)+1;	    		;
		return cara;
	}
 
}