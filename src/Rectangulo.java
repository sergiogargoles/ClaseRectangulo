import daw.com.Teclado;

public class Rectangulo {

	
	private int ladoLargo;
	private int ladoCorto;
	private Punto centro;
	private int color;
	
	public Rectangulo (int ladoLargo, int ladoCorto, int color, Punto centro) {
		this.ladoLargo = ladoLargo;
		this.ladoCorto = ladoCorto;
		this.centro = centro;
		this.color = color;
	}
	public Rectangulo(){
		this.ladoLargo = 0;
		this.ladoCorto = 0;
		this.centro = new Punto ();
		this.color = 0;
	}
	
	public int getLadoLargo() {
		return ladoLargo;
	}
	public void setLadoLargo(int ladoLargo) {
		this.ladoLargo = ladoLargo;
	}
	public int getLadoCorto() {
		return ladoCorto;
	}
	public void setLadoCorto(int ladoCorto) {
		this.ladoCorto = ladoCorto;
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	public int area () {
		return (int) ladoLargo * ladoCorto;
	}
	
	public void mostrarDatos() {
		centro.mostrarDatos();
		System.out.println("Lados largos: " + ladoLargo);
		System.out.println("Lados cortos: " + ladoCorto);
		System.out.println("Color: " + color);
		
	}
	
	public void cambiarDatos () {
		
		int ladoDeMomento1 = Teclado.leerInt("Indique el lado largo: ");
		int ladoDeMomento2 = Teclado.leerInt("Indique el lado corto: ");
		int colorDeMomento = Teclado.leerInt("Indique el color (int): ");
		int equis = Teclado.leerInt("Indique la x: ");
		int ygriega = Teclado.leerInt("Indique la y: ");
		if (ladoDeMomento1 != 0 || ladoDeMomento2 != 0 || colorDeMomento != 0 || equis != 0 || ygriega != 0) {
			setLadoLargo(ladoDeMomento1);
			setLadoCorto(ladoDeMomento2);
			setColor(colorDeMomento);
			this.centro.setX(equis);
			this.centro.setY(ygriega);
		}
		
		
		
		
	}
	
}
