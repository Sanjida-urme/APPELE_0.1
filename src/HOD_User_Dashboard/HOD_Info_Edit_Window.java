package HOD_User_Dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HOD_Info_Edit_Window {

	private JFrame frame;
	private JPasswordField HOD_passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOD_Info_Edit_Window window = new HOD_Info_Edit_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HOD_Info_Edit_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 865, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel HOD_info_label = new JLabel("Edit your Info");
		HOD_info_label.setForeground(new Color(75, 0, 130));
		HOD_info_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		HOD_info_label.setBounds(22, 11, 235, 53);
		frame.getContentPane().add(HOD_info_label);
		
		JLabel HOD_Name_lbl = new JLabel("Name");
		HOD_Name_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		HOD_Name_lbl.setForeground(Color.DARK_GRAY);
		HOD_Name_lbl.setBounds(55, 130, 27, 22);
		frame.getContentPane().add(HOD_Name_lbl);
		
		JLabel HOD_ID_lbl = new JLabel("ID");
		HOD_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		HOD_ID_lbl.setForeground(Color.DARK_GRAY);
		HOD_ID_lbl.setBounds(55, 155, 27, 22);
		frame.getContentPane().add(HOD_ID_lbl);
		
		JLabel HOD_Department_lbl = new JLabel("Department");
		HOD_Department_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		HOD_Department_lbl.setForeground(Color.DARK_GRAY);
		HOD_Department_lbl.setBounds(55, 195, 121, 22);
		frame.getContentPane().add(HOD_Department_lbl);
		
		JLabel HOD_Password_lbl = new JLabel("Password");
		HOD_Password_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		HOD_Password_lbl.setForeground(Color.DARK_GRAY);
		HOD_Password_lbl.setBounds(55, 246, 121, 22);
		frame.getContentPane().add(HOD_Password_lbl);
		
		
		
		JComboBox HOD_Department_combo = new JComboBox();
		HOD_Department_combo.setToolTipText("Your department.");
		HOD_Department_combo.setForeground(new Color(0, 51, 51));
		HOD_Department_combo.setFont(new Font("Hemi Head Rg", Font.PLAIN, 16));
		HOD_Department_combo.setModel(new DefaultComboBoxModel(new String[] {"CSE", "CSSE", "SE", "MATHMETICS", "ENGLISH", "SOCIAL STUDIES"}));
		HOD_Department_combo.setBounds(196, 198, 208, 20);
		frame.getContentPane().add(HOD_Department_combo);
		
		JPanel HOD_Picture_Panel = new JPanel();
		HOD_Picture_Panel.setToolTipText("Here your Image.");
		HOD_Picture_Panel.setBounds(596, 34, 155, 154);
		frame.getContentPane().add(HOD_Picture_Panel);
		
		JPanel HOD_Sign_panel = new JPanel();
		HOD_Sign_panel.setToolTipText("Your Signeture.");
		HOD_Sign_panel.setBounds(596, 236, 155, 70);
		frame.getContentPane().add(HOD_Sign_panel);
		
		JButton HOD_info_Edit_btn = new JButton("Edit Info");
		HOD_info_Edit_btn.setBackground(Color.GRAY);
		HOD_info_Edit_btn.setForeground(Color.WHITE);
		HOD_info_Edit_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		HOD_info_Edit_btn.setToolTipText("Click here for Edit your info.");
		HOD_info_Edit_btn.setBounds(55, 300, 127, 43);
		frame.getContentPane().add(HOD_info_Edit_btn);
		

		JButton Browse_forpicture_btn = new JButton("Browse");
		Browse_forpicture_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				JFrame parent = null;
				int result2 = fileChooser.showOpenDialog(parent);
				if (result2 == JFileChooser.APPROVE_OPTION) {
				    // user selects a file
					File selectedFile = fileChooser.getSelectedFile();
					//File selectedFile1 = fileChooser_for_sign.getSelectedFile();
					
					ImageIcon image2 = new ImageIcon(selectedFile.getAbsolutePath());
					JLabel label2 = new JLabel(image2);
				
					HOD_Picture_Panel.add(label2);
				    //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				}
				
			}
		});
		Browse_forpicture_btn.setToolTipText("Browse for you'r profile Picture.");
		Browse_forpicture_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Browse_forpicture_btn.setBounds(596, 199, 99, 23);
		frame.getContentPane().add(Browse_forpicture_btn);
		
		JButton Browse_forSign_btn = new JButton("Browse");
		Browse_forSign_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JFileChooser fileChooser_for_sign = new JFileChooser();
				fileChooser_for_sign.setCurrentDirectory(new File(System.getProperty("user.home")));
				JFrame parent1 = null;
				int result1 = fileChooser_for_sign.showOpenDialog(parent1);
				if (result1 == JFileChooser.APPROVE_OPTION) {
				    // user selects a file
					File selectedFile1 = fileChooser_for_sign.getSelectedFile();
					
					ImageIcon image = new ImageIcon(selectedFile1.getAbsolutePath());
					JLabel label = new JLabel(image);
				
					HOD_Sign_panel.add(label);
					//System.out.println("Selected file: " + selectedFile1.getAbsolutePath());

						
						}


				}
			
		});
		Browse_forSign_btn.setToolTipText("Browse for you'r Signeture.");
		Browse_forSign_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Browse_forSign_btn.setBounds(596, 314, 99, 23);
		frame.getContentPane().add(Browse_forSign_btn);
		
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frame.getContentPane().add(Back_btn);
		
		HOD_passwordField = new JPasswordField();
		HOD_passwordField.setBounds(196, 249, 208, 20);
		frame.getContentPane().add(HOD_passwordField);
		
		textField = new JTextField();
		textField.setBounds(196, 152, 208, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	
	}
}
