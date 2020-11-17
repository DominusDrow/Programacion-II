package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class PruebaPanel extends JPanel {
	private JTextField textFieldTarjeta;
	private JTextField textField;

	
	public PruebaPanel() {

		setBounds(5, 15, 440, 340);
		setLayout(null);
		setVisible(false);
		
		
		JLabel lbldatos = new JLabel("Datos personales y bancarios");
		lbldatos.setFont(new Font("Dialog", Font.BOLD, 20));
		lbldatos.setBounds(77, 12, 302, 34);
		add(lbldatos);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del cliente");
		lblDatosDelCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatosDelCliente.setBounds(157, 62, 115, 17);
		add(lblDatosDelCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre.setBounds(39, 102, 60, 17);
		add(lblNombre);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCelular.setBounds(39, 146, 60, 17);
		add(lblCelular);
		
		JTextField textFieldcel = new JTextField();
		textFieldcel.setBounds(134, 144, 164, 21);
		add(textFieldcel);
		textFieldcel.setColumns(10);
		
		JTextField textFieldnom = new JTextField();
		textFieldnom.setColumns(10);
		textFieldnom.setBounds(134, 100, 164, 21);
		add(textFieldnom);
		
		JLabel lblNoDeTarjeta = new JLabel("No. tarjeta");
		lblNoDeTarjeta.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNoDeTarjeta.setBounds(39, 187, 96, 17);
		add(lblNoDeTarjeta);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(134, 185, 164, 21);
		add(textFieldTarjeta);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnContinuar.setBounds(167, 301, 105, 27);
		add(btnContinuar);
		
		JLabel lblVehiculo = new JLabel("Vehiculo");
		lblVehiculo.setBounds(341, 76, 60, 17);
		add(lblVehiculo);
		
		JLabel lblVehiculoIco = new JLabel("");
		lblVehiculoIco.setBounds(319, 107, 95, 84);
		add(lblVehiculoIco);
		
		JLabel lblInicio = new JLabel("Inicio:");
		lblInicio.setBounds(39, 230, 60, 17);
		add(lblInicio);
		
		JDateChooser dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(94, 230, 79, 21);
		add(dateChooserInicio);
		
		JLabel lblFinal = new JLabel("final:");
		lblFinal.setBounds(39, 259, 60, 17);
		add(lblFinal);
		
		JDateChooser dateChooserfinal = new JDateChooser();
		dateChooserfinal.setBounds(94, 259, 79, 21);
		add(dateChooserfinal);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(224, 250, 60, 17);
		add(lblPrecio);
		
		textField = new JTextField();
		textField.setBounds(287, 245, 85, 27);
		add(textField);
		textField.setColumns(10);
		
		
		
		
		//::::::::::::::::::::::::::::::::
		
		
		
	}
}
