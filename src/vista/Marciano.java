package vista;

import controlador.Controlador;
import processing.core.PApplet;

public class Marciano extends Personaje implements Runnable {

	public static final int TIEMPO_BASE = 50;
	public static final int ANCHO = 750;

	private int tiempo;
	private boolean visible;

	private Controlador controlador;

	public Marciano(PApplet app, float x, float y, int i, Controlador controlador) {
		super(app);
		xpos = x;
		ypos = y;
		initialX = x;
		initialY = y;
		rad = 40;
		id = i;
		visible = true;
		tiempo = 0;
		this.controlador = controlador;
	}

	public void evaluate() {
		if (controlador.getBalaDisparada()) {
			double distancia = Math.hypot(xpos - controlador.getBalPosx(), ypos - controlador.getBalPosy());
			if (distancia < 80) {
				controlador.removerMarciano(id);
				visible = false;
			}
		}

	}

	public void mover() {
		if (controlador.isNotOver()) {
			if (id == 0) {
				controlador.setTiempoMax();
			}
			tiempo++;
			if (tiempo == TIEMPO_BASE) {
				xpos += controlador.getMoverx();
				ypos += controlador.getMovery();
				tiempo = 0;
			}
			if (id == 27 && ypos == Controlador.POSICION_MAXIMA_Y) {
				try {
					controlador.perder();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			evaluate();
		} else {
			visible = true;
			xpos = initialX;
			ypos = initialY;
			tiempo = 0;
		}

	}

	@Override
	public void render() {
		mover();
		sketch.fill(0, 100, 0);
		if (visible) {
			sketch.circle(xpos, ypos, rad);
		} else {
			sketch.circle(xpos, ypos, 0);
		}
	}

	@Override
	public void run() {
		render();
	}

} // PERSONAJE