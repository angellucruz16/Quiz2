package vista;

import processing.core.PApplet;
import controlador.Controlador;

public class VistaQuiz2 extends PApplet{

	Controlador controlador;
	Nave nave;
	Bala bala;
	Marciano[]marcianos;
	//Marciano marciano;
	public void settings() {

		size(800,500);
	
		
				
	} //SETTINGS

	public void setup() {

		controlador = new Controlador(this);
		
		nave = new Nave (this);
		
		bala = null;
		marcianos = new Marciano [24];
		for (int i = 0; i < 24; i++) {
			marcianos[i] = new Marciano(this, 500, 100);
		}
		
		
		noStroke ();
		
		rectMode(CENTER); 

	} //SETUP

	public void draw() {
		
		background(255);
		nave.render();
		marciano.render();
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
			
			if (bala != null) {
				if (bala.terminoRecorridoBala ) {
					
					bala = new Bala(this, nave.xpos, nave.ypos);
				}
			} else {
				
			
				
			bala = new Bala(this, nave.xpos, nave.ypos);
		//	controlador.disparar();
				
			}
		}
		
	} //KEYPRESSED

} //CLASE
