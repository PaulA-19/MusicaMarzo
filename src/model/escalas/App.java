package model.escalas;

import javax.swing.JOptionPane;

import org.jfugue.player.Player;

import datos.Comun;

public class App implements Comun {

	private static Player p = new Player();

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "Listos?");

		for (int j = 1; j <= 8; j++) {

			for (String string : notas) {

				System.out.print(string + String.valueOf(j) + "/.3\n");
				p.play(string + String.valueOf(j) + "/.3");
			}
			System.out.println("\n");
		}
	}

}
