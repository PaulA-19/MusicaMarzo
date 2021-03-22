package BajarSubirNotas.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import BajarSubirNotas.controller.ControllerBajarSubirNotas;
import datos.Comun;
import java.awt.Scrollbar;

public class VistaBajarSubirNotas extends JFrame implements Comun {

	private JPanel contentPane;
	VistaBajarSubirNotas actual;
	ControllerBajarSubirNotas c;
	public JTextField textEntrada;
	public JTextArea txtrResultado;
	public JLabel lblErrores;

	/**
	 * Create the frame.
	 */
	public VistaBajarSubirNotas(ControllerBajarSubirNotas c) {
		this.c = c;
		actual = this;
		c.setVista(actual);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 594, 435);
		setSize(800, 435);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(c1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelNorte = new JPanel();
		panelNorte.setOpaque(false);
		contentPane.add(panelNorte, BorderLayout.NORTH);

		JLabel lblSubirOBajar = new JLabel("Subir o Bajar tonos a la Canción");
		lblSubirOBajar.setForeground(c3);
		panelNorte.add(lblSubirOBajar);

		JPanel panelCentro = new JPanel();
		panelCentro.setOpaque(false);
		panelCentro.setBackground(Color.GRAY);
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panelCentro.add(panel, BorderLayout.NORTH);

		JLabel lblIngreseLasNotas = new JLabel("Ingrese las notas");
		lblIngreseLasNotas.setForeground(c3);
		panel.add(lblIngreseLasNotas);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panelCentro.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_1.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(6, 0, 0, 10));

		JPanel SubirSemiTono = new JPanel();
		SubirSemiTono.setOpaque(false);
		panel_2.add(SubirSemiTono);
		SubirSemiTono.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono = new JLabel("Sube un SEMITONO a las notas");
		lblSubeUnSemitono.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono.setForeground(c3);
		SubirSemiTono.add(lblSubeUnSemitono);

		JButton btnSubirUnSemi = new JButton("SUBIR UN SEMI TONO");
		btnSubirUnSemi.setBackground(c3);
		btnSubirUnSemi.setForeground(c1);
		btnSubirUnSemi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSubirUnSemi.setBackground(c3);
				btnSubirUnSemi.setBackground(c2);
				btnSubirUnSemi.setForeground(c1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSubirUnSemi.setBackground(c2);
				btnSubirUnSemi.setBackground(c3);
				btnSubirUnSemi.setForeground(c1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				limpiarError();
				c.validarInputNotas();
			}
		});
		SubirSemiTono.add(btnSubirUnSemi);

		JPanel SubirSemiTono_1 = new JPanel();
		SubirSemiTono_1.setOpaque(false);
		panel_2.add(SubirSemiTono_1);
		SubirSemiTono_1.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono_1 = new JLabel("Baja un SEMITONO a las notas");
		lblSubeUnSemitono_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono_1.setForeground(new Color(220, 214, 247));
		SubirSemiTono_1.add(lblSubeUnSemitono_1);

		JButton btnSubirUnSemi_1 = new JButton("BAJAR UN SEMI TONO");
		btnSubirUnSemi_1.setForeground(new Color(66, 72, 116));
		btnSubirUnSemi_1.setBackground(new Color(220, 214, 247));
		SubirSemiTono_1.add(btnSubirUnSemi_1);

		JPanel SubirSemiTono_2 = new JPanel();
		SubirSemiTono_2.setOpaque(false);
		panel_2.add(SubirSemiTono_2);
		SubirSemiTono_2.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono_2 = new JLabel("Sube un TONO a las notas");
		lblSubeUnSemitono_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono_2.setForeground(new Color(220, 214, 247));
		SubirSemiTono_2.add(lblSubeUnSemitono_2);

		JButton btnSubirUnSemi_2 = new JButton("SUBIR UN SEMI TONO");
		btnSubirUnSemi_2.setForeground(new Color(66, 72, 116));
		btnSubirUnSemi_2.setBackground(new Color(220, 214, 247));
		SubirSemiTono_2.add(btnSubirUnSemi_2);

		JPanel SubirSemiTono_3 = new JPanel();
		SubirSemiTono_3.setOpaque(false);
		panel_2.add(SubirSemiTono_3);
		SubirSemiTono_3.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono_3 = new JLabel("Sube un TONO a las notas");
		lblSubeUnSemitono_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono_3.setForeground(new Color(220, 214, 247));
		SubirSemiTono_3.add(lblSubeUnSemitono_3);

		JButton btnSubirUnSemi_3 = new JButton("SUBIR UN TONO");
		btnSubirUnSemi_3.setForeground(new Color(66, 72, 116));
		btnSubirUnSemi_3.setBackground(new Color(220, 214, 247));
		SubirSemiTono_3.add(btnSubirUnSemi_3);

		JPanel SubirSemiTono_4 = new JPanel();
		SubirSemiTono_4.setOpaque(false);
		panel_2.add(SubirSemiTono_4);
		SubirSemiTono_4.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono_4 = new JLabel("Eliminar Notas");
		lblSubeUnSemitono_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono_4.setForeground(new Color(220, 214, 247));
		SubirSemiTono_4.add(lblSubeUnSemitono_4);

		JButton btnSubirUnSemi_4 = new JButton("ELIMINAR");
		btnSubirUnSemi_4.setForeground(new Color(66, 72, 116));
		btnSubirUnSemi_4.setBackground(new Color(220, 214, 247));
		SubirSemiTono_4.add(btnSubirUnSemi_4);

		JPanel SubirSemiTono_5 = new JPanel();
		SubirSemiTono_5.setOpaque(false);
		panel_2.add(SubirSemiTono_5);
		SubirSemiTono_5.setLayout(new GridLayout(2, 2, 2, 1));

		JLabel lblSubeUnSemitono_5 = new JLabel("Retrocede a las ventana anterior");
		lblSubeUnSemitono_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubeUnSemitono_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubeUnSemitono_5.setForeground(new Color(220, 214, 247));
		SubirSemiTono_5.add(lblSubeUnSemitono_5);

		JButton btnSubirUnSemi_5 = new JButton("ATRAS");
		btnSubirUnSemi_5.setForeground(new Color(66, 72, 116));
		btnSubirUnSemi_5.setBackground(new Color(220, 214, 247));
		SubirSemiTono_5.add(btnSubirUnSemi_5);

		JPanel centroInterno = new JPanel();
		panel_1.add(centroInterno, BorderLayout.CENTER);
		centroInterno.setBackground(c4);
		centroInterno.setLayout(new GridLayout(4, 0, 10, 10));

		JPanel ingresar = new JPanel();
		centroInterno.add(ingresar);
		ingresar.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		ingresar.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 5, 0));

		JLabel lblIngresseLasNotas = new JLabel("Ingresse las notas");
		lblIngresseLasNotas.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblIngresseLasNotas);

		JLabel lblSeparadasPorUn = new JLabel("SEPARADAS POR UN \";\"");
		lblSeparadasPorUn.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblSeparadasPorUn);

		JPanel panel_7 = new JPanel();
		ingresar.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));

		textEntrada = new JTextField();
		panel_7.add(textEntrada);
		textEntrada.setColumns(10);

		JPanel panel_5 = new JPanel();
		centroInterno.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		lblErrores = new JLabel("ERRORES");
		lblErrores.setVisible(false);
		panel_5.add(lblErrores, BorderLayout.CENTER);

		JPanel panel_6 = new JPanel();
		centroInterno.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		txtrResultado = new JTextArea();
		txtrResultado.setEditable(false);
		panel_6.add(txtrResultado);

		JPanel panel_4 = new JPanel();
		centroInterno.add(panel_4);

		JButton btnMasopciones = new JButton("Más Opciones");
		btnMasopciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.masOpciones();
			}
		});
		panel_4.add(btnMasopciones);

		JButton btnImprimir = new JButton("imprimir");
		btnImprimir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.imprimir();
			}
		});
		panel_4.add(btnImprimir);
	}

	protected void limpiarError() {
		lblErrores.setText("");
		lblErrores.setVisible(false);
	}
}
