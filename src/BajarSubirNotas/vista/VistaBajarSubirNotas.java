package BajarSubirNotas.vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BajarSubirNotas.controller.ControllerBajarSubirNotas;

public class VistaBajarSubirNotas extends JFrame {

	private JPanel contentPane;
	VistaBajarSubirNotas actual;
	ControllerBajarSubirNotas c;

	/**
	 * Create the frame.
	 */
	public VistaBajarSubirNotas(ControllerBajarSubirNotas c) {
		this.c = c;
		actual = this;
		c.setVista(actual);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 594, 435);
		setSize(594, 435);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelNorte = new JPanel();
		contentPane.add(panelNorte, BorderLayout.NORTH);

		JLabel lblSubirOBajar = new JLabel("Subir o Bajar tonos a la Canción");
		panelNorte.add(lblSubirOBajar);

		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(Color.GRAY);
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panelCentro.add(panel, BorderLayout.NORTH);

		JLabel lblIngreseLasNotas = new JLabel("Ingrese las notas");
		panel.add(lblIngreseLasNotas);
	}
}
