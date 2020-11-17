package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaPre extends JPanel {
	private JTextField textFielPrecio;
	
	JDateChooser dateChooserInicio;
	JDateChooser dateChooserfin;
	private JTextField textFieldcel;
	private JTextField textFieldnom;
	private JTextField textField;
	
	public PruebaPre() {
		
	
		new JPanel();
		setBounds(0, 0, 440, 340);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pago en efectivo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(109, 12, 218, 53);
		add(lblNewLabel);
		
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
		
		textFieldcel = new JTextField();
		textFieldcel.setBounds(134, 144, 164, 21);
		add(textFieldcel);
		textFieldcel.setColumns(10);
		
		textFieldnom = new JTextField();
		textFieldnom.setColumns(10);
		textFieldnom.setBounds(134, 100, 164, 21);
		add(textFieldnom);
		
		JLabel lblSeGeneroEl = new JLabel("Se genero el siguiente folio");
		lblSeGeneroEl.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSeGeneroEl.setBounds(127, 179, 189, 17);
		add(lblSeGeneroEl);
		
		textField = new JTextField();
		textField.setBounds(158, 208, 115, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDebidoASu = new JLabel("Debido a su metodo de pago no se generara comprobante");
		lblDebidoASu.setBounds(43, 241, 358, 17);
		add(lblDebidoASu);
		
		JLabel lblGuardeEsteFolio = new JLabel("guarde este folio para alcaraciones y reclamos");
		lblGuardeEsteFolio.setBounds(85, 261, 286, 17);
		add(lblGuardeEsteFolio);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAceptar.setBounds(167, 290, 105, 27);
		add(btnAceptar);
		setVisible(false);
		
		
		

	}
}
