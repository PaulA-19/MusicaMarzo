package datos;

import java.awt.Color;

import org.jfugue.player.Player;

public interface Comun {
	// MUsica
	Player p = new Player();
	String[] notas = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
	String essMayor = "EscalaMayor";

	// Colores
	Color c1 = new Color(66, 72, 116);
	Color c2 = new Color(166, 177, 225);
	Color c3 = new Color(220, 214, 247);
	Color c4 = new Color(244, 238, 255);

	// Notas - vaidar
	String regex = "^[C|D|E|F|G|A|B|c|d|e|f|g|a|b]([1-8]?[#|b]?|[#|b]?[1-8]?)$";

}
