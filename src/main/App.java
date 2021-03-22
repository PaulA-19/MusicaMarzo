package main;

import java.util.Scanner;

import BajarSubirNotas.model.ModelBajarSubirNotas;

public class App {

//	public static void main(String[] args) {
//		VistaInicio inicio = new VistaInicio(new ControllerPrincipal(new modeloPrincipal()));
//		inicio.setVisible(true);
//	}

	public static void main(String[] args) {
		ModelBajarSubirNotas m = new ModelBajarSubirNotas();

		Scanner s = new java.util.Scanner(System.in);
		String linea;

		System.out.print("Si o no:");
		while (s.nextLine().equalsIgnoreCase("S")) {

			linea = s.nextLine();
			System.out.println("-----(" + linea + ")-------");
			try {
				m.validarNotas(linea);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Si o no:");

		}

		System.out.println("-----------------##--------------");
		for (String string : m.notasBuenas) {
			System.out.println(string);
		}
		System.out.println("-----------------##--------------");
		for (String string : m.notasMalas) {
			System.out.println(string);
		}
		System.out.println("-----------------##--------------");
		for (String string : m.listaNotas) {
			System.out.println(string);
		}

	}
}
