package InterfacesGraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

	
public class Ventana_principal extends JFrame{

	private Renta renta;
	
	
	private JPanel Contenedor;
	private JPanel panel1; 
	private JPanel panel2; 
	private JPanel panel3; 
	private JPanel panel4; 
	
	private JRadioButton rdbtnNaveEspacial;
	private JRadioButton rdbtnAvion;
	
	private JButton btnAceptar;
	
	
	private JTextField textFielPrecio;
	
	private JToggleButton tglbtnInicio;
	private JToggleButton tglbtnRentasAnteriores;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal frame = new Ventana_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ventana_principal() {
		
		//propiedades basicas del frame:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Renta de Vehiculos");
		setSize( 450, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//se crea el contenedor principal:
		Contenedor = new JPanel();
		Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Contenedor);
		Contenedor.setLayout(new BorderLayout(0, 0));
		
		//PANEL1:............................................................................
		panel1 = new JPanel();
		Contenedor.add(panel1);
		panel1.setVisible(true);
		
		JButton btnRentar = new JButton("RENTAR");
		btnRentar.setFont(new Font("Dialog", Font.BOLD, 18));
		btnRentar.setBounds(158, 272, 123, 43);
		btnRentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel1,panel2);
			}
		});
		panel1.setLayout(null);
		panel1.add(btnRentar);
		
		tglbtnInicio = new JToggleButton("Inicio");
		tglbtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnRentasAnteriores.setSelected(false);
			}
		});
		tglbtnInicio.setBounds(12, 12, 105, 27);
		panel1.add(tglbtnInicio);
		
		tglbtnRentasAnteriores = new JToggleButton("Rentas Anteriores");
		tglbtnRentasAnteriores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnInicio.setSelected(false);
			}
		});
		tglbtnRentasAnteriores.setBounds(116, 12, 147, 27);
		panel1.add(tglbtnRentasAnteriores);
		
		
		
		
		//PANEL3:............................................................................
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 440, 340);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		JLabel lblElijaSuVehiculo = new JLabel("Proceso de Renta");
		lblElijaSuVehiculo.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo.setBounds(108, 12, 223, 47);
		panel3.add(lblElijaSuVehiculo);
		
		JLabel lblNuestrosVehiculos = new JLabel("Nuestros Vehiculos");
		lblNuestrosVehiculos.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNuestrosVehiculos.setBounds(144, 48, 154, 33);
		panel3.add(lblNuestrosVehiculos);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel3,panel4);
				
			}
		});
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAceptar.setBounds(166, 285, 105, 27);
		btnAceptar.setEnabled(false);
		panel3.add(btnAceptar);
		
		JLabel lblnave1 = new JLabel("");
		lblnave1.setBounds(63, 101, 124, 85);
		
		ImageIcon imagen2 = new ImageIcon("/home/drow/git/Programacion-II/Actividad10/src/Imagenes/Nave1.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblnave1.getWidth()-10,lblnave1.getHeight(),Image.SCALE_DEFAULT));
        lblnave1.setIcon(icono2);	
        panel3.add(lblnave1);
		
		JLabel lblnave2 = new JLabel("");
		lblnave2.setBounds(266, 93, 124, 116);
		
		ImageIcon imagen3 = new ImageIcon("/home/drow/git/Programacion-II/Actividad10/src/Imagenes/Nave2.png");
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblnave2.getWidth()-10,lblnave2.getHeight(),Image.SCALE_DEFAULT));
        lblnave2.setIcon(icono3);
		
        panel3.add(lblnave2);
		
        rdbtnNaveEspacial = new JRadioButton("Nave Espacial");
		rdbtnNaveEspacial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ValidarSeleccion(rdbtnNaveEspacial,rdbtnAvion,btnAceptar);

			}
		});
		rdbtnNaveEspacial.setBounds(40, 194, 130, 25);
		panel3.add(rdbtnNaveEspacial);
		
		rdbtnAvion = new JRadioButton("Avion");
		rdbtnAvion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ValidarSeleccion(rdbtnAvion,rdbtnNaveEspacial,btnAceptar);
				
			}
		});
		rdbtnAvion.setBounds(276, 194, 74, 25);
		panel3.add(rdbtnAvion);
		
		
		
		
		
		//PANEL2:............................................................................
		panel2 = new JPanel();
		panel2.setBounds(5, 15, 440, 340);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		JLabel lblPregunta = new JLabel("¿Cuentas con targeta de credito?");
		lblPregunta.setFont(new Font("Dialog", Font.BOLD, 22));
		lblPregunta.setBounds(44, 90, 365, 41);
		panel2.add(lblPregunta);
		
		JButton btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel2,panel3);
			}
		});
		btnSi.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSi.setBounds(94, 249, 54, 41);
		panel2.add(btnSi);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//CambiaPanel(panel2,panel3);
			}
		});
		
		btnNo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNo.setBounds(287, 249, 54, 41);
		panel2.add(btnNo);
		
		
		
		JButton btnImagen = new JButton("");
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel2,panel1);
			}
		});
		btnImagen.setBackground(UIManager.getColor("Button.select"));
		btnImagen.setBounds(44, 29, 47, 31);
		
		ImageIcon imagen1 = new ImageIcon("/home/drow/git/Programacion-II/Actividad10/src/Imagenes/Flecha3.png");
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(btnImagen.getWidth()-10,btnImagen.getHeight(),Image.SCALE_DEFAULT));
		btnImagen.setIcon(icono);
		panel2.add(btnImagen);
		
		
		
		
		//PANEL4:............................................................................
		panel4 = new JPanel();
		panel4.setBounds(5, 15, 440, 340);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JLabel lblElijaSuVehiculo1 = new JLabel("Proceso de Renta");
		lblElijaSuVehiculo1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo1.setBounds(108, 12, 223, 47);
		panel4.add(lblElijaSuVehiculo1);
		
		JLabel lblFechaInicioDe = new JLabel("Fecha inicio de renta:");
		lblFechaInicioDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaInicioDe.setBounds(139, 71, 169, 23);
		panel4.add(lblFechaInicioDe);
		
		JLabel lblFechaFinDe = new JLabel("Fecha fin de renta:");
		lblFechaFinDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaFinDe.setBounds(149, 147, 169, 23);
		panel4.add(lblFechaFinDe);
		
		JDateChooser dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(166, 106, 114, 23);
		panel4.add(dateChooserInicio);
		
		JDateChooser dateChooserfin = new JDateChooser();
		dateChooserfin.setBounds(166, 177, 114, 23);
		panel4.add(dateChooserfin);
		
		textFielPrecio = new JTextField();
		//textFielPrecio.setText("1823");
		textFielPrecio.setEditable(false);
		textFielPrecio.setBounds(184, 224, 86, 29);
		panel4.add(textFielPrecio);
		textFielPrecio.setColumns(10);
		
		JLabel lblPrecio = new JLabel("$");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPrecio.setBounds(166, 225, 23, 23);
		panel4.add(lblPrecio);
		
		JButton btnPagoConTargeta = new JButton("Pago con targeta");
		btnPagoConTargeta.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConTargeta.setBounds(40, 284, 149, 27);
		panel4.add(btnPagoConTargeta);
		
		JButton btnPagoConEfectivo = new JButton("Pago con efectivo");
		btnPagoConEfectivo.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConEfectivo.setBounds(248, 284, 149, 27);
		panel4.add(btnPagoConEfectivo);
		
		
	}
	
	private void CambiaPanel(JPanel a,JPanel b) {
		
		a.setVisible(false);		//cambia el panel a por el panel b
		b.setVisible(true);	
		Contenedor.add(b);
		Contenedor.validate();
	}
	
	private void ValidarSeleccion(JComponent a, JComponent b, JComponent c) {
		
		if(((AbstractButton) a).isSelected()) {
			((AbstractButton) b).setSelected(false);
			c.setEnabled(true);
		}else {
			c.setEnabled(false);
		}
		
	}
	
}





