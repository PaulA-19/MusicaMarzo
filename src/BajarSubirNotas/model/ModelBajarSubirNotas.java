package BajarSubirNotas.model;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import datos.Comun;

public class ModelBajarSubirNotas {
	public String[] listaNotas;
	public ArrayList<String> notasMalas = new ArrayList<String>();
	public ArrayList<String> notasBuenas = new ArrayList<String>();

	public boolean validarNotas(String string) throws Exception {

		boolean v = true;
		// TODO: handle exception
		listaNotas = string.split(";");
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.println("----------------------");
			System.out.println(listaNotas[i]);
			if (listaNotas[i].equalsIgnoreCase("")) {
				System.out.println("Vacio - false");
				continue;
			}
			if (!isNote(listaNotas[i])) {
				notasMalas.add(listaNotas[i]);
				v = false;
				continue;
			} else {
				notasBuenas.add(listaNotas[i]);
				continue;
			}

		}

		return v;
	}

	public boolean isNote(String s) {

		Pattern pat = Pattern.compile(Comun.regex);
		Matcher mat = pat.matcher(s);
		if (mat.matches()) {
			System.out.println("Si - regex");
			return true;
		} else {
			System.out.println("No - regex");
			return false;
		}
	}

}
