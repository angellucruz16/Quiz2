package vista;

import processing.core.PApplet;

public class Nave extends Personaje{

	public Nave(PApplet app) {
		super(app);
		
		xpos = 500;
		ypos = 400;
		rad = 20;
	}
	
	public void render () {
		
		
			sketch.fill (0);
			sketch.rect(xpos, ypos, rad, rad);
		
	} //RENDER
	
	public void moverDerechaNave ( ) {
		
			if (xpos + 10 <= sketch.width - rad /2 ) {
				xpos += 10;
				
			}
		
	} //MOVERDER
	
	public void moverIzquierdaNave () {
		
		if (xpos - 10 >=  rad /2 ) {
			xpos -= 10;
			
		}
	} //MOVERIZQ
	
	
} //CLASE
