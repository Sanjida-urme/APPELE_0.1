package Faculty_User_Dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Faculty_Info_Window {

	public JFrame frmStudentProfile;
	public JTextField Faculty_ID_txtfield,Faculty_Department_txtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_Info_Window window = new Faculty_Info_Window();
					window.frmStudentProfile.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Faculty_Info_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmStudentProfile = new JFrame();
		frmStudentProfile.setTitle("Faculty Profile");
		frmStudentProfile.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frmStudentProfile.getContentPane().setBackground(new Color(204, 255, 255));
		frmStudentProfile.setBounds(100, 100, 865, 494);
		frmStudentProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentProfile.getContentPane().setLayout(null);
		
		JLabel Faculty_info_label = new JLabel("Faculty Info");
		Faculty_info_label.setForeground(new Color(75, 0, 130));
		Faculty_info_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		Faculty_info_label.setBounds(22, 11, 210, 53);
		frmStudentProfile.getContentPane().add(Faculty_info_label);
		
		JLabel Faculty_Name_lbl = new JLabel("Name");
		Faculty_Name_lbl.setFont(new Font("Forvertz", Font.PLAIN, 22));
		Faculty_Name_lbl.setForeground(Color.DARK_GRAY);
		Faculty_Name_lbl.setBounds(22, 60, 503, 32);
		frmStudentProfile.getContentPane().add(Faculty_Name_lbl);
		
		JLabel Faculty_ID_lbl = new JLabel("ID");
		Faculty_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Faculty_ID_lbl.setForeground(Color.DARK_GRAY);
		Faculty_ID_lbl.setBounds(55, 114, 27, 22);
		frmStudentProfile.getContentPane().add(Faculty_ID_lbl);
		
		JLabel Faculty_Department_lbl = new JLabel("Department");
		Faculty_Department_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Faculty_Department_lbl.setForeground(Color.DARK_GRAY);
		Faculty_Department_lbl.setBounds(55, 158, 121, 22);
		frmStudentProfile.getContentPane().add(Faculty_Department_lbl);
		
		
		
		JPanel Faculty_Picture_Panel = new JPanel();
		Faculty_Picture_Panel.setToolTipText("Here your Image.");
		Faculty_Picture_Panel.setBounds(596, 34, 155, 154);
		frmStudentProfile.getContentPane().add(Faculty_Picture_Panel);
		
		JPanel Faculty_Sign_panel = new JPanel();
		Faculty_Sign_panel.setToolTipText("Your Signeture.");
		Faculty_Sign_panel.setBounds(596, 236, 155, 70);
		frmStudentProfile.getContentPane().add(Faculty_Sign_panel);
		
		JButton Faculty_info_Edit_btn = new JButton("Edit Info");
		Faculty_info_Edit_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Faculty_Application_Form window = new Faculty_Application_Form();
				window.frame.setVisible(true);
			}
		});
		Faculty_info_Edit_btn.setBackground(Color.GRAY);
		Faculty_info_Edit_btn.setForeground(Color.WHITE);
		Faculty_info_Edit_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		Faculty_info_Edit_btn.setToolTipText("Click here for Edit your info.");
		Faculty_info_Edit_btn.setBounds(55, 300, 127, 43);
		frmStudentProfile.getContentPane().add(Faculty_info_Edit_btn);
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frmStudentProfile.getContentPane().add(Back_btn);
		
		Faculty_ID_txtfield = new JTextField();
		Faculty_ID_txtfield.setEditable(false);
		Faculty_ID_txtfield.setToolTipText("Your ID.");
		Faculty_ID_txtfield.setBounds(176, 110, 233, 26);
		frmStudentProfile.getContentPane().add(Faculty_ID_txtfield);
		Faculty_ID_txtfield.setColumns(10);
		
		Faculty_Department_txtfield = new JTextField();
		Faculty_Department_txtfield.setToolTipText("Your Department.");
		Faculty_Department_txtfield.setEditable(false);
		Faculty_Department_txtfield.setBounds(176, 161, 233, 22);
		frmStudentProfile.getContentPane().add(Faculty_Department_txtfield);
		Faculty_Department_txtfield.setColumns(10);
	}

}
