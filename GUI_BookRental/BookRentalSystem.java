
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookRentalSystem {

	public static void Login() {
		 
		JFrame libraryManagement = new JFrame("Ebook Rental");    
		JPanel homePanel = new JPanel();
		JLabel libraryManagementLabel = new JLabel("Login to borrow a book !");
		JButton adminButton = new JButton("Admin Login");
		JButton librarianButton = new JButton("Librarian Login");
		
		libraryManagementLabel.setBounds(170, 30, 220, 60);
		libraryManagementLabel.setLayout(null);
		libraryManagementLabel.setFont(new Font("Times", Font.BOLD, 18));    
		
		adminButton.setBounds(180, 100, 150, 40);
		adminButton.setFocusable(false);
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagement.dispose();
				adminLoginPage();
			}
		});
		
		librarianButton.setBounds(180, 160, 150, 40);
		librarianButton.setFocusable(false);
		librarianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagement.dispose();
				librarianLoginPage();
			}
		});
		
		homePanel.setLayout(null);
		homePanel.add(libraryManagementLabel);
		homePanel.add(adminButton);
		homePanel.add(librarianButton);
		
		
		libraryManagement.setLocation(500, 200);
		libraryManagement.setSize(500 , 350);
		libraryManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryManagement.setLayout(null);
		libraryManagement.setVisible(true);	
		libraryManagement.add(homePanel);
		libraryManagement.add(libraryManagementLabel);
		libraryManagement.add(adminButton);
		libraryManagement.add(librarianButton);
	}
	
	public static void adminLoginPage() {
		
		JFrame adminLoginFrame = new JFrame("Admin Login");
		JPanel adminFramePanel = new JPanel();
		JLabel adminUser = new JLabel("Username:");
		JLabel adminPass = new JLabel("Password:");
		JTextField adminUserTxt = new JTextField();
		JPasswordField adminPassTxt = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		adminUser.setBounds(50, 95, 80, 25);
		adminPass.setBounds(50, 140, 80, 25);
		
	
		adminUserTxt.setLayout(null);
		adminUserTxt.setBounds(120, 95, 200, 25);
		adminPassTxt.setLayout(null);
		adminPassTxt.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = adminUserTxt.getText();
				String password = adminPassTxt.getText();
				
				if ((username.equals("Admin_01") && password.equals("AdminOne")) || (username.equals("Admin_02") && password.equals("AdminTwo")) || (username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "SUCCESFULLY LOGIN");
					adminLoginFrame.dispose();
					adminModule();

				} else if ((!username.equals("Admin_01") && password.equals("AdminOne")) || (!username.equals("Admin_02") && password.equals("AdminTwo")) || (!username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME");
					
				} else if ((username.equals("Admin_01") && !password.equals("AdminOne")) || (username.equals("Admin_02") && !password.equals("AdminTwo")) || (username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT PASSWORD");
					
				} else if ((!username.equals("Admin_01") && !password.equals("AdminOne")) || (!username.equals("Admin_02") && !password.equals("AdminTwo")) || (!username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME and PASSWORD");
					
				} 
			}
		});
		

		adminFramePanel.setLayout(null);
		adminFramePanel.add(adminUser);
		adminFramePanel.add(adminPass);
		adminFramePanel.add(adminUserTxt);
		adminFramePanel.add(adminPassTxt);
		adminFramePanel.add(loginButton);
		
		adminLoginFrame.setLocation(400, 100);
		adminLoginFrame.setSize(400, 300);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLoginFrame.setLayout(null);
		adminLoginFrame.setVisible(true);
		adminLoginFrame.add(adminFramePanel);
		adminLoginFrame.add(adminUser);
		adminLoginFrame.add(adminPass);
		adminLoginFrame.add(adminUserTxt);
		adminLoginFrame.add(adminPassTxt);
		adminLoginFrame.add(loginButton);
		
	}
	
	public static void librarianLoginPage() {
		
		JFrame librarianLoginFrame = new JFrame("Librarian Login");
		JPanel librarianFramePanel = new JPanel();
		JLabel librarianUser = new JLabel("Username:");
		JLabel librarianPass = new JLabel("Password:");
		JTextField librarianUserTxt = new JTextField();
		JPasswordField librarianPassTxt = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		librarianUser.setBounds(50, 95, 80, 25);
		librarianPass.setBounds(50, 140, 80, 25);
		
		librarianUserTxt.setLayout(null);
		librarianUserTxt.setBounds(120, 95, 200, 25);
		librarianPassTxt.setLayout(null);
		librarianPassTxt.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
        
			public void actionPerformed(ActionEvent e) {
				String username = librarianUserTxt.getText();
				String password = librarianPassTxt.getText();
				
				if ((username.equals("Librarian_01") && password.equals("LibOne")) || (username.equals("Librarian_02") && password.equals("LibTwo")) || (username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "SUCCESFULLY LOGIN");
					librarianLoginFrame.dispose();
			
				} else if ((!username.equals("Librarian_01") && password.equals("LibOne")) || (!username.equals("Librarian_02") && password.equals("LibTwo")) || (!username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Librarian_01") && !password.equals("LibOne")) || (username.equals("Librarian_02") && !password.equals("LibTwo")) || (username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Librarian_01") && !password.equals("LibOne")) || (!username.equals("Librarian_02") && !password.equals("LibTwo")) || (!username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		
		librarianFramePanel.setLayout(null);
		librarianFramePanel.add(librarianUser);
		librarianFramePanel.add(librarianPass);
		librarianFramePanel.add(librarianUserTxt);
		librarianFramePanel.add(librarianPassTxt);
		librarianFramePanel.add(loginButton);
		
		librarianLoginFrame.setLocation(400, 100);
		librarianLoginFrame.setSize(400, 300);
		librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianLoginFrame.setLayout(null);
		librarianLoginFrame.setVisible(true);
		librarianLoginFrame.add(librarianFramePanel);
		librarianLoginFrame.add(librarianUser);
		librarianLoginFrame.add(librarianPass);
		librarianLoginFrame.add(librarianUserTxt);
		librarianLoginFrame.add(librarianPassTxt);
		librarianLoginFrame.add(loginButton);
		
	}
	
	public static void adminModule() {
		
		JFrame adminModuleFrame = new JFrame("Admin Page");
		JPanel adminModulePanel = new JPanel();
		JLabel adminModuleText = new JLabel(" ✧ Welcome to NU Library System ! ✧");
		
		adminModulePanel.setLayout(null);
		adminModulePanel.add(adminModuleText);
		
		adminModuleText.setBounds(90, 100, 300, 40);
		adminModuleText.setLayout(null);
		adminModuleText.setFont(new Font("Times", Font.PLAIN, 16));
		
		adminModuleFrame.setLocation(400, 100);
		adminModuleFrame.setSize(400, 300);
		adminModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminModuleFrame.setLayout(null);
		adminModuleFrame.setVisible(true);
		adminModuleFrame.add(adminModulePanel);
		adminModuleFrame.add(adminModuleText);
	}
	
	public static void main(String[] args) {
		Login();
		
	}
}
