
package vista;

import controlador.Controlador;
import processing.core.PApplet;

public class VistaQuiz2 extends PApplet {

	public static void main(String[] args) {

		String[] processingArgs = { "VistaQuiz2" };
		VistaQuiz2 mySketch = new VistaQuiz2();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN

	Controlador controlador;
	Nave nave;
	Bala bala;
	Marciano[] marcianos;
	Marciano marciano;

	@Override
	public void draw() {

		background(255);
		nave.render();
		// marciano.render();
		if (bala != null) {
			bala.render();
		}
		for (Marciano marciano : marcianos) {
			marciano.render();
		}

	} // DRAE

	@Override
	public void keyPressed() {

		if (key == CODED) {

			if (keyCode == RIGHT) {

				controlador.moverNaveDerecha();
				nave.moverDerechaNave();

			}
			if (keyCode == LEFT) {

				controlador.moverNaveIzquiera();
				nave.moverIzquierdaNave();
			}
		} // CODED

		if (key == ' ') {

			if (bala != null) {
				if (bala.terminoRecorridoBala) {

					bala = new Bala(this, nave.xpos, nave.ypos);
				}
			} else {

				bala = new Bala(this, nave.xpos, nave.ypos);
				// controlador.disparar();

			}
		}

	} // KEYPRESSED

	@Override
	public void settings() {

		size(800, 500);

	} // SETTINGS

	@Override
	public void setup() {
		controlador = new Controlador(this);
		nave = new Nave(this);
		bala = null;
		marcianos = new Marciano[42];
		int initX = 50;
		int initY = 50;
		for (int i = 0; i < 42; i++) {
			marcianos[i] = new Marciano(this, initX, initY, i, controlador);
			if (initX < 700) {
				initX += 50;
			} else {
				initX = 50;
				initY += 50;
			}
		}
		for (Marciano marciano : marcianos) {
			marciano.run();
		}
		noStroke();
		rectMode(CENTER);
	} // SETUP

} // CLASE

