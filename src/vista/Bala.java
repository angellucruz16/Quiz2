package vista;

import controlador.Controlador;
import processing.core.PApplet;

public class Bala extends Personaje {

	boolean terminoRecorridoBala; // Variable para que la bala de todo el recorrido antes de poder
	// volver a disparar

	private Controlador controlador;

	public Bala(PApplet app, float x, float y, Controlador controlador) {
		super(app);
		xpos = x;
		ypos = y;
		rad = 10;
		terminoRecorridoBala = false;
		this.controlador = controlador;

		// TODO Auto-generated constructor stub
	}

	public boolean isTerminoRecorridoBala() {
		return terminoRecorridoBala;
	}

	public void moverse() {
		if (!terminoRecorridoBala) {
			if (ypos - 10 >= -10) {
				ypos -= 10;
				controlador.setPosicionBala(xpos, ypos);

			} else {
				terminoRecorridoBala = true;
				controlador.setBalaDisparada(false);
			}
		}

	}// MOVERSE

	@Override
	public void render() {

		sketch.fill(0);
		sketch.ellipse(xpos, ypos, rad, rad);

		moverse();

	} // RENDER

	public void setTerminoRecorridoBala(boolean terminoRecorridoBala) {
		this.terminoRecorridoBala = terminoRecorridoBala;
	}

} // CLASE