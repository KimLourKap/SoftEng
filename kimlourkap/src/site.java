

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





public class site extends JFrame {

	private JPanel contentPane;

	public site() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnLogIn = new JButton("log in");
		btnLogIn.setBounds(393, 11, 89, 23);
		contentPane.add(btnLogIn);

		JButton btnLogOut = new JButton("log out");
		btnLogOut.setBounds(492, 11, 89, 23);
		contentPane.add(btnLogOut);

		JButton btnSignUp = new JButton("sign up");
		btnSignUp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			    JTextField username = new JTextField(5);
			       JTextField pass = new JTextField(5);
			    
			       JPanel myPanel = new JPanel();
			         myPanel.add(new JLabel("Username:"));
			         myPanel.add(username);
			         myPanel.add(Box.createHorizontalStrut(15)); // a spacer
			         myPanel.add(new JLabel("Password:"));
			         myPanel.add(pass);
			         
			        int result = JOptionPane.showConfirmDialog(null, myPanel, 
			                  "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
			        
			        String UserName = username.getText();
			        String Password = pass.getText();
			        
			        if (result == JOptionPane.OK_OPTION) {
			            System.out.println("Username " + UserName);
			            System.out.println("Password: " + Password);
			         }
			   }
			  });
			
		
		btnSignUp.setBounds(10, 11, 89, 23);
		contentPane.add(btnSignUp);

		JButton btnReview1 = new JButton("Make Review");
		btnReview1.setBounds(142, 202, 120, 23);
		contentPane.add(btnReview1);






		final ImageIcon icon1 = 
				new ImageIcon(getClass().getResource("\\resources\\icon1.png"));
		final ImageIcon icon2 = 
				new ImageIcon(getClass().getResource("\\resources\\icon2.png"));

		JLabel label1 = new JLabel();
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setIcon(icon1);
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.setBounds(10, 39, 252, 142);
		contentPane.add(panel1);
		panel1.add(label1, BorderLayout.CENTER);

		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 226, 252, 141);
		contentPane.add(scrollPane1);

		JTextArea textArea1 = new JTextArea();
		textArea1.setLineWrap(true);
		textArea1.setEditable(false);
		textArea1.setRows(20);
		scrollPane1.setViewportView(textArea1);
		
		JButton btnReview2 = new JButton("Make Review");
		btnReview2.setBounds(461, 202, 120, 23);
		contentPane.add(btnReview2);

		JLabel label2 = new JLabel();
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setIcon(icon2);
		JPanel panel2 = new JPanel();
		panel2.setBounds(329, 39, 252, 142);
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		panel2.add(label2);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(329, 226, 252, 141);
		contentPane.add(scrollPane2);

		JTextArea textArea2 = new JTextArea();
		textArea2.setRows(20);
		scrollPane2.setViewportView(textArea2);
		textArea2.setEditable(false);
		textArea2.setLineWrap(true);		
		textArea2.setText("");

		JLabel labelDescrip1 = new JLabel("\u039D\u03AD\u03B1 \u03C3\u03B5\u03B9\u03C1\u03AC " +
				"\u03C4\u03C1\u03BF\u03C6\u03BF\u03B4\u03BF\u03C4\u03B9\u03BA\u03CE\u03BD Builder V2 \u03C4\u03B7\u03C2 Corsair");
		labelDescrip1.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescrip1.setBounds(0, 183, 270, 14);
		contentPane.add(labelDescrip1);

		JLabel labelDescrip2 = new JLabel("H \u03BD\u03AD\u03B1 \u03BA\u03AC\u03C1\u03C4\u03B1" +
				" \u03B3\u03C1\u03B1\u03C6\u03B9\u03BA\u03CE\u03BD HD 7770 \u03C4\u03B7\u03C2 Sapphire");
		labelDescrip2.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescrip2.setBounds(318, 183, 270, 14);
		contentPane.add(labelDescrip2);
		
		
	}


}
