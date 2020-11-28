package controlador;

import modelo.Logic;
import processing.core.PApplet;

public class Controlador {

	private PApplet app;
	private Logic logic;
	private boolean direccion = true;
	private boolean primero = true;
	private int moverx = 20;
	private int tiempo_max = 0;
	private int movery = 0;
	
	public Controlador (PApplet app) {
		
		this.app = app;
		logic = new Logic(app);

	} // CONTRUCTOR
	
	public boolean getDireccion() {
		return this.direccion;
	}

	public int getMoverx() {
		return moverx;
	}

	public int getMovery() {
		return movery;
	}

	public int getTiempoMax() {
		return tiempo_max;
	}

	public void moverNaveDerecha() {

	}

	public void moverNaveIzquiera() {

	}

	public void render() {

	} //

	public void setDireccion() {
		direccion = !direccion;
	}

	public void setMoverx(int moverx) {
		this.moverx = moverx;
	}

	public void setMovery(int movery) {
		this.movery = movery;
	}

	public void setTiempoMax() {
		tiempo_max++;
		if (tiempo_max == 250) {
			movery = 30;
			moverx = 0;
			tiempo_max = 0;
		}
		if (tiempo_max == 1) {
			if (primero) {
				primero = !primero;
			} else {
				movery = 0;
				if (direccion) {
					moverx = -20;
					direccion = !direccion;
				} else {
					moverx = 20;
					direccion = !direccion;
				}
			}
		}
	}
	
} //CLASE
