package vista;

import processing.core.PApplet;

public class Bala extends Personaje {

	boolean terminoRecorridoBala ; //Variable para que la bala de todo el recorrido antes de poder
									// volver a disparar
	
	public Bala(PApplet app, float x , float y) {
		super(app);
		
		xpos = x;
		ypos = y;
		rad = 5;
		
		
		terminoRecorridoBala = false;
		
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
			
		} else {
			
			terminoRecorridoBala = true;
		}
		
	}//MOVERSE
	
	public boolean isTerminoRecorridoBala() {
		return terminoRecorridoBala;
	}
	
	public void setTerminoRecorridoBala(boolean terminoRecorridoBala) {
		this.terminoRecorridoBala = terminoRecorridoBala;
	}
	
} //CLASE
