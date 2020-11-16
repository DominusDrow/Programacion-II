package InterfacesGraficas;

import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana_principal extends JFrame{

	private JPanel Contenedor;
	private JPanel panel1; 
	private JPanel panel2; 
	private JPanel panel3; 
	
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
		btnRentar.setBounds(161, 220, 105, 27);
		btnRentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CambiaPanel(panel1,panel2);
			}
		});
		panel1.setLayout(null);
		panel1.add(btnRentar);
		
		
		
		
		
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 440, 340);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		JLabel lblElijaSuVehiculo = new JLabel("Elija su vehiculo:");
		lblElijaSuVehiculo.setFont(new Font("Dialog", Font.BOLD, 25));
		lblElijaSuVehiculo.setBounds(112, 12, 223, 47);
		panel3.add(lblElijaSuVehiculo);
		
		
		
		
		
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
		
		
		
	}
	
	public void CambiaPanel(JPanel a,JPanel b) {
		
		a.setVisible(false);		//cambia el panel a por el panel b
		b.setVisible(true);	
		Contenedor.add(b);
		Contenedor.validate();
	}
}





