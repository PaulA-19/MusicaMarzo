package main;

import controller.ControllerPrincipal;
import model.modeloPrincipal;
import vista.VistaInicio;

public class App {

	public static void main(String[] args) {
		VistaInicio inicio = new VistaInicio(new ControllerPrincipal(new modeloPrincipal()));
		inicio.setVisible(true);
	}

}
