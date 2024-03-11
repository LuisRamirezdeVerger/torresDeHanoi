package juego;


public class Discos {
	private int valor;
	
	public Discos (int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public String toString() {
		return "El valor es : " + valor;
	}
}
