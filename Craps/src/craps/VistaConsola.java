package craps;

import java.util.Scanner;

/**
 * Juego Craps 
 * Programación Interactiva
 * Escuela de Ingeniería de Sistemas y Computación 
 * Universidad del Valle
 * Vista por línea de comandos
 * @author paolajr-EISC
 *
 */
public class VistaConsola {
	/**
	private String pregunta;
	private ControlCraps craps;
	Scanner entradaEscaner;
	
	public VistaConsola(){
		craps = new ControlCraps();
		entradaEscaner = new Scanner (System.in);
	}
	
	public void iniciarJuego(){
		System.out.println ("Desea lanzar los dados? y/n:");
		pregunta=entradaEscaner.nextLine ();
		
		if(pregunta.equals("y")){
			craps.calcularTiro();
			System.out.printf("Dado 1 = %d Dado 2 = %d Tiro de Salida = %d \n",craps.getCaraDado1(),craps.getCaraDado2(),craps.getTiro());
			craps.determinarJuego();
			
			switch (craps.getEstado()){
			
			case 1: System.out.println("Natural has Ganado!!");
			        break;
			        
			case 2: System.out.println("Craps has perdido :(");
			        break;
			        
			case 3: System.out.printf("Estableciste Punto = %d , debes lazanzar nuevamente!! \n",craps.getPunto());
					while(craps.getEstado()==3){
						System.out.println("Deseas lanzar? y/n");
						pregunta=entradaEscaner.nextLine();
						if(pregunta.equals("y")){
							craps.calcularTiro();
							System.out.printf("Dado 1 = %d Dado 2 = %d Tiro = %d \n",craps.getCaraDado1(),craps.getCaraDado2(),craps.getTiro());
							craps.determinarJuego();
						}
						else{
							System.out.println("Perdiste, por abandonar el juego :(");
							craps.setAbandono();
						}
					}
					if(craps.getEstado()==1){
						System.out.println("Lograste nuevamente el punto, Ganaste :)");
					}
					else{
						System.out.println("Ooops, Perdiste :(");
					}
					break;
			}
			seguirJuego();
		}
		else{
			System.out.println("Ok, Bye :(");
		}
	}

	public void seguirJuego(){
		System.out.println("Quieres Volver a Jugar? y/n");
		pregunta=entradaEscaner.nextLine();
		if(pregunta.equals("y")){
			iniciarJuego();
		}
		else{
			System.out.println("Bye!!");
		}
	}*/
}
