package vista;

import processing.core.PApplet;

public class Personaje {
	PApplet sketch;

	float xpos; 
	float ypos;
	int rad;
	
	public PApplet getSketch() {
		return sketch;
	}


	public void setSketch(PApplet sketch) {
		this.sketch = sketch;
	}


	public float getXpos() {
		return xpos;
	}


	public void setXpos(float xpos) {
		this.xpos = xpos;
	}


	public float getYpos() {
		return ypos;
	}


	public void setYpos(float ypos) {
		this.ypos = ypos;
	}


	public int getRad() {
		return rad;
	}


	public void setRad(int rad) {
		this.rad = rad;
	}

	
	public Personaje(PApplet app) {
		
		sketch = app;
	} //CONSTRUCTOR
	
	
	public void render () {
		
	}
	
} //CLASE
