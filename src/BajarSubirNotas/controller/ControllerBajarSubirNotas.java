package BajarSubirNotas.controller;

import BajarSubirNotas.model.ModelBajarSubirNotas;
import BajarSubirNotas.vista.VistaBajarSubirNotas;

public class ControllerBajarSubirNotas {

	private String error = "Error en las notas: ";
	private String errorNotas;
	ModelBajarSubirNotas m;
	VistaBajarSubirNotas vista;

	public ControllerBajarSubirNotas(ModelBajarSubirNotas m) {
		this.m = m;
	}

	public void setVista(VistaBajarSubirNotas vista) {
		this.vista = vista;
	}

	public void masOpciones() {

	}

	public void imprimir() {

	}

	public void validarInputNotas() {

		errorNotas = "";

		try {
			if (m.validarNotas(vista.textEntrada.getText())) {
				System.out.println("Si - CONTROLLER");

			} else {
				System.out.println("NO - CONTROLLER");
				vista.lblErrores.setText(error);

				for (String s : m.notasMalas) {
					errorNotas += s + " - ";
				}

				try {
					errorNotas = errorNotas.substring(0, errorNotas.length() - 3);

					vista.lblNotaserrores.setText(errorNotas);

				} catch (Exception e) {

					vista.lblErrores.setText("");
					vista.lblNotaserrores.setText("No se encontraron notas, revise el ingreso");
				}

			}

			System.out.println("-------###------------");
			for (String s : m.notasMalas) {
				System.out.println(s);
			}
			System.out.println("-------###------------");

		} catch (Exception e) {
			vista.limpiarError();
			vista.lblNotaserrores
					.setText(" try Error al procesar su entrada. Por favor verifique que todo esta correcto");
		}

	}

	public void autollenarFormaCorrecta() {

		vista.textEntrada.setText("Nuevos datos");
		
	}

}
