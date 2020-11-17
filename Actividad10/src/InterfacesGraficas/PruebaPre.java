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
		lblFechaFinDe.setBounds(153, 142, 169, 23);
		add(lblFechaFinDe);
		
		textFielPrecio = new JTextField();
		textFielPrecio.setBounds(184, 224, 86, 29);
		add(textFielPrecio);
		textFielPrecio.setColumns(10);
		
		JLabel lblPrecio = new JLabel("$");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPrecio.setBounds(166, 225, 23, 23);
		add(lblPrecio);
		
		JButton btnPagoConTargeta = new JButton("Pago con targeta");
		btnPagoConTargeta.setEnabled(false);
		btnPagoConTargeta.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConTargeta.setBounds(40, 284, 149, 27);
		add(btnPagoConTargeta);
		
		JButton btnPagoConEfectivo = new JButton("Pago con efectivo");
		btnPagoConEfectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnPagoConEfectivo.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPagoConEfectivo.setBounds(248, 284, 149, 27);
		add(btnPagoConEfectivo);
		
		dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(166, 106, 114, 23);
		add(dateChooserInicio);
		
		dateChooserfin = new JDateChooser();
		dateChooserfin.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(dateChooserInicio.isVisible()) {
					
					textFielPrecio.setText("3000");
				}
			}
		});
		dateChooserfin.setBounds(166, 177, 114, 23);
		add(dateChooserfin);
		
		

	}
}
