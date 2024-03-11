package juego;

public class Hanoi {
	private int nDiscos;
	private Torre torreA = new Torre();
	private Torre torreB = new Torre();
	private Torre torreC = new Torre();

	
	public Hanoi (int nDiscos, Torre torreA, Torre torreB, Torre torreC) {
		this.nDiscos = nDiscos;
		this.torreA = torreA;
		this.torreB = torreB;
		this.torreC = torreC;
	}
	
	public void agregarDisco(int discoValor) {
		
		
	}
}