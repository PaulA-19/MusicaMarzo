package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BajarSubirNotas.controller.ControllerBajarSubirNotas;
import BajarSubirNotas.model.ModelBajarSubirNotas;
import BajarSubirNotas.vista.VistaBajarSubirNotas;
import model.modeloPrincipal;

public class ControllerPrincipal {

	modeloPrincipal m;
	JFrame vista;

	public ControllerPrincipal(modeloPrincipal m) {
		this.m = m;
	}

	public void setVista(JFrame vista) {
		this.vista = vista;
	}

	public void tutorial() {
		JOptionPane.showMessageDialog(vista, "Link para el tutorial");
	}

	public void colaborar() {
		JOptionPane.showMessageDialog(vista, "Link a gitHub");
	}

	public void salir() {

		int op = JOptionPane.showConfirmDialog(vista, "Seguro que quieres salir?", "salir", JOptionPane.YES_NO_OPTION);
		if (op == 0) {
			System.exit(0);
		}

	}

	public void AbrirBajarSubirNotas() {
		(new VistaBajarSubirNotas(new ControllerBajarSubirNotas(new ModelBajarSubirNotas()))).setVisible(true);
		vista.setVisible(false);
	}

}
