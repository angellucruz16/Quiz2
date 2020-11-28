package vista;

import processing.core.PApplet;

public class Bala extends Personaje {

	public Bala(PApplet app, float x , float y) {
		super(app);
		
		xpos = x;
		ypos = y;
		rad = 5;
		
		
		// TODO Auto-generated constructor stub
	}
	public void render () {
		
		sketch.fill(0);
		sketch.rect(xpos, ypos , rad, rad);
		
		moverse ();
		
	} //RENDER
	
	public void moverse  (){
		
		
		if (ypos -10 >= -10 ) {
			
			ypos -= 10;
		}
		
	}//MOVERSE
	
} //CLASE
