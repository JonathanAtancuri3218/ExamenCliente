package ec.ups.edu.g1.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.ups.edu.g1.negocio.GestionSolicitudONRemoto;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
public class VentanaIngresoSolicitud extends JFrame {

	private JPanel contentPane;
	private GestionSolicitudONRemoto on;
	private JTextField txtNumero;
	private JTextField txtCedula;
	private JTextField textField_2;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoSolicitud frame = new VentanaIngresoSolicitud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaIngresoSolicitud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 11, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(100, 57, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 100, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(219, 56, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("#Solicitud");
		lblNewLabel.setBounds(10, 14, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCedula = new JLabel("cedula");
		lblCedula.setBounds(10, 60, 67, 14);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(10, 103, 67, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 152, 86, 20);
		contentPane.add(textField);
		
		JLabel lblNombre_1 = new JLabel("nombre");
		lblNombre_1.setBounds(10, 155, 67, 14);
		contentPane.add(lblNombre_1);
	}
	
	public void referenciarONSolicitud() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8081");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "root");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "root");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/parqueadero/GestionTicketON!ec.ups.edu.g1.parqueadero.negocio.GestionTicketOnRemoto";  
              
            this.on = (GestionSolicitudONRemoto) context.lookup(lookupName);  
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	} 
}
