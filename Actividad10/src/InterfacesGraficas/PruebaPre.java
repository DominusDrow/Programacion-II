package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Component;

public class PruebaPre extends JPanel {
	
	private JRadioButton rdbtnNaveEspacial;
	private JRadioButton rdbtnAvion;
	
	private JButton btnAceptar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textFielPrecio;
	
	public PruebaPre() {
		
	
		new JPanel();
		setBounds(0, 0, 440, 340);
		setLayout(null);
		setVisible(false);
		
		JLabel lblElijaSuVehiculo = new JLabel("Proceso de Renta");
		lblElijaSuVehiculo.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo.setBounds(108, 12, 223, 47);
		add(lblElijaSuVehiculo);
		
		JLabel lblFechaInicioDe = new JLabel("Fecha inicio de renta:");
		lblFechaInicioDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaInicioDe.setBounds(139, 71, 169, 23);
		add(lblFechaInicioDe);
		
		JLabel lblFechaFinDe = new JLabel("Fecha fin de renta:");
		lblFechaFinDe.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFechaFinDe.setBounds(149, 147, 169, 23);
		add(lblFechaFinDe);
		
		textField = new JTextField();
		textField.setBounds(139, 106, 50, 29);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 106, 50, 29);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(248, 106, 50, 29);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 174, 50, 29);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(192, 174, 50, 29);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(248, 174, 50, 29);
		add(textField_5);
		
		textFielPrecio = new JTextField();
		textFielPrecio.setBounds(184, 224, 86, 29);
		add(textFielPrecio);
		textFielPrecio.setColumns(10);
		
		JLabel lblPrecio = new JLabel("$");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPrecio.setBounds(166, 225, 23, 23);
		add(lblPrecio);
		
		JButton btnPagoConTargeta = new JButton("Pago con targeta");
		btnPagoConTargeta.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConTargeta.setBounds(40, 284, 149, 27);
		add(btnPagoConTargeta);
		
		JButton btnPagoConEfectivo = new JButton("Pago con efectivo");
		btnPagoConEfectivo.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConEfectivo.setBounds(248, 284, 149, 27);
		add(btnPagoConEfectivo);
		
		
		
		
		

	}
}
