package vista;

import processing.core.PApplet;
import controlador.Controlador;

public class VistaQuiz2 extends PApplet{

	Controlador controlador;



	public void settings() {

		size(1000,500);
	}

	public void setup() {

		controlador = new Controlador(this);



	}

	public void draw() {
		background(255);
		//controlador.pintar();
		

	}
	
	
	public static void main(String[] args) {

		String[] processingArgs = {"VistaQuiz2"};
		VistaQuiz2 mySketch = new VistaQuiz2();
		PApplet.runSketch(processingArgs, mySketch);

	} //MAIN

	public void keyPressed () {

		if (key == CODED) {

			if (keyCode == RIGHT) {
				
				

			} if (keyCode == LEFT) {	
				
				
			} 
		} //CODED
		
		if (key == ' ') {
		
		}
		
	} //KEYPRESSED

} //CLASE
