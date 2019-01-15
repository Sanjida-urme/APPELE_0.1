package Student_User_Dashboard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Toolkit;

public class Student_Info_Window {

	JFrame frmStudentProfile;
	private JTextField Student_ID_txtfield;
	private JTextField Student_Department_txtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Info_Window window = new Student_Info_Window();
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
	public Student_Info_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmStudentProfile = new JFrame();
		frmStudentProfile.setTitle("Student Profile");
		frmStudentProfile.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frmStudentProfile.getContentPane().setBackground(new Color(204, 255, 255));
		frmStudentProfile.setBounds(100, 100, 865, 494);
		frmStudentProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentProfile.getContentPane().setLayout(null);
		
		JLabel Student_info_label = new JLabel("Student Info");
		Student_info_label.setForeground(new Color(75, 0, 130));
		Student_info_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		Student_info_label.setBounds(22, 11, 210, 53);
		frmStudentProfile.getContentPane().add(Student_info_label);
		
		JLabel Student_Name_lbl = new JLabel("Name");
		Student_Name_lbl.setFont(new Font("Forvertz", Font.PLAIN, 22));
		Student_Name_lbl.setForeground(Color.DARK_GRAY);
		Student_Name_lbl.setBounds(22, 60, 503, 32);
		frmStudentProfile.getContentPane().add(Student_Name_lbl);
		
		JLabel Student_ID_lbl = new JLabel("ID");
		Student_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Student_ID_lbl.setForeground(Color.DARK_GRAY);
		Student_ID_lbl.setBounds(55, 114, 27, 22);
		frmStudentProfile.getContentPane().add(Student_ID_lbl);
		
		JLabel Student_Department_lbl = new JLabel("Department");
		Student_Department_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		Student_Department_lbl.setForeground(Color.DARK_GRAY);
		Student_Department_lbl.setBounds(55, 158, 121, 22);
		frmStudentProfile.getContentPane().add(Student_Department_lbl);
		
		
		
		JPanel Student_Picture_Panel = new JPanel();
		Student_Picture_Panel.setToolTipText("Here your Image.");
		Student_Picture_Panel.setBounds(596, 34, 155, 154);
		frmStudentProfile.getContentPane().add(Student_Picture_Panel);
		
		JPanel Student_Sign_panel = new JPanel();
		Student_Sign_panel.setToolTipText("Your Signeture.");
		Student_Sign_panel.setBounds(596, 236, 155, 70);
		frmStudentProfile.getContentPane().add(Student_Sign_panel);
		
		JButton Student_info_Edit_btn = new JButton("Edit Info");
		Student_info_Edit_btn.setBackground(Color.GRAY);
		Student_info_Edit_btn.setForeground(Color.WHITE);
		Student_info_Edit_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		Student_info_Edit_btn.setToolTipText("Click here for Edit your info.");
		Student_info_Edit_btn.setBounds(55, 300, 127, 43);
		frmStudentProfile.getContentPane().add(Student_info_Edit_btn);
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frmStudentProfile.getContentPane().add(Back_btn);
		
		Student_ID_txtfield = new JTextField();
		Student_ID_txtfield.setEditable(false);
		Student_ID_txtfield.setToolTipText("Your ID.");
		Student_ID_txtfield.setBounds(176, 110, 233, 26);
		frmStudentProfile.getContentPane().add(Student_ID_txtfield);
		Student_ID_txtfield.setColumns(10);
		
		Student_Department_txtfield = new JTextField();
		Student_Department_txtfield.setToolTipText("Your Department.");
		Student_Department_txtfield.setEditable(false);
		Student_Department_txtfield.setBounds(176, 161, 233, 22);
		frmStudentProfile.getContentPane().add(Student_Department_txtfield);
		Student_Department_txtfield.setColumns(10);
		
	}
}
