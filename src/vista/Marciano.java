package vista;

import controlador.Controlador;
import processing.core.PApplet;

public class Marciano extends Personaje implements Runnable {

	public static final int TIEMPO_BASE = 50;
	public static final int ANCHO = 750;
	private boolean direccion = true;

	private int tiempo;

	private Controlador controlador;

	public Marciano(PApplet app, float x, float y, int i, Controlador controlador) {
		super(app);
		xpos = x;
		ypos = y;
		rad = 40;
		id = i;
		tiempo = 0;
		this.controlador = controlador;
	}

	public void mover() {
		if (id == 0) {
			controlador.setTiempoMax();
		}
		// System.out.println(controlador.getTiempoMax());
		tiempo++;
		if (tiempo == TIEMPO_BASE) {
			xpos += controlador.getMoverx();
			ypos += controlador.getMovery();
			tiempo = 0;
		}
	}

	@Override
	public void render() {
		mover();
		sketch.fill(0, 100, 0);
		sketch.circle(xpos, ypos, rad);
	}

	@Override
	public void run() {
		render();
	}

} // PERSONAJE

