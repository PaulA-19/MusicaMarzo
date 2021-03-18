package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import BajarSubirNotas.controller.ControllerBajarSubirNotas;
import BajarSubirNotas.model.ModelBajarSubirNotas;
import BajarSubirNotas.vista.VistaBajarSubirNotas;
import controller.ControllerPrincipal;
import datos.Comun;
import model.modeloPrincipal;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class VistaInicio extends JFrame implements Comun {

	private JPanel contentPane;
	private VistaInicio actual;
	JButton irBajarSubir, irBajarSubir_1, irBajarSubir_1_1, irBajarSubir_1_2;
	ControllerPrincipal c;

//	@Override
//	public void setDefaultCloseOperation(int operation) {
//		if (operation == JFrame.EXIT_ON_CLOSE) {
//			salir();
//		} else {
//			super.setDefaultCloseOperation(operation);
//		}
//	}

	/**
	 * Create the frame.
	 */
	public VistaInicio(ControllerPrincipal c) {
		this.c = c;
		actual = this;
		c.setVista(actual);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 400);
		setLocationRelativeTo(null);
//		setBounds(100, 100, 230, 470);
		actual.setMinimumSize(new Dimension(350, 400));
		contentPane = new JPanel();
		contentPane.setBackground(c1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel Norte = new JPanel();
		Norte.setOpaque(false);
		contentPane.add(Norte, BorderLayout.NORTH);
		Norte.setLayout(new GridLayout(2, 0, 5, 5));

		JLabel Titulo = new JLabel("JUEGA CON LA MUSICA");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setForeground(c4);
		Norte.add(Titulo);

		JLabel lblSoloDisfruta = new JLabel("Solo disfruta");
		lblSoloDisfruta.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoloDisfruta.setForeground(c3);
		Norte.add(lblSoloDisfruta);

		JPanel Centro = new JPanel();
		Centro.setOpaque(false);
		contentPane.add(Centro, BorderLayout.CENTER);
		Centro.setLayout(new GridLayout(5, 0, 10, 5));

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		Centro.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(VistaInicio.class.getResource("/img/logo2_re.jpg")));
		panel.add(lblFoto);
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel BajarSubirTono = new JPanel();
		BajarSubirTono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BajarSubirTono.setBackground(c3);
				irBajarSubir.setBackground(c2);
				irBajarSubir.setForeground(c1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				BajarSubirTono.setBackground(c2);
				irBajarSubir.setBackground(c3);
				irBajarSubir.setForeground(c1);
			}
		});
		Centro.add(BajarSubirTono);
		BajarSubirTono.setBackground(c2);
		BajarSubirTono.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblBajarYSubir = new JLabel("Bajar y subir tonos");
		lblBajarYSubir.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBajarYSubir.setHorizontalAlignment(SwingConstants.CENTER);
		BajarSubirTono.add(lblBajarYSubir);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		BajarSubirTono.add(panel_1);

		irBajarSubir = new JButton("Probar");
		irBajarSubir.setBackground(c3);
		irBajarSubir.setForeground(c1);
		irBajarSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				c.AbrirBajarSubirNotas();

			}
		});
		panel_1.setLayout(new BorderLayout(0, 0));
		irBajarSubir.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(irBajarSubir);

		JLabel lblNewLabel = new JLabel(" ");
		panel_1.add(lblNewLabel, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_2, BorderLayout.WEST);

		JLabel lblNewLabel_3 = new JLabel(" ");
		panel_1.add(lblNewLabel_3, BorderLayout.EAST);

		JPanel BajarSubirTono_1 = new JPanel();
		BajarSubirTono_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BajarSubirTono_1.setBackground(c3);
				irBajarSubir_1.setBackground(c2);
				irBajarSubir_1.setForeground(c1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				BajarSubirTono_1.setBackground(c2);
				irBajarSubir_1.setBackground(c3);
				irBajarSubir_1.setForeground(c1);
			}
		});
		Centro.add(BajarSubirTono_1);
		BajarSubirTono_1.setBackground(c2);
		BajarSubirTono_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblBajarYSubir_1 = new JLabel("otro 2");
		lblBajarYSubir_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBajarYSubir_1.setHorizontalAlignment(SwingConstants.CENTER);
		BajarSubirTono_1.add(lblBajarYSubir_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		BajarSubirTono_1.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));

		irBajarSubir_1 = new JButton("Probar");
		irBajarSubir_1.setBackground(c3);
		irBajarSubir_1.setForeground(c1);
		irBajarSubir_1.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1_1.add(irBajarSubir_1, BorderLayout.CENTER);

		JLabel lblNewLabel_5 = new JLabel(" ");
		panel_1_1.add(lblNewLabel_5, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_1 = new JLabel(" ");
		panel_1_1.add(lblNewLabel_1_1, BorderLayout.WEST);

		JLabel lblNewLabel_2_1 = new JLabel(" ");
		panel_1_1.add(lblNewLabel_2_1, BorderLayout.NORTH);

		JLabel lblNewLabel_3_1 = new JLabel(" ");
		panel_1_1.add(lblNewLabel_3_1, BorderLayout.EAST);

		JPanel BajarSubirTono_1_1 = new JPanel();
		BajarSubirTono_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BajarSubirTono_1_1.setBackground(c3);
				irBajarSubir_1_1.setBackground(c2);
				irBajarSubir_1_1.setForeground(c1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				BajarSubirTono_1_1.setBackground(c2);
				irBajarSubir_1_1.setBackground(c3);
				irBajarSubir_1_1.setForeground(c1);
			}
		});
		Centro.add(BajarSubirTono_1_1);
		BajarSubirTono_1_1.setBackground(c2);
		BajarSubirTono_1_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblBajarYSubir_1_1 = new JLabel("otro 3");
		lblBajarYSubir_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBajarYSubir_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		BajarSubirTono_1_1.add(lblBajarYSubir_1_1);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setOpaque(false);
		BajarSubirTono_1_1.add(panel_1_1_1);
		panel_1_1_1.setLayout(new BorderLayout(0, 0));

		irBajarSubir_1_1 = new JButton("Probar");
		irBajarSubir_1_1.setBackground(c3);
		irBajarSubir_1_1.setForeground(c1);
		irBajarSubir_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1_1_1.add(irBajarSubir_1_1, BorderLayout.CENTER);

		JLabel lblNewLabel_5_1 = new JLabel(" ");
		panel_1_1_1.add(lblNewLabel_5_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_1_1 = new JLabel(" ");
		panel_1_1_1.add(lblNewLabel_1_1_1, BorderLayout.WEST);

		JLabel lblNewLabel_2_1_1 = new JLabel(" ");
		panel_1_1_1.add(lblNewLabel_2_1_1, BorderLayout.EAST);

		JLabel lblNewLabel_3_1_1 = new JLabel(" ");
		panel_1_1_1.add(lblNewLabel_3_1_1, BorderLayout.NORTH);

		JPanel BajarSubirTono_1_2 = new JPanel();
		BajarSubirTono_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BajarSubirTono_1_2.setBackground(c3);
				irBajarSubir_1_2.setBackground(c2);
				irBajarSubir_1_2.setForeground(c1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				BajarSubirTono_1_2.setBackground(c2);
				irBajarSubir_1_2.setBackground(c3);
				irBajarSubir_1_2.setForeground(c1);
			}
		});
		Centro.add(BajarSubirTono_1_2);
		BajarSubirTono_1_2.setBackground(c2);
		BajarSubirTono_1_2.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblBajarYSubir_1_2 = new JLabel("Salir");
		lblBajarYSubir_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBajarYSubir_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		BajarSubirTono_1_2.add(lblBajarYSubir_1_2);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setOpaque(false);
		BajarSubirTono_1_2.add(panel_1_1_2);
		panel_1_1_2.setLayout(new BorderLayout(0, 0));

		irBajarSubir_1_2 = new JButton("Salir");
		irBajarSubir_1_2.setBackground(c3);
		irBajarSubir_1_2.setForeground(c1);
		irBajarSubir_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salir();
			}
		});
		irBajarSubir_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1_1_2.add(irBajarSubir_1_2, BorderLayout.CENTER);

		JLabel lblNewLabel_5_2 = new JLabel(" ");
		panel_1_1_2.add(lblNewLabel_5_2, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_1_2 = new JLabel(" ");
		panel_1_1_2.add(lblNewLabel_1_1_2, BorderLayout.WEST);

		JLabel lblNewLabel_2_1_2 = new JLabel(" ");
		panel_1_1_2.add(lblNewLabel_2_1_2, BorderLayout.EAST);

		JLabel lblNewLabel_3_1_2 = new JLabel(" ");
		panel_1_1_2.add(lblNewLabel_3_1_2, BorderLayout.NORTH);

		JPanel sur = new JPanel();
		sur.setOpaque(false);
		contentPane.add(sur, BorderLayout.SOUTH);
		sur.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		sur.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_4 = new JLabel("Puedes apoyar");
		lblNewLabel_4.setForeground(c3);
		panel_3.add(lblNewLabel_4, BorderLayout.CENTER);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_2 = new JPanel();
		sur.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton = new JButton("Tuto");

		btnNewButton.setBackground(c3);
		btnNewButton.setForeground(c1);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				c.tutorial();
			}
		});
		panel_2.add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_2 = new JButton("Colab.");
		btnNewButton_2.setBackground(c3);
		btnNewButton_2.setForeground(c1);

		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				c.colaborar();
			}
		});
		panel_2.add(btnNewButton_2, BorderLayout.EAST);
	}

	private void salir() {
		c.salir();
	}

}
