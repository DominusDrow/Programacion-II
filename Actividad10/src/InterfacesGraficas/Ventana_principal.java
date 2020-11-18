package InterfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import Transportes.avion;
import Transportes.naveEspacial;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

public class Ventana_principal extends JFrame{

	private Renta renta;
	
	private JPanel Contenedor,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10;
	
	private JTable tableRentados;
	
	private JRadioButton rdbtnNaveEspacial,rdbtnAvion;
		
	
	private JTextField textFielPrecio,textFieldAlgo,textFieldcel,textFieldnom,textField,
	textFieldTarjeta,textFieldCVV;
	
	private JToggleButton tglbtnInicio,tglbtnRentasAnteriores;	
	
	private JButton btnPagoConTargeta,btnPagoConEfectivo,btnAceptarygenerar,btnAceptar;
	private JButton btnCalcular;
	
	private JDateChooser dateChooserfin,dateChooserInicio;
	
	private String a;
	
	
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
		
		//componentes compartidos:
		JButton btnImagen = new JButton("");
		btnImagen.setBackground(UIManager.getColor("Button.select"));
		btnImagen.setBounds(44, 29, 47, 31);
		
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel2,panel1);
			}
		});
		
		
		
		//PANEL1:............................................................................
		panel1 = new JPanel();
		Contenedor.add(panel1);
		panel1.setVisible(true);
		
		JButton btnRentar = new JButton("RENTAR");
		btnRentar.setFont(new Font("Dialog", Font.BOLD, 18));
		btnRentar.setBounds(158, 272, 123, 43);
		btnRentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta= new Renta();
				CambiaPanel(panel1,panel2);
			}
		});
		panel1.setLayout(null);
		panel1.add(btnRentar);
		
		tglbtnInicio = new JToggleButton("Inicio");
		tglbtnInicio.setSelected(true);
		tglbtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnRentasAnteriores.setSelected(false);
				CambiaPanel(panel10,panel1);
			}
		});
		tglbtnInicio.setBounds(12, 12, 105, 27);
		panel1.add(tglbtnInicio);
		
		tglbtnRentasAnteriores = new JToggleButton("Rentas Anteriores");
		tglbtnRentasAnteriores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnInicio.setSelected(false);
				CambiaPanel(panel1,panel10);
			}
		});
		tglbtnRentasAnteriores.setBounds(116, 12, 147, 27);
		panel1.add(tglbtnRentasAnteriores);
		
		
		JLabel lbltitulo = new JLabel("RAPIMOV");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbltitulo.setBounds(141, 60, 168, 43);
		panel1.add(lbltitulo);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setBounds(128, 122, 193, 121);		
		ImageIcon imagen9 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Carretera1.png"));
        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(lbllogo.getWidth()-10,lbllogo.getHeight(),Image.SCALE_DEFAULT));
        lbllogo.setIcon(icono9);
    	panel1.add(lbllogo);
		
		
		//PANEL2:............................................................................
		panel2 = new JPanel();
		panel2.setBounds(5, 15, 440, 340);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		JLabel lblPregunta = new JLabel("¿Cuentas con tarjeta de credito?");
		lblPregunta.setFont(new Font("Dialog", Font.BOLD, 22));
		lblPregunta.setBounds(44, 90, 365, 41);
		panel2.add(lblPregunta);
		
		JButton btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta.setTarjeta(true);
				CambiaPanel(panel2,panel3);
			}
		});
		btnSi.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSi.setBounds(94, 249, 54, 41);
		panel2.add(btnSi);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta.setTarjeta(false);
				//CambiaPanel(panel2,panel3);
			}
		});
		
		btnNo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNo.setBounds(287, 249, 54, 41);
		panel2.add(btnNo);
		
	
		
		ImageIcon imagen1 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Flecha1.png"));
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(btnImagen.getWidth()-10,btnImagen.getHeight(),Image.SCALE_DEFAULT));
		btnImagen.setIcon(icono);
		panel2.add(btnImagen);
		
		
		JLabel imagentarjeta1 = new JLabel("");
		imagentarjeta1.setBounds(139, 128, 160, 112);
		ImageIcon imagen6 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Targeta2.png"));
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(imagentarjeta1.getWidth()-10,imagentarjeta1.getHeight(),Image.SCALE_DEFAULT));
        imagentarjeta1.setIcon(icono6);
    	panel2.add(imagentarjeta1);
		
		
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
				if(((AbstractButton) rdbtnNaveEspacial).isSelected()) {
					renta.setVehiculo(new naveEspacial("AlfredoX"));
				}else {
					renta.setVehiculo(new avion("Boeing"));
				}

				CambiaPanel(panel3,panel4);
				
			}
		});
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAceptar.setBounds(166, 285, 105, 27);
		btnAceptar.setEnabled(false);
		panel3.add(btnAceptar);
		
		JLabel lblnave1 = new JLabel("");
		lblnave1.setBounds(63, 101, 124, 85);
		
		ImageIcon imagen2 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave1.png"));
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblnave1.getWidth()-10,lblnave1.getHeight(),Image.SCALE_DEFAULT));
        lblnave1.setIcon(icono2);	
        panel3.add(lblnave1);
		
		JLabel lblnave2 = new JLabel("");
		lblnave2.setBounds(266, 93, 124, 116);
		
		ImageIcon imagen3 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave2.png"));
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
		
		dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(166, 106, 114, 23);
		panel4.add(dateChooserInicio);
		
		dateChooserfin = new JDateChooser();
		dateChooserfin.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					btnPagoConTargeta.setEnabled(true);
					btnPagoConEfectivo.setEnabled(true);
				
			}
		});
		dateChooserfin.setBounds(166, 177, 114, 23);
		panel4.add(dateChooserfin);
		
		textFielPrecio = new JTextField();
		//textFielPrecio.setText("1823");
		textFielPrecio.setEditable(false);
		textFielPrecio.setBounds(125, 235, 86, 29);
		panel4.add(textFielPrecio);
		textFielPrecio.setColumns(10);
		
		JLabel lblPrecio = new JLabel("$");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPrecio.setBounds(115, 235, 23, 23);
		panel4.add(lblPrecio);
		
		JLabel lblsi = new JLabel("X");
		lblsi.setFont(new Font("Dialog", Font.BOLD, 17));
		lblsi.setBounds(212, 235, 23, 23);
		panel4.add(lblsi);
		
		final JTextField textFielHoras = new JTextField();
		//textFielPrecio.setText("1823");
		textFielHoras.setEditable(false);
		textFielHoras.setBounds(224, 235, 40, 29);
		panel4.add(textFielHoras);
		textFielHoras.setColumns(10);
		
		JLabel lblsiH = new JLabel("horas");
		lblsiH.setFont(new Font("Dialog", Font.BOLD, 13));
		lblsiH.setBounds(266, 235, 40, 30);
		panel4.add(lblsiH);
		
		btnCalcular=new JButton("Calcular");
		btnCalcular.setFont(new Font("Dialog",Font.BOLD,13));
		btnCalcular.setBounds(166, 205, 114, 23);
		panel4.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((dateChooserInicio.getDate()!=null)&&(dateChooserfin.getDate()!=null))	{
					int horas=renta.calculaHoras(dateChooserInicio, dateChooserfin);
					//int precio=renta.calculaPrecio(horas,renta.getVehiculo().) necesitamos el precioXhora del vehiculo
					if(renta.validar(dateChooserInicio,dateChooserfin)) {
						textFielPrecio.setText("precioTotal");
						textFielHoras.setText(" "+horas+" ");
					}else {
						JOptionPane.showMessageDialog(null, "Las fechas estan mal.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Introduzca fechas");
				}
				
			}
		});
		
		btnPagoConTargeta = new JButton("Pago con tarjeta");
		btnPagoConTargeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					CambiaPanel(panel4,panel6);
				
			}
		});
		btnPagoConTargeta.setEnabled(false);
		btnPagoConTargeta.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConTargeta.setBounds(40, 284, 149, 27);
		panel4.add(btnPagoConTargeta);
		
		btnPagoConEfectivo = new JButton("Pago con efectivo");
		btnPagoConEfectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					CambiaPanel(panel4,panel5);
				
			}
		});
		btnPagoConEfectivo.setEnabled(false);
		btnPagoConEfectivo.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConEfectivo.setBounds(248, 284, 149, 27);
		panel4.add(btnPagoConEfectivo);
		
		
	
		//PANEL5:............................................................................
	
		panel5 = new JPanel();
		panel5.setBounds(5, 15, 440, 340);
		panel5.setLayout(null);
		panel5.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Pago en efectivo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(109, 12, 218, 53);
		panel5.add(lblNewLabel);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del cliente");
		lblDatosDelCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente.setBounds(157, 62, 124, 17);
		panel5.add(lblDatosDelCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre.setBounds(39, 102, 60, 17);
		panel5.add(lblNombre);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular.setBounds(39, 146, 60, 17);
		panel5.add(lblCelular);
		
		textFieldcel = new JTextField();
		textFieldcel.setBounds(134, 144, 164, 21);
		panel5.add(textFieldcel);
		textFieldcel.setColumns(10);
		
		textFieldnom = new JTextField();
		textFieldnom.setColumns(10);
		textFieldnom.setBounds(134, 100, 164, 21);
		panel5.add(textFieldnom);
		
		JLabel lblSeGeneroEl = new JLabel("Se genero el siguiente folio");
		lblSeGeneroEl.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSeGeneroEl.setBounds(127, 179, 189, 17);
		panel5.add(lblSeGeneroEl);
		
		textField = new JTextField();
		textField.setBounds(158, 208, 115, 21);
		panel5.add(textField);
		textField.setColumns(10);
		
		JLabel lblDebidoASu = new JLabel("Debido a su metodo de pago no se generara comprobante");
		lblDebidoASu.setBounds(43, 241, 358, 17);
		panel5.add(lblDebidoASu);
		
		JLabel lblGuardeEsteFolio = new JLabel("guarde este folio para alcaraciones y reclamos");
		lblGuardeEsteFolio.setBounds(85, 261, 286, 17);
		panel5.add(lblGuardeEsteFolio);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAceptar.setBounds(167, 290, 105, 27);
		panel5.add(btnAceptar);
		
		//PANEL6:............................................................................
		
		panel6 = new JPanel();
		panel6.setBounds(5, 15, 440, 340);
		panel6.setLayout(null);
		panel6.setVisible(false);
		
		JLabel lbldatos = new JLabel("Datos personales y bancarios");
		lbldatos.setFont(new Font("Dialog", Font.BOLD, 20));
		lbldatos.setBounds(77, 12, 302, 34);
		panel6.add(lbldatos);
		
	
		//ya existen:
		panel6.add(lblDatosDelCliente);
		panel6.add(lblNombre);
		panel6.add(lblCelular);
		
		JTextField textFieldcel = new JTextField();
		textFieldcel.setBounds(134, 144, 164, 21);
		panel6.add(textFieldcel);
		textFieldcel.setColumns(10);
		
		final JTextField textFieldnom = new JTextField();
		textFieldnom.setColumns(10);
		textFieldnom.setBounds(134, 100, 164, 21);
		panel6.add(textFieldnom);
		
		JLabel lblNoDeTarjeta = new JLabel("No. tarjeta");
		lblNoDeTarjeta.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNoDeTarjeta.setBounds(39, 187, 96, 17);
		panel6.add(lblNoDeTarjeta);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(134, 185, 164, 21);
		panel6.add(textFieldTarjeta);
		
		JLabel lblFechaDeExpiracion = new JLabel("Fecha de expiracion");
		lblFechaDeExpiracion.setFont(new Font("Dialog", Font.BOLD, 13));
		lblFechaDeExpiracion.setBounds(39, 229, 136, 17);
		panel6.add(lblFechaDeExpiracion);
		
		JTextField dateChooserEXp = new JTextField();
		dateChooserEXp.setBounds(176, 229, 79, 21);
		panel6.add(dateChooserEXp);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setBounds(277, 229, 34, 17);
		panel6.add(lblCvv);
		
		textFieldCVV = new JTextField();
		textFieldCVV.setBounds(314, 227, 65, 21);
		panel6.add(textFieldCVV);
		textFieldCVV.setColumns(10);
		
		JButton btnAceptar1 = new JButton("Aceptar");
		btnAceptar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					renta.setNombreC(textFieldnom.getText());
					a=renta.getNombreC();
					System.out.println(a);
					CambiaPanel(panel6,panel7);
				
			}
		});
		btnAceptar1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAceptar1.setBounds(167, 279, 105, 27);
		panel6.add(btnAceptar1);
		

		
		//PANEL7:............................................................................
		
		panel7 = new JPanel();
		panel7.setBounds(5, 15, 440, 340);
		panel7.setLayout(null);
		panel7.setVisible(false);
		
		JLabel lbldatos1 = new JLabel("Confirmacion de datos");
		lbldatos1.setFont(new Font("Dialog", Font.BOLD, 24));
		lbldatos1.setBounds(89, 11, 266, 34);
		panel7.add(lbldatos1);
		
		JLabel lblDatosDelCliente1 = new JLabel("Datos del cliente");
		lblDatosDelCliente1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente1.setBounds(157, 62, 124, 17);
		panel7.add(lblDatosDelCliente1);
		
		JLabel lblNombre1 = new JLabel("Nombre:");
		lblNombre1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre1.setBounds(39, 102, 60, 17);
		panel7.add(lblNombre1);
		
		JLabel lblCelular1 = new JLabel("Celular:");
		lblCelular1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular1.setBounds(39, 146, 60, 17);
		panel7.add(lblCelular1);
		
		JTextField textFieldcel1 = new JTextField();
		textFieldcel1.setBounds(134, 144, 164, 21);
		panel7.add(textFieldcel1);
		textFieldcel1.setColumns(10);
		
		JTextField textFieldnom1 = new JTextField();
		textFieldnom1.setText("");
		textFieldnom1.setEditable(false);
		textFieldnom1.setColumns(10);
		textFieldnom1.setBounds(134, 100, 164, 21);
		panel7.add(textFieldnom1);
		
		JLabel lblNoDeTarjeta1 = new JLabel("No. tarjeta");
		lblNoDeTarjeta1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNoDeTarjeta1.setBounds(39, 187, 96, 17);
		panel7.add(lblNoDeTarjeta1);
		
		JTextField textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(134, 185, 164, 21);
		panel7.add(textFieldTarjeta);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CambiaPanel(panel7,panel8);
			}
		});
		btnContinuar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnContinuar.setBounds(167, 301, 105, 27);
		panel7.add(btnContinuar);
		
		JLabel lblVehiculo = new JLabel("Vehiculo");
		lblVehiculo.setBounds(341, 76, 60, 17);
		panel7.add(lblVehiculo);
		
		JLabel lblInicio = new JLabel("Inicio:");
		lblInicio.setBounds(39, 230, 60, 17);
		panel7.add(lblInicio);
		
		JLabel lblFinal = new JLabel("final:");
		lblFinal.setBounds(39, 259, 60, 17);
		panel7.add(lblFinal);
		
		JLabel lblPrecio1 = new JLabel("Precio:");
		lblPrecio1.setBounds(224, 250, 60, 17);
		panel7.add(lblPrecio1);
		
		JTextField textField = new JTextField();
		textField.setBounds(287, 245, 85, 27);
		panel7.add(textField);
		textField.setColumns(10);
		
		JTextField textFieldInicio = new JTextField();
		//textFieldInicio.setText();
		textFieldInicio.setBounds(89, 228, 86, 20);
		panel7.add(textFieldInicio);
		textFieldInicio.setColumns(10);
		
		JTextField textFieldfinal = new JTextField();
		textFieldfinal.setBounds(89, 258, 86, 20);
		panel7.add(textFieldfinal);
		textFieldfinal.setColumns(10);
		
		JPanel panelImagen1 = new JPanel();
		panelImagen1.setBounds(308, 102, 122, 102);
		panel7.add(panelImagen1);
		panelImagen1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVehiculoIco_1 = new JLabel("");
		/*
		ImageIcon imagen5 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave1.png"));
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(lblVehiculoIco_1.getWidth()-10,lblVehiculoIco_1.getHeight(),Image.SCALE_DEFAULT));
        lblVehiculoIco_1.setIcon(icono5);
		*/
		panelImagen1.add(lblVehiculoIco_1, BorderLayout.CENTER);
		
		JLabel lblVehiculoIco_2 = new JLabel("");
		/*
		ImageIcon imagen7 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave2.png"));
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(lblVehiculoIco_2.getWidth()-10,lblVehiculoIco_2.getHeight(),Image.SCALE_DEFAULT));
        lblVehiculoIco_1.setIcon(icono7);
		*/
		panelImagen1.add(lblVehiculoIco_2, BorderLayout.NORTH);
		
		
		
		//PANEL8:............................................................................

		panel8 = new JPanel();
		panel8.setBounds(5, 15, 440, 340);
		panel8.setLayout(null);
		panel8.setVisible(false);
		
		JTextPane textPaneContrato = new JTextPane();
		textPaneContrato.setBounds(31, 58, 369, 190);
		panel8.add(textPaneContrato);
		
		JLabel lblContrato = new JLabel("CONTRATO");
		lblContrato.setFont(new Font("Aharoni", Font.PLAIN, 30));
		lblContrato.setBounds(31, 17, 202, 49);
		panel8.add(lblContrato);
		
		JCheckBox e = new JCheckBox("He leido el contrato y estoy de acuerdo");
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAceptarygenerar.setEnabled(true);
			}
		});
		e.setBounds(124, 263, 215, 23);
		panel8.	add(e);
		
		btnAceptarygenerar = new JButton("Aceptar y generar archivo");
		btnAceptarygenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CambiaPanel(panel8,panel9);
			}
		});
		btnAceptarygenerar.setEnabled(false);
		btnAceptarygenerar.setBounds(147, 293, 167, 23);
		panel8.add(btnAceptarygenerar);
		
		
		
		//PANEL9:............................................................................

		panel9 = new JPanel();
		panel9.setBounds(5, 15, 440, 340);
		panel9.setLayout(null);
		panel9.setVisible(false);
		
		JLabel lblgracias = new JLabel("Gracias por rentar en");
		lblgracias.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblgracias.setBounds(58, 35, 319, 46);
		panel9.add(lblgracias);
		
		JLabel lblrapi = new JLabel("RAPIMOV");
		lblrapi.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblrapi.setBounds(140, 74, 162, 55);
		panel9.add(lblrapi);
		
		JButton btnFin = new JButton("Finalizar");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CambiaPanel(panel9,panel1);
			}
		});
		btnFin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnFin.setBounds(163, 251, 112, 30);
		panel9.add(btnFin);
		
		textFieldAlgo = new JTextField();
		textFieldAlgo.setBounds(150, 157, 135, 36);
		panel9.add(textFieldAlgo);
		textFieldAlgo.setColumns(10);
		
		
		
		//PANEL10:............................................................................
		
		panel10 = new JPanel();
		panel10.setBounds(5, 15, 440, 340);
		panel10.setLayout(null);
		panel10.setVisible(false);
		
		JLabel lblAnteriores = new JLabel("Vehiculos rentados");
		lblAnteriores.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAnteriores.setBounds(96, 55, 246, 44);
		panel10.add(lblAnteriores);
		
		tableRentados = new JTable();
		tableRentados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tableRentados.setBounds(389, 277, -327, -165);
		panel10.add(tableRentados);
		/*
		JToggleButton tglbtnInicio2 = new JToggleButton("Inicio");
		tglbtnInicio.setSelected(true);
		tglbtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnRentasAnteriores.setSelected(false);
				CambiaPanel(panel10,panel1);
			}
		});
		tglbtnInicio.setBounds(12, 12, 105, 27);
		panel10.add(tglbtnInicio);
		
		JToggleButton tglbtnRentasAnteriores2 = new JToggleButton("Rentas Anteriores");
		tglbtnRentasAnteriores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnInicio.setSelected(false);
				CambiaPanel(panel1,panel10);
			}
		});
		tglbtnRentasAnteriores.setBounds(116, 12, 147, 27);
		panel10.add(tglbtnRentasAnteriores);
		*/
		
		
		
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





