package BajarSubirNotas.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BajarSubirNotas.model.ModelBajarSubirNotas;
import model.modeloPrincipal;

public class ControllerBajarSubirNotas {

	ModelBajarSubirNotas m;
	JFrame vista;

	public ControllerBajarSubirNotas(ModelBajarSubirNotas m) {
		this.m = m;
	}

	public void setVista(JFrame vista) {
		this.vista = vista;
	}

}
