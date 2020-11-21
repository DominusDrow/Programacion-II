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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

public class Ventana_principal extends JFrame{
	
	private static final long serialVersionUID = 1L;	//se lo puso el IDE automaticamente :v
	
	private Renta renta;
	
	private JTable tableRentados;
	
	private JPanel Contenedor,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,panelImagen1,
	panelaux;
	
	private JLabel lblAnteriores,lblrapi,lblgracias,lblContrato,lblVehiculoIco_1,lblPrecio1,lblFinal,lblInicio,lblVehiculo;
	
	private JLabel lblCelular1,lblNombre1,lblDatosDelCliente1,lbldatos1,lblCvv,lblFechaDeExpiracion,
	lblNoDeTarjeta,lbldatos,lblGuardeEsteFolio,lblDebidoASu,lblSeGeneroEl,lblCelular,lblNombre,lblDatosDelCliente,
	lblNewLabel,lblsiH,lblsi,lblPrecio,lblFechaFinDe,lblFechaInicioDe,lblnave2,lblnave1,lblNuestrosVehiculos,
	lblElijaSuVehiculo,imagentarjeta1,lblPregunta,lbllogo,lbltitulo,lblElijaSuVehiculo1,lblNoDeTarjeta1,lblCelular0,lblNombre0,lblDatosDelCliente0;
	
	private JRadioButton rdbtnNaveEspacial,rdbtnAvion;
	
	private JTextField textFielPrecio,textFieldAlgo,textFieldcel,textFieldnom2,textField,
	textFieldTarjeta,textFieldCVV,textFieldfinal,textFieldInicio,textField7,textFieldTarjeta1,textFieldnom1,
	textFieldcel1,dateChooserEXp,textFielHoras,textFieldnom3,textFieldcel2;
	
	private JToggleButton tglbtnInicio,tglbtnRentasAnteriores;	
	
	private JButton btnPagoConTargeta,btnPagoConEfectivo,btnAceptarygenerar,btnAceptar,btnCalcular,btnFin,btnContinuar,btnAceptar1,
	btnNo,btnSi,btnRentar,btnImagen,btnAceptaE,btnAceptar11;
	
	private JDateChooser dateChooserfin,dateChooserInicio;
	
	private JCheckBox HeLeido;
	
	private Icon icono3,icono2,icono6,icono,icono9;
	

	private JTextPane textPaneContrato;
	
	private	ImageIcon imagen3,imagen2,imagen6,imagen1,imagen9;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	
	
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
		
		tglbtnInicio = new JToggleButton("Inicio");
		tglbtnInicio.setSelected(true);
		tglbtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnRentasAnteriores.setSelected(false);
				CambiaPanel(panel10,panel1);
			}
		});
		tglbtnInicio.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				tglbtnInicio.setBounds(9, 9, 110, 32);
			}
			public void mouseReleased(MouseEvent e) {
				tglbtnInicio.setBounds(12, 12, 105, 27);
			}
		});
		tglbtnInicio.setBounds(12, 12, 105, 27);
		Contenedor.add(tglbtnInicio);
		
		tglbtnRentasAnteriores = new JToggleButton("Rentas Anteriores");
		tglbtnRentasAnteriores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tglbtnInicio.setSelected(false);
				CambiaPanel(panel1,panel10);
			}
		});
		tglbtnRentasAnteriores.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				tglbtnRentasAnteriores.setBounds(113, 9, 152, 32);
			}
			public void mouseReleased(MouseEvent e) {
				tglbtnRentasAnteriores.setBounds(116, 12, 147, 27);
			}
		});
		tglbtnRentasAnteriores.setBounds(116, 12, 147, 27);
		Contenedor.add(tglbtnRentasAnteriores);
		
		btnImagen = new JButton("");
		btnImagen.setVisible(false);
		btnImagen.setContentAreaFilled(false);
		btnImagen.setBorderPainted(false);
		btnImagen.setBackground(UIManager.getColor("Button.select"));
		btnImagen.setBounds(15, 15, 35, 35);
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(panelaux.equals(panel2)) {
					CambiaPanel(panelaux,panel1);
					btnImagen.setVisible(false);
					tglbtnInicio.setVisible(true);
					tglbtnRentasAnteriores.setVisible(true);
				}
				else if(panelaux.equals(panel3))
					CambiaPanel(panelaux,panel2);
			
				else if(panelaux.equals(panel4))
					CambiaPanel(panelaux,panel3);
				
				else if(panelaux.equals(panel5))
					CambiaPanel(panelaux,panel4);
				
				else if(panelaux.equals(panel6))
					CambiaPanel(panelaux,panel4);
				
				else if(panelaux.equals(panel7))
					CambiaPanel(panelaux,panel6);
				
			}
		});
		btnImagen.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				btnImagen.setBounds(17, 17, 30, 30);
				icono = new ImageIcon(imagen1.getImage().getScaledInstance(btnImagen.getWidth(),btnImagen.getHeight(),Image.SCALE_DEFAULT));
				btnImagen.setIcon(icono);
			}
		
			public void mouseReleased(MouseEvent e) {
				btnImagen.setBounds(15, 15, 35, 35);
				icono = new ImageIcon(imagen1.getImage().getScaledInstance(btnImagen.getWidth(),btnImagen.getHeight(),Image.SCALE_DEFAULT));
				btnImagen.setIcon(icono);
			}
		});
		
		imagen1 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Flecha1.png"));
        icono = new ImageIcon(imagen1.getImage().getScaledInstance(btnImagen.getWidth(),btnImagen.getHeight(),Image.SCALE_DEFAULT));
		btnImagen.setIcon(icono);
		Contenedor.add(btnImagen);
		
		
		//PANEL1:............................................................................
		panel1 = new JPanel();	
		Contenedor.add(panel1);
		panel1.setVisible(true);
		panel1.setLayout(null);
		
		btnRentar = new JButton("RENTAR");
		btnRentar.setFont(new Font("Dialog", Font.BOLD, 18));
		btnRentar.setBounds(145, 272, 123, 43);
		btnRentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta= new Renta();
				CambiaPanel(panel1,panel2);
				
				tglbtnInicio.setVisible(false);
				tglbtnRentasAnteriores.setVisible(false);
				btnImagen.setVisible(true);
			}
		});
		panel1.add(btnRentar);
		
		lbltitulo = new JLabel("RAPIMOV");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbltitulo.setBounds(139, 60, 168, 43);
		panel1.add(lbltitulo);
		
		lbllogo = new JLabel("");
		lbllogo.setBounds(128, 122, 193, 121);		
		imagen9 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Carretera1.png"));
        icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(lbllogo.getWidth()-10,lbllogo.getHeight(),Image.SCALE_DEFAULT));
        lbllogo.setIcon(icono9);
    	panel1.add(lbllogo);
		
		
		//PANEL2:............................................................................
		panel2 = new JPanel();
		panel2.setBounds(5, 15, 440, 340);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		lblPregunta = new JLabel("�Cuentas con tarjeta de cr�dito?");
		lblPregunta.setFont(new Font("Dialog", Font.BOLD, 22));
		lblPregunta.setBounds(44, 90, 365, 41);
		panel2.add(lblPregunta);
		
		btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta.setTarjeta(true);
				CambiaPanel(panel2,panel3);
			}
		});
		btnSi.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSi.setBounds(94, 249, 54, 41);
		panel2.add(btnSi);
		
		btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				renta.setTarjeta(false);
				CambiaPanel(panel2,panel3);
				btnPagoConEfectivo.setEnabled(false);
			}
		});
		
		btnNo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNo.setBounds(287, 249, 54, 41);
		panel2.add(btnNo);
		
		
		
		imagentarjeta1 = new JLabel("");
		imagentarjeta1.setBounds(139, 128, 160, 112);
		imagen6 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Targeta2.png"));
        icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(imagentarjeta1.getWidth()-10,imagentarjeta1.getHeight(),Image.SCALE_DEFAULT));
        imagentarjeta1.setIcon(icono6);
    	panel2.add(imagentarjeta1);
		
		
		//PANEL3:............................................................................
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 440, 340);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		lblElijaSuVehiculo = new JLabel("Proceso de Renta");
		lblElijaSuVehiculo.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo.setBounds(108, 12, 223, 47);
		panel3.add(lblElijaSuVehiculo);
		
		lblNuestrosVehiculos = new JLabel("Nuestros Vehiculos");
		lblNuestrosVehiculos.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNuestrosVehiculos.setBounds(144, 48, 154, 33);
		panel3.add(lblNuestrosVehiculos);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(((AbstractButton) rdbtnNaveEspacial).isSelected()) {
					renta.setVehiculo(new naveEspacial("SpaceX"));
				}else {
					renta.setVehiculo(new avion("Boeing"));
				}

				CambiaPanel(panel3,panel4);
				
			}
		});
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAceptar.setBounds(160, 295, 105, 30);
		btnAceptar.setEnabled(false);
		panel3.add(btnAceptar);
		
		lblnave1 = new JLabel("");
		lblnave1.setBounds(63, 101, 124, 85);
		
		imagen2 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave1.png"));
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblnave1.getWidth()-10,lblnave1.getHeight(),Image.SCALE_DEFAULT));
        lblnave1.setIcon(icono2);	
        panel3.add(lblnave1);
		
		lblnave2 = new JLabel("");
		lblnave2.setBounds(266, 93, 124, 116);
		
		imagen3 = new ImageIcon(Ventana_principal.class.getResource("/Imagenes/Nave2.png"));
        icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblnave2.getWidth()-10,lblnave2.getHeight(),Image.SCALE_DEFAULT));
        lblnave2.setIcon(icono3);
		
        panel3.add(lblnave2);
		
        rdbtnNaveEspacial = new JRadioButton("Nave Espacial");
		rdbtnNaveEspacial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ValidarSeleccion(rdbtnNaveEspacial,rdbtnAvion,btnAceptar);

			}
		});
		rdbtnNaveEspacial.setBounds(40, 210, 130, 25);
		panel3.add(rdbtnNaveEspacial);
		
		rdbtnAvion = new JRadioButton("Avion");
		rdbtnAvion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ValidarSeleccion(rdbtnAvion,rdbtnNaveEspacial,btnAceptar);
				
			}
		});
		rdbtnAvion.setBounds(276, 210, 74, 25);
		panel3.add(rdbtnAvion);
		
		
		
		//PANEL4:............................................................................
		panel4 = new JPanel();
		panel4.setBounds(5, 15, 440, 340);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		lblElijaSuVehiculo1 = new JLabel("Proceso de Renta");
		lblElijaSuVehiculo1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo1.setBounds(108, 12, 223, 47);
		panel4.add(lblElijaSuVehiculo1);
		
		lblFechaInicioDe = new JLabel("Fecha inicio de renta:");
		lblFechaInicioDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaInicioDe.setBounds(128, 71, 169, 23);
		panel4.add(lblFechaInicioDe);
		
		lblFechaFinDe = new JLabel("Fecha fin de renta:");
		lblFechaFinDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaFinDe.setBounds(139, 140, 169, 23);
		panel4.add(lblFechaFinDe);
		
		dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(145, 106, 114, 23);
		panel4.add(dateChooserInicio);
		
		dateChooserfin = new JDateChooser();
		dateChooserfin.setBounds(145, 170, 114, 23);
		panel4.add(dateChooserfin);
		
		textFielPrecio = new JTextField();
		//textFielPrecio.setText("1823");
		textFielPrecio.setEditable(false);
		textFielPrecio.setBounds(125, 235, 86, 29);
		panel4.add(textFielPrecio);
		textFielPrecio.setColumns(10);
		
		lblPrecio = new JLabel("$");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPrecio.setBounds(115, 235, 23, 23);
		panel4.add(lblPrecio);
		
		lblsi = new JLabel("X");
		lblsi.setFont(new Font("Dialog", Font.BOLD, 17));
		lblsi.setBounds(212, 235, 23, 23);
		panel4.add(lblsi);
		
		textFielHoras = new JTextField();
		textFielHoras.setEditable(false);
		textFielHoras.setBounds(224, 235, 40, 29);
		panel4.add(textFielHoras);
		textFielHoras.setColumns(10);
		
		lblsiH = new JLabel("horas");
		lblsiH.setFont(new Font("Dialog", Font.BOLD, 13));
		lblsiH.setBounds(266, 235, 40, 30);
		panel4.add(lblsiH);
		
		btnCalcular=new JButton("Calcular");
		btnCalcular.setFont(new Font("Dialog",Font.BOLD,13));
		btnCalcular.setBounds(145, 205, 114, 23);
		panel4.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if((dateChooserInicio.getDate()!=null)&&(dateChooserfin.getDate()!=null))	{
					
					int horas=renta.calculaHoras(dateChooserInicio, dateChooserfin);
					
					if(Renta.validar(dateChooserInicio,dateChooserfin)) {
						textFielPrecio.setText(" "+renta.calculaPrecio(horas));
						textFielHoras.setText(" "+horas+" ");
						btnPagoConTargeta.setEnabled(true);
						btnPagoConEfectivo.setEnabled(true);
					
					}else
						JOptionPane.showMessageDialog(null, "Las fechas estan mal.");
						
				}else 
					JOptionPane.showMessageDialog(null, "Introduzca fechas");
				
			}
		});
		
		btnPagoConTargeta = new JButton("Pago con tarjeta");
		btnPagoConTargeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				CapturaDatos1();
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
					
				CapturaDatos1();
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
		
		lblNewLabel = new JLabel("Pago en efectivo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(109, 12, 218, 53);
		panel5.add(lblNewLabel);
		
		lblDatosDelCliente0 = new JLabel("Datos del cliente");
		lblDatosDelCliente0.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente0.setBounds(157, 62, 124, 17);
		panel5.add(lblDatosDelCliente0);
		
		lblNombre0 = new JLabel("Nombre:");
		lblNombre0.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre0.setBounds(70, 85, 60, 17);
		panel5.add(lblNombre0);
		
		
		lblCelular0 = new JLabel("Celular:");
		lblCelular0.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular0.setBounds(70, 129, 60, 17);
		panel5.add(lblCelular0);
		
		textFieldcel = new JTextField();
		textFieldcel.setBounds(134, 129, 164, 21);
		panel5.add(textFieldcel);
		textFieldcel.setColumns(10);
		
		textFieldnom1 = new JTextField();
		textFieldnom1.setColumns(10);
		textFieldnom1.setBounds(134, 85, 164, 21);
		panel5.add(textFieldnom1);
		
		btnAceptaE= new JButton("Capturar");
		btnAceptaE.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAceptaE.setBounds(167, 155, 105, 20);
		panel5.add(btnAceptaE);
		btnAceptaE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textFieldnom1.getText().isEmpty()&&!textFieldcel.getText().isEmpty()) {
					btnAceptar11.setEnabled(true);
					btnAceptaE.setEnabled(false);
					textFieldnom1.setEditable(false);
					textFieldcel.setEditable(false);
					renta.setNombreC(textFieldnom1.getText());
					renta.setCelularC(textFieldcel.getText());
					textField.setText(folio());

				}else {
					JOptionPane.showMessageDialog(null, "Ingrese los datos por favor.");
				}


			}
		});
		
		lblSeGeneroEl = new JLabel("Se genero el siguiente folio");
		lblSeGeneroEl.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSeGeneroEl.setBounds(127, 179, 189, 17);
		panel5.add(lblSeGeneroEl);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(158, 208, 115, 21);
		panel5.add(textField);
		textField.setColumns(10);
		
		lblDebidoASu = new JLabel("Debido a su metodo de pago no se generara comprobante");
		lblDebidoASu.setBounds(43, 241, 358, 17);
		panel5.add(lblDebidoASu);
		
		lblGuardeEsteFolio = new JLabel("almacene este folio para alcaraciones y reclamos");
		lblGuardeEsteFolio.setBounds(85, 261, 286, 17);
		panel5.add(lblGuardeEsteFolio);
		
		btnAceptar11 = new JButton("Aceptar");
		btnAceptar11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//metodo de guarda archivo
				CambiaPanel(panel5, panel9);
				btnImagen.setVisible(false);
			}
		});
		btnAceptar11.setEnabled(false);
		btnAceptar11.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAceptar11.setBounds(167, 290, 105, 27);
		panel5.add(btnAceptar11);
		
		//PANEL6:............................................................................
		
		panel6 = new JPanel();
		panel6.setBounds(5, 15, 440, 340);
		panel6.setLayout(null);
		panel6.setVisible(false);
		
		lbldatos = new JLabel("Datos personales y bancarios");
		lbldatos.setFont(new Font("Dialog", Font.BOLD, 20));
		lbldatos.setBounds(77, 12, 302, 34);
		panel6.add(lbldatos);
		
		lblDatosDelCliente = new JLabel("Datos del cliente");
		lblDatosDelCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente.setBounds(157, 62, 124, 17);
		panel6.add(lblDatosDelCliente);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre.setBounds(39, 100, 60, 17);
		panel6.add(lblNombre);
		
		lblCelular= new JLabel("Celular:");
		lblCelular.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular.setBounds(39, 144, 60, 17);
		panel6.add(lblCelular);
		
		textFieldcel2 = new JTextField();
		textFieldcel2.setBounds(134, 144, 164, 21);
		panel6.add(textFieldcel2);
		textFieldcel2.setColumns(10);
		
		textFieldnom2 = new JTextField();
		textFieldnom2.setColumns(10);
		textFieldnom2.setBounds(134, 100, 164, 21);
		panel6.add(textFieldnom2);
		
		lblNoDeTarjeta = new JLabel("No. tarjeta:");
		lblNoDeTarjeta.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNoDeTarjeta.setBounds(39, 187, 96, 17);
		panel6.add(lblNoDeTarjeta);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(134, 187, 164, 21);
		panel6.add(textFieldTarjeta);
		
		lblFechaDeExpiracion = new JLabel("Fecha de expiracion:");
		lblFechaDeExpiracion.setFont(new Font("Dialog", Font.BOLD, 13));
		lblFechaDeExpiracion.setBounds(39, 229, 136, 17);
		panel6.add(lblFechaDeExpiracion);
		
		dateChooserEXp = new JTextField();
		dateChooserEXp.setBounds(176, 229, 79, 21);
		panel6.add(dateChooserEXp);
		
		lblCvv = new JLabel("CVV");
		lblCvv.setBounds(277, 229, 34, 17);
		panel6.add(lblCvv);
		
		textFieldCVV = new JTextField();
		textFieldCVV.setBounds(314, 227, 65, 21);
		panel6.add(textFieldCVV);
		textFieldCVV.setColumns(10);
		
		btnAceptar1 = new JButton("Aceptar");
		btnAceptar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				if(!textFieldCVV.getText().isEmpty()&&!textFieldcel2.getText().isEmpty()&&!textFieldTarjeta.getText().isEmpty()&&!textFieldnom2.getText().isEmpty()&&!dateChooserEXp.getText().isEmpty()) {
					renta.setNombreC(textFieldnom2.getText());
					textFieldnom3.setText(renta.getNombreC());


					renta.setCelularC(textFieldcel2.getText());
					textFieldcel1.setText(renta.getCelulareC());
					
					textFieldTarjeta1.setText(textFieldTarjeta.getText());
					
					textFieldInicio.setText(sdf.format(renta.getDateInicio()));
					
					textFieldfinal.setText(sdf.format(renta.getDateFin()));
					
					textField7.setText(renta.getPrecio());
						
					
					CambiaPanel(panel6,panel7);	
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos");
				}

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
		
		lbldatos1 = new JLabel("Confirmacion de datos");
		lbldatos1.setFont(new Font("Dialog", Font.BOLD, 24));
		lbldatos1.setBounds(89, 11, 266, 34);
		panel7.add(lbldatos1);
		
		lblDatosDelCliente1 = new JLabel("Datos del cliente");
		lblDatosDelCliente1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente1.setBounds(157, 62, 124, 17);
		panel7.add(lblDatosDelCliente1);
		
		lblNombre1 = new JLabel("Nombre:");
		lblNombre1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre1.setBounds(39, 102, 60, 17);
		panel7.add(lblNombre1);
		
		lblCelular1 = new JLabel("Celular:");
		lblCelular1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular1.setBounds(39, 146, 60, 17);
		panel7.add(lblCelular1);
		
		textFieldcel1 = new JTextField();
		textFieldcel1.setEditable(false);
		textFieldcel1.setBounds(134, 144, 164, 21);
		panel7.add(textFieldcel1);
		textFieldcel1.setColumns(10);
		
		textFieldnom3 = new JTextField();
		textFieldnom3.setEditable(false);
		textFieldnom3.setColumns(10);
		textFieldnom3.setBounds(134, 100, 164, 21);
		panel7.add(textFieldnom3);
		
		lblNoDeTarjeta1 = new JLabel("No. tarjeta:");
		lblNoDeTarjeta1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNoDeTarjeta1.setBounds(39, 187, 96, 17);
		panel7.add(lblNoDeTarjeta1);
		
		textFieldTarjeta1 = new JTextField();
		textFieldTarjeta1.setEditable(false);
		textFieldTarjeta1.setColumns(10);
		textFieldTarjeta1.setBounds(134, 185, 164, 21);
		panel7.add(textFieldTarjeta1);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				renta.setContrato("El t�rmino del arrendamiento ser� por "+renta.getVehiculo().getModelo()+" a nombre del C. "
						+renta.getNombreC()+" con numero de celular: "+renta.getCelulareC()+". Dicho termino se extiende de "
						+sdf.format(renta.getDateInicio())+" al "+sdf.format(renta.getDateFin())+" a razon del total de "+renta.getHoraR()
						+" horas.\n"+"El arrendador lleva obligacion de responder con da�os y prejuicios en caso de:\n\tAccidentes de menor y mayor da�o"
								+ "\n\tDa�os a terceros.\nAsi pues, se extiende de la misma manera la obligacion de cumplir con el regreso integro del bien."
								+ "\n\nObligaciones del arrendador es cumplir con el contrato.");
				textPaneContrato.setText(renta.getContrato());
				
				btnImagen.setVisible(false);
				CambiaPanel(panel7,panel8);

			}
		});
		btnContinuar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnContinuar.setBounds(167, 301, 105, 27);
		panel7.add(btnContinuar);
		
		lblVehiculo = new JLabel("Vehiculo:");
		lblVehiculo.setBounds(341, 76, 60, 17);
		panel7.add(lblVehiculo);
		
		lblInicio = new JLabel("Inicio:");
		lblInicio.setBounds(39, 230, 60, 17);
		panel7.add(lblInicio);
		
		lblFinal = new JLabel("final:");
		lblFinal.setBounds(39, 259, 60, 17);
		panel7.add(lblFinal);
		
		lblPrecio1 = new JLabel("Precio:");
		lblPrecio1.setBounds(224, 250, 60, 17);
		panel7.add(lblPrecio1);
		
		textField7 = new JTextField();
		textField7.setEditable(false);
		textField7.setBounds(287, 245, 85, 27);
		panel7.add(textField7);
		textField7.setColumns(10);
		
		textFieldInicio = new JTextField();
		textFieldInicio.setEditable(false);
		textFieldInicio.setBounds(89, 228, 86, 20);
		panel7.add(textFieldInicio);
		textFieldInicio.setColumns(10);
		
		textFieldfinal = new JTextField();
		textFieldfinal.setEditable(false);
		textFieldfinal.setBounds(89, 258, 86, 20);
		panel7.add(textFieldfinal);
		textFieldfinal.setColumns(10);
		
		panelImagen1 = new JPanel();
		panelImagen1.setBounds(308, 102, 122, 102);
		panel7.add(panelImagen1);
		panelImagen1.setLayout(new BorderLayout(0, 0));
		
		lblVehiculoIco_1 = new JLabel("");
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
		
		textPaneContrato = new JTextPane();
		textPaneContrato.setEditable(false);
		textPaneContrato.setBounds(31, 58, 369, 190);
		panel8.add(textPaneContrato);
		
		lblContrato = new JLabel("CONTRATO");
		lblContrato.setFont(new Font("Aharoni", Font.PLAIN, 30));
		lblContrato.setBounds(31, 17, 202, 49);
		panel8.add(lblContrato);
		
		HeLeido = new JCheckBox("He leido el contrato y estoy de acuerdo");
		HeLeido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAceptarygenerar.setEnabled(true);
			}
		});
		HeLeido.setBounds(84, 263, 280, 23);
		panel8.	add(HeLeido);
		
		btnAceptarygenerar = new JButton("Aceptar y generar archivo");
		btnAceptarygenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				CambiaPanel(panel8,panel9);
			}
		});
		btnAceptarygenerar.setEnabled(false);
		btnAceptarygenerar.setBounds(107, 293, 210, 23);
		panel8.add(btnAceptarygenerar);
		
		
		
		//PANEL9:............................................................................

		panel9 = new JPanel();
		panel9.setBounds(5, 15, 440, 340);
		panel9.setLayout(null);
		panel9.setVisible(false);
		
		lblgracias = new JLabel("Gracias por rentar en");
		lblgracias.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblgracias.setBounds(58, 35, 319, 46);
		panel9.add(lblgracias);
		
		lblrapi = new JLabel("RAPIMOV");
		lblrapi.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblrapi.setBounds(140, 74, 162, 55);
		panel9.add(lblrapi);
		
		btnFin = new JButton("Finalizar");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldAlgo.setText("");
				textFieldcel.setText("");
				textFieldnom2.setText("");
				textField.setText("");
				textFieldTarjeta.setText("");
				textFieldCVV.setText("");
				textFieldfinal.setText("");
				textFieldInicio.setText("");
				textField7.setText("");
				textFieldTarjeta1.setText("");
				textFieldnom1.setText("");
				textFieldcel1.setText("");
				dateChooserEXp.setText("");
				textFielHoras.setText("");
				textFieldnom3.setText("");
				textFieldcel2.setText("");
				textFielPrecio.setText("");
				
				CambiaPanel(panel9,panel1);
				
				tglbtnInicio.setVisible(true);
				tglbtnRentasAnteriores.setVisible(true);
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
		
		lblAnteriores = new JLabel("Vehiculos rentados");
		lblAnteriores.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAnteriores.setBounds(96, 40, 246, 44);
		panel10.add(lblAnteriores);
		
		tableRentados = new JTable();
		tableRentados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tableRentados.setBounds(389, 277, -327, -165);
		panel10.add(tableRentados);
		
	}
	
	
	private void CambiaPanel(JPanel a,JPanel b) {
					//para que funcione el boton de regresar
		panelaux=b;
		
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
	
	private void CapturaDatos1() {
		renta.setDateInicio(dateChooserInicio);
		renta.setDateFin(dateChooserfin);
		renta.setHoraR(textFielHoras.getText());
		renta.setPrecio(textFielPrecio.getText());
	}
	
	public String folio() {
		char [] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

		// Longitud del array de char.
		int charsLength = chars.length;

		// Instanciamos la clase Random
		Random random = new Random();

		// Un StringBuffer para componer la cadena aleatoria de forma eficiente
		StringBuffer buffer = new StringBuffer();

		// Bucle para elegir una cadena de 10 caracteres al azar
		for (int i=0;i<10;i++){

		   // A�adimos al buffer un caracter al azar del array
		   buffer.append(chars[random.nextInt(charsLength)]);
		}
		
		return buffer.toString();
	}
	
	
}






