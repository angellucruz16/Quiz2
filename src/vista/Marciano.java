package vista;

import processing.core.PApplet;

public class Marciano extends Personaje{

	public Marciano(PApplet app, float x, float y) {
		super(app);
		xpos=x;
		ypos=y;
		rad=40;
		// TODO Auto-generated constructor stub
	}
	
	public void render() {
		sketch.fill(0,100,0);
		sketch.circle(xpos, ypos, rad);
		
	} //RENDER

} //PERSONAJE
