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

	@Override
	public void draw() {

		background(255);
		nave.render();
		// marciano.render();
		if (bala != null) {
			bala.render();
		}
		for (Marciano marciano : controlador.getMarcianos()) {
			marciano.render();
		}
		this.text("Naves destruidas: " + controlador.getPuntaje(), 20, 20);

		if (!controlador.isNotOver()) {
			this.fill(30, 30, 20);
			this.rect(650, 450, 200, 50);
			this.fill(255);
			this.text("Reiniciar juego", 600, 450);
			if (controlador.getPuntaje() < 99) {
				this.text("JUEGO PERDIDO!", 400, 200);
			} else {
				this.text("GANASTE!", 400, 200);

			}
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
			controlador.setBalaDisparada(true);
			if (bala != null) {
				if (bala.terminoRecorridoBala) {
					bala = new Bala(this, nave.xpos, nave.ypos, controlador);
				}
			} else {
				bala = new Bala(this, nave.xpos, nave.ypos, controlador);
				// controlador.disparar();
			}
		}

	} // KEYPRESSED

	@Override
	public void mouseClicked() {
		if (mouseX > 600 && mouseX < 800 && mouseY > 430 && mouseY < 480) {
			controlador.reiniciar();
		}
	} //MOUSECLICKED

	@Override
	public void settings() {

		size(800, 500);

	} // SETTINGS

	@Override
	public void setup() {
		controlador = new Controlador(this);
		nave = new Nave(this);
		bala = null;
		noStroke();
		rectMode(CENTER);
	} // SETUP

} // CLASE