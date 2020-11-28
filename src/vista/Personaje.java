package vista;

import processing.core.PApplet;

public class Personaje {
	PApplet sketch;

	int id;
	float xpos;
	float ypos;
	float initialX;
	float initialY;
	int rad;

	public Personaje(PApplet app) {

		sketch = app;
	} // CONSTRUCTOR

	public int getId() {
		return id;
	}

	public int getRad() {
		return rad;
	}

	public PApplet getSketch() {
		return sketch;
	}

	public float getXpos() {
		return xpos;
	}

	public float getYpos() {
		return ypos;
	}

	public void render() {

	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public void setSketch(PApplet sketch) {
		this.sketch = sketch;
	}

	public void setXpos(float xpos) {
		this.xpos = xpos;
	}

	public void setYpos(float ypos) {
		this.ypos = ypos;
	}

} // CLASE