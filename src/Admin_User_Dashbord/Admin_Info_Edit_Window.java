package Admin_User_Dashbord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class Admin_Info_Edit_Window {

	public JFrame frame;
	private JTextField Admin_Id_txtfild;
	private JPasswordField Admin_passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Info_Edit_Window window = new Admin_Info_Edit_Window();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Info_Edit_Window() {
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
		
		JLabel Admin_info_label = new JLabel("Admin Info");
		Admin_info_label.setForeground(new Color(75, 0, 130));
		Admin_info_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		Admin_info_label.setBounds(22, 11, 166, 53);
		frame.getContentPane().add(Admin_info_label);
		
		JLabel Admin_Name_lbl = new JLabel("Name");
		Admin_Name_lbl.setFont(new Font("Forvertz", Font.PLAIN, 22));
		Admin_Name_lbl.setForeground(Color.DARK_GRAY);
		Admin_Name_lbl.setBounds(22, 60, 303, 32);
		frame.getContentPane().add(Admin_Name_lbl);
		
		JLabel Admin_ID_lbl = new JLabel("ID");
		Admin_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_ID_lbl.setForeground(Color.DARK_GRAY);
		Admin_ID_lbl.setBounds(55, 130, 27, 22);
		frame.getContentPane().add(Admin_ID_lbl);
		
		JLabel Admin_Department_lbl = new JLabel("Department");
		Admin_Department_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_Department_lbl.setForeground(Color.DARK_GRAY);
		Admin_Department_lbl.setBounds(55, 195, 121, 22);
		frame.getContentPane().add(Admin_Department_lbl);
		
		JLabel Admin_Password_lbl = new JLabel("Password");
		Admin_Password_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_Password_lbl.setForeground(Color.DARK_GRAY);
		Admin_Password_lbl.setBounds(55, 246, 121, 22);
		frame.getContentPane().add(Admin_Password_lbl);
		
		Admin_Id_txtfild = new JTextField();
		Admin_Id_txtfild.setToolTipText("Your User ID");
		Admin_Id_txtfild.setEditable(false);
		Admin_Id_txtfild.setBounds(196, 127, 208, 32);
		frame.getContentPane().add(Admin_Id_txtfild);
		Admin_Id_txtfild.setColumns(10);
		
		JComboBox Admin_Department_combo = new JComboBox();
		Admin_Department_combo.setToolTipText("Your department.");
		Admin_Department_combo.setForeground(new Color(0, 51, 51));
		Admin_Department_combo.setFont(new Font("Hemi Head Rg", Font.PLAIN, 16));
		Admin_Department_combo.setModel(new DefaultComboBoxModel(new String[] {"CSE", "CSSE", "SE", "MATHMETICS", "ENGLISH", "SOCIAL STUDIES"}));
		Admin_Department_combo.setBounds(196, 198, 208, 20);
		frame.getContentPane().add(Admin_Department_combo);
		
		JPanel Admin_Picture_Panel = new JPanel();
		Admin_Picture_Panel.setToolTipText("Here your Image.");
		Admin_Picture_Panel.setBounds(596, 34, 155, 154);
		frame.getContentPane().add(Admin_Picture_Panel);
		
		JPanel Admin_Sign_panel = new JPanel();
		Admin_Sign_panel.setToolTipText("Your Signeture.");
		Admin_Sign_panel.setBounds(596, 236, 155, 70);
		frame.getContentPane().add(Admin_Sign_panel);
		
		JButton Admin_info_Edit_btn = new JButton("Edit Info");
		Admin_info_Edit_btn.setBackground(Color.GRAY);
		Admin_info_Edit_btn.setForeground(Color.WHITE);
		Admin_info_Edit_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		Admin_info_Edit_btn.setToolTipText("Click here for Edit your info.");
		Admin_info_Edit_btn.setBounds(55, 300, 127, 43);
		frame.getContentPane().add(Admin_info_Edit_btn);
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frame.getContentPane().add(Back_btn);
		
		Admin_passwordField = new JPasswordField();
		Admin_passwordField.setBounds(196, 249, 208, 20);
		frame.getContentPane().add(Admin_passwordField);
		
	}
}
