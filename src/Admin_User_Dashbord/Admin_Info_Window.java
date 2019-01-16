package Admin_User_Dashbord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import javax.swing.JPasswordField;

public class Admin_Info_Window {

	private JFrame frmEditInfo;
	private JTextField Admin_Id_txtfild;
	private JTextField textField;
	private JPasswordField Admin_passwordField;
	//protected ImageObserver ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Info_Window window = new Admin_Info_Window();
					window.frmEditInfo.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Info_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditInfo = new JFrame();
		frmEditInfo.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frmEditInfo.setTitle("Edit Info");
		frmEditInfo.getContentPane().setBackground(new Color(204, 255, 255));
		frmEditInfo.setBounds(100, 100, 865, 494);
		frmEditInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditInfo.getContentPane().setLayout(null);
		
		JLabel Admin_info_Edit_label = new JLabel("Edit your Info");
		Admin_info_Edit_label.setForeground(new Color(75, 0, 130));
		Admin_info_Edit_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		Admin_info_Edit_label.setBounds(22, 11, 215, 53);
		frmEditInfo.getContentPane().add(Admin_info_Edit_label);
		
		JLabel Admin_Name_lbl = new JLabel("Name");
		Admin_Name_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_Name_lbl.setForeground(Color.DARK_GRAY);
		Admin_Name_lbl.setBounds(55, 105, 78, 22);
		frmEditInfo.getContentPane().add(Admin_Name_lbl);
		
		JLabel Admin_ID_lbl = new JLabel("ID");
		Admin_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_ID_lbl.setForeground(Color.DARK_GRAY);
		Admin_ID_lbl.setBounds(55, 155, 27, 22);
		frmEditInfo.getContentPane().add(Admin_ID_lbl);
		
		JLabel Admin_Department_lbl = new JLabel("Department");
		Admin_Department_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_Department_lbl.setForeground(Color.DARK_GRAY);
		Admin_Department_lbl.setBounds(55, 195, 121, 22);
		frmEditInfo.getContentPane().add(Admin_Department_lbl);
		
		JLabel Admin_Password_lbl = new JLabel("Password");
		Admin_Password_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Admin_Password_lbl.setForeground(Color.DARK_GRAY);
		Admin_Password_lbl.setBounds(55, 246, 121, 22);
		frmEditInfo.getContentPane().add(Admin_Password_lbl);
		
		
		Admin_Id_txtfild = new JTextField();
		Admin_Id_txtfild.setEditable(false);
		Admin_Id_txtfild.setToolTipText("Your User ID");
		Admin_Id_txtfild.setBounds(196, 152, 208, 32);
		frmEditInfo.getContentPane().add(Admin_Id_txtfild);
		Admin_Id_txtfild.setColumns(10);
		
		JComboBox Admin_Department_combo = new JComboBox();
		Admin_Department_combo.setToolTipText("Your department.");
		Admin_Department_combo.setForeground(new Color(0, 51, 51));
		Admin_Department_combo.setFont(new Font("Hemi Head Rg", Font.PLAIN, 16));
		Admin_Department_combo.setModel(new DefaultComboBoxModel(new String[] {"CSE", "CSSE", "SE", "MATHMETICS", "ENGLISH", "SOCIAL STUDIES"}));
		Admin_Department_combo.setBounds(196, 198, 208, 20);
		frmEditInfo.getContentPane().add(Admin_Department_combo);
		
		JPanel Admin_Picture_Panel = new JPanel();
		Admin_Picture_Panel.setToolTipText("Here your Image.");
		Admin_Picture_Panel.setBounds(596, 34, 155, 154);
		frmEditInfo.getContentPane().add(Admin_Picture_Panel);
		
		JPanel Admin_Sign_panel = new JPanel();
		Admin_Sign_panel.setToolTipText("Your Signeture.");
		Admin_Sign_panel.setBounds(596, 236, 155, 70);
		frmEditInfo.getContentPane().add(Admin_Sign_panel);
		
		JButton Admin_info_Save_btn = new JButton("Save ");
		Admin_info_Save_btn.setBackground(Color.GRAY);
		Admin_info_Save_btn.setForeground(Color.WHITE);
		Admin_info_Save_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		Admin_info_Save_btn.setToolTipText("Click here for save changes.");
		Admin_info_Save_btn.setBounds(55, 307, 99, 32);
		frmEditInfo.getContentPane().add(Admin_info_Save_btn);
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frmEditInfo.getContentPane().add(Back_btn);
		
		textField = new JTextField();
		textField.setBounds(196, 94, 208, 33);
		frmEditInfo.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
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
				
					Admin_Picture_Panel.add(label2);
				    //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				}
				
			}
		});
		Browse_forpicture_btn.setToolTipText("Browse for you'r profile Picture.");
		Browse_forpicture_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Browse_forpicture_btn.setBounds(596, 199, 99, 23);
		frmEditInfo.getContentPane().add(Browse_forpicture_btn);
		
		
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
				
					Admin_Sign_panel.add(label);
					//System.out.println("Selected file: " + selectedFile1.getAbsolutePath());

						
						}


				}
			
		});
		Browse_forSign_btn.setToolTipText("Browse for you'r Signeture.");
		Browse_forSign_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Browse_forSign_btn.setBounds(596, 314, 99, 23);
		frmEditInfo.getContentPane().add(Browse_forSign_btn);
		
		Admin_passwordField = new JPasswordField();
		Admin_passwordField.setBounds(196, 249, 208, 20);
		frmEditInfo.getContentPane().add(Admin_passwordField);
		
		
		
	}
}
