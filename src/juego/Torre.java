package juego;
import java.util.*;

public class Torre {
	
	private ArrayList<Discos> Fichas;
	
	public Torre () {
		Fichas = new ArrayList <Discos>();
	}
	
	public int cima() {
		int ultimaPosicion = Fichas.size() -1;
		Discos c = Fichas.get(ultimaPosicion);
		return c.getValor();
	}

}