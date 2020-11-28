package vista;

import processing.core.PApplet;
import controlador.Controlador;

public class VistaQuiz2 extends PApplet{

	Controlador controlador;
	Nave nave;
	Bala bala;

	public void settings() {

		size(1000,500);
	
		
				
	} //SETTINGS

	public void setup() {

		controlador = new Controlador(this);
		
		nave = new Nave (this);
		
		bala = null;
		
		noStroke ();
		
		rectMode(CENTER); 

	} //SETUP

	public void draw() {
		
		background(255);
		nave.render();
		
		if  (bala != null) {
			
			bala.render();
		}
		

	} //DRAE
	
	
	public static void main(String[] args) {

		String[] processingArgs = {"VistaQuiz2"};
		VistaQuiz2 mySketch = new VistaQuiz2();
		PApplet.runSketch(processingArgs, mySketch);

	} //MAIN

	public void keyPressed () {

		if (key == CODED) {

			if (keyCode == RIGHT) {
				
				controlador.moverNaveDerecha();
				nave.moverDerechaNave();
				

			} if (keyCode == LEFT) {	
				
				controlador.moverNaveIzquiera();
				nave.moverIzquierdaNave();
			} 
		} //CODED
		
		if (key == ' ') {
			
			bala = new Bala(this, nave.xpos, nave.ypos);
			controlador.disparar();
			
		}
		
	} //KEYPRESSED

} //CLASE
