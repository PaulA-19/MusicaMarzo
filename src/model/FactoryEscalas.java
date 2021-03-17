package model;

import datos.Comun;
import datos.InterEscalas;

public class FactoryEscalas implements Comun {

	private static FactoryEscalas objeto;

	/*
	 * Constructor de la clase, solo se llamara una vez
	 */
	private FactoryEscalas() {
	}

	/**
	 * OByenemos la instancia para generar las escalas
	 * 
	 * @return Devuelve el objeto (Fabrica)
	 */
	public static FactoryEscalas getInstancia() {
		if (objeto == null) {
			objeto = new FactoryEscalas();
		}

		return objeto;

	}

	/**
	 * Devuelve la escala
	 * 
	 * @param tipo es el tipo de escala
	 * @return devuelve la escala
	 */
	public InterEscalas fabricarEscala(String tipo) {
		return null;
	}

}
