package BajarSubirNotas.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BajarSubirNotas.model.ModelBajarSubirNotas;
import BajarSubirNotas.vista.VistaBajarSubirNotas;
import model.modeloPrincipal;

public class ControllerBajarSubirNotas {

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

		try {
			if (m.validarNotas(vista.textEntrada.getText())) {
				System.out.println("Si - CONTROLLER");

			} else {
				System.out.println("NO - CONTROLELR");
				String error = "Errores al procesar las siguientes notas: (";
				for (String s : m.notasMalas) {
					error += s + " - ";
				}

				error = error.substring(0, error.length() - 2);
				error += ")";

				vista.lblErrores.setText(error);

				vista.lblErrores.setVisible(true);
			}
		} catch (Exception e) {
			vista.lblErrores.setText("Error al procesar su entrada\nPor favor verifique que todo esta correcto");
			vista.lblErrores.setVisible(true);
		}

	}

}
