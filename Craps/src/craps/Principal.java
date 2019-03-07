
package craps;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*VistaConsola consola = new VistaConsola();
		consola.iniciarJuego(); */
		
		GUICraps myWindow = new GUICraps();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

