package controlador;

import java.util.ArrayList;

import modelo.Logic;
import processing.core.PApplet;
import vista.Marciano;

public class Controlador {

	public static double POSICION_MAXIMA_Y = 340.0;
	private PApplet app;

	private Logic logic;

	private int puntaje;

	private boolean direccion = true;

	private boolean primero = true;

	private int moverx = 20;

	private int tiempo_max = 0;

	private int movery = 0;

	private boolean notOver = true;

	private float balPosx = 0;
	private float balPosy = 0;

	private boolean balaDisparada = false;

	private ArrayList<Marciano> marcianos;

	public Controlador(PApplet app) {

		// TODO Auto-generated constructor stub
		this.app = app;
		logic = new Logic(app);
		marcianos = new ArrayList<Marciano>();
		int initX = 50;
		int initY = 50;
		for (int i = 0; i < 42; i++) {
			marcianos.add(new Marciano(app, initX, initY, i, this));
			if (initX < 700) {
				initX += 50;
			} else {
				initX = 50;
				initY += 50;
			}
			
		} //CONSTRUCTOR
		
		for (Marciano marciano : marcianos) {
			marciano.run();
		}

	} // CONTRUCTOR

	public boolean getBalaDisparada() {
		return balaDisparada;
	} // GET BALA DISPARADA

	public float getBalPosx() {
		return balPosx;
	} //GET BAL POS x

	public float getBalPosy() {
		return balPosy;
	} // GET BAL POS Y

	public boolean getDireccion() {
		return this.direccion;
	} // GET DIRECCION

	public ArrayList<Marciano> getMarcianos() {
		return marcianos;
	} //ARRAY MARCIANO

	public int getMoverx() {
		return moverx;
	} // GET MOVER X

	public int getMovery() {
		return movery;
	} // GET MOVERY

	public int getPuntaje() {
		return puntaje;
	} // PUNTAJE

	public int getTiempoMax() {
		return tiempo_max;
	} // GET TIEMPO MAX

	public boolean isNotOver() {
		return notOver;
	} // IS NOT OVER

	public void moverNaveDerecha() {

	} // MOVER NAVE DER

	public void moverNaveIzquiera() {

	} // MOVER NAVE IZQ

	public void perder() throws Exception {
		if (notOver) {
			this.notOver = false;
			Exception juegoPerdido = new Exception("JUEGO PERDIDO");
			throw juegoPerdido;
		}
	} // EXCEPTION 

	public void reiniciar() {
		
		notOver = true;
		puntaje = 0;
		moverx = 20;
		movery = 0;
		primero = true;
		direccion = true;
		balPosx = 0;
		balPosy = 0;
		balaDisparada = false;
		
	} // REINICIAR
 
	public void removerMarciano(int id) {
		balaDisparada = false;
		puntaje++;
		
	} // REMOVER MARCIANO

	public void render() {

	} // RENDER

	public void setBalaDisparada(boolean disp) {
		balaDisparada = disp;
	} //SET BALA DIS

	public void setBalPosx(float balPosx) {
		this.balPosx = balPosx;
	} // SET BAL POS X

	public void setBalPosy(float balPosy) {
		this.balPosy = balPosy;
	} //SET VAL POS Y 

	public void setDireccion() {
		direccion = !direccion;
	} // SET DIRECCION

	public void setMoverx(int moverx) {
		this.moverx = moverx;
	} //SET MOVER X

	public void setMovery(int movery) {
		this.movery = movery;
	} //SER MOVER Y

	public void setNotOver(boolean notOver) {
		this.notOver = notOver;
	} //SET  NOT OVER

	public void setPosicionBala(float posx, float posy) {
		balPosx = posx;
		balPosy = posy;
		
	} //SET POS BALA

	public void setTiempoMax() {
		
		tiempo_max++;
		if (notOver) {
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
		} else {
			moverx = 0;
			movery = 0;
		}

	} //SET TIEMPO MAX

} // CLASE