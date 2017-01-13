package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import verwaltung.LoginVerwaltung;

public class GUILogin implements ActionListener{

	public JFrame jFrame = new JFrame("Waegelitourclubverwaltung");
	public LoginVerwaltung management = new LoginVerwaltung();
        
        JLabel lblUsername = new JLabel("Nutzername: ");
        JLabel lblPassword = new JLabel("Passwort: ");
        JLabel lblLoginHeader = new JLabel("Anmelden");
        JTextField txfUsername = new JTextField();
        JPasswordField txfPassword = new JPasswordField();
        JButton btnLogin = new JButton("Login");
        
	public void baueGUI() {
		
		jFrame.setSize(400, 300);
		jFrame.setLayout(null);
                
                lblUsername.setBounds(100, 100, 100, 20);
                lblPassword.setBounds(100, 125, 100, 20);
                lblLoginHeader.setBounds(150, 75, 100, 20);
                txfUsername.setBounds(200, 100, 100, 20);
                txfPassword.setBounds(200, 125, 100, 20);
                btnLogin.setBounds(150, 150, 100, 20);
                
                btnLogin.addActionListener(this);
                
                jFrame.add(lblUsername);
                jFrame.add(lblPassword);
                jFrame.add(lblLoginHeader);
                jFrame.add(txfUsername);
                jFrame.add(txfPassword);
                jFrame.add(btnLogin);
                
                jFrame.setMinimumSize(new Dimension(400, 300));
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btnLogin) {
            management.login(this.txfUsername.getText(), this.txfPassword.getText());
        }
    }
}
