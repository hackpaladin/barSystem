
package craps;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUICraps extends JFrame{
	
	private JLabel dado1, dado2;
	private JButton lanzar;
	
	private ImageIcon imagen;
	
	private ControlCraps control;
	
	public GUICraps(){
		super("Juego de Craps"); //invoca el constructor de JFrame
		
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
			
		//crea la imagen, la agrega al componente y se adiciona a la ventana
		imagen = new ImageIcon("src/imagenes/dado.png");
		dado1 = new JLabel(imagen);
		dado2 = new JLabel(imagen);
		contenedor.add(dado1);
		contenedor.add(dado2);
		
		//Objeto que va a estar atento al evento click del bot�n
		EscuchaEventosAccion miEscucha = new EscuchaEventosAccion();
		
		//crea el botOn y lo agrega a la ventana
		lanzar = new JButton("Lanzar");
		lanzar.addActionListener(miEscucha); //se enlaza el escucha al bot�n
		contenedor.add(lanzar);
		
		control = new ControlCraps();
		
		setSize(500, 400); //establece dimensiones de la ventana
		setResizable(false); //Evita el redimensionamiento de la ventana
		setVisible(true);	//Hace visible la ventana
		setLocationRelativeTo(null); //Centra la ventana
	}
	
    /* Una clase interna o anidada (inner or nested class) 
	   puede acceder directamente a los miembros de la
	   clase que la contiene.
    */
	   private class EscuchaEventosAccion implements ActionListener {
				
		@Override
		public void actionPerformed(ActionEvent evento) {
			// TODO Auto-generated method stub
			
			if (evento.getSource() == lanzar) {
				
				visualizarCaras(); //Permite ver el tiro 
		
				control.determinarJuego();
				Icon icon;
			    
				String tiro = "El tiro fue " + String.valueOf(control.getTiro()) + "\n";
				
				switch (control.getEstado()){
				
					case 1: icon = new ImageIcon("src/imagenes/ganaste.png" );
						    JOptionPane.showMessageDialog(lanzar,tiro + "Has ganado","Resultado",JOptionPane.DEFAULT_OPTION,icon);
					        break;
					case 2: icon = new ImageIcon("src/imagenes/perdiste.png" );
							JOptionPane.showMessageDialog(lanzar,tiro + "Has Perdido", "Resultado", JOptionPane.DEFAULT_OPTION, icon);
			                break;
					case 3: String punto = "Has establecido punto en " + String.valueOf(control.getPunto()) + "\n";
					        punto+="Recuerda que ganas si vuelvas a sacar " + String.valueOf(control.getPunto()) + " pero pierdes si sacas 7"+"\n"; 
							icon = new ImageIcon("src/imagenes/punto.png" );
							JOptionPane.showMessageDialog(lanzar,tiro + punto + "Conc�ntrate y sigue lanzado", "Resultado", JOptionPane.DEFAULT_OPTION, icon);
	                        break;			
				}					
			}		
		}
		
	   } //fin clase EscuchaEventosAccion
	
	   /* M�todo que muestra graficamente valor del Tiro
	   */
	   
	   public void visualizarCaras(){
			
		    control.calcularTiro();
		    String cara = String.valueOf(control.getCaraDado1());
		    imagen = new ImageIcon("src/imagenes/"+cara+".png");
			dado1.setIcon(imagen);
			
			cara=String.valueOf(control.getCaraDado2());
			imagen = new ImageIcon("src/imagenes/"+cara+".png");
			dado2.setIcon(imagen);
		  
		} 
	   
}//Fin Clase GUICraps