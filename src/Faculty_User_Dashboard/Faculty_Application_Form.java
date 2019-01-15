package Faculty_User_Dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Faculty_Application_Form {

	private JFrame frame;
	private JTextField Application_ID_txtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_Application_Form window = new Faculty_Application_Form();
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
	public Faculty_Application_Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Application Form");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(0, 0, 808, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Application_ID_lbl = new JLabel("Application ID");
		Application_ID_lbl.setForeground(Color.WHITE);
		Application_ID_lbl.setFont(new Font("Arial Black", Application_ID_lbl.getFont().getStyle(), 14));
		Application_ID_lbl.setBounds(25, 23, 123, 25);
		frame.getContentPane().add(Application_ID_lbl);
		
		JLabel Faculty_ID_lbl = new JLabel("Faculty ID");
		Faculty_ID_lbl.setForeground(Color.WHITE);
		Faculty_ID_lbl.setFont(new Font("Arial Black", Faculty_ID_lbl.getFont().getStyle(), 14));
		Faculty_ID_lbl.setBounds(25, 50, 123, 25);
		frame.getContentPane().add(Faculty_ID_lbl);
		
		JLabel Admin_ID_lbl = new JLabel("Admin ID");
		Admin_ID_lbl.setForeground(Color.WHITE);
		Admin_ID_lbl.setFont(new Font("Arial Black", Admin_ID_lbl.getFont().getStyle(), 14));
		Admin_ID_lbl.setBounds(430, 23, 123, 25);
		frame.getContentPane().add(Admin_ID_lbl);
		
		JLabel HOD_ID_lbl = new JLabel("HOD ID");
		HOD_ID_lbl.setForeground(Color.WHITE);
		HOD_ID_lbl.setFont(new Font("Arial Black", HOD_ID_lbl.getFont().getStyle(), 14));
		HOD_ID_lbl.setBounds(430, 50, 123, 25);
		frame.getContentPane().add(HOD_ID_lbl);
		
		
		
		
		JLabel HOD_Application_Subject_lbl = new JLabel("Subject");
		HOD_Application_Subject_lbl.setForeground(Color.WHITE);
		HOD_Application_Subject_lbl.setFont(new Font("Arial Black", HOD_Application_Subject_lbl.getFont().getStyle(), 14));
		HOD_Application_Subject_lbl.setBounds(25, 138, 70, 25);
		frame.getContentPane().add(HOD_Application_Subject_lbl);
		
		JLabel Faculty_Application_Date_lbl = new JLabel("Date");
		Faculty_Application_Date_lbl.setForeground(Color.WHITE);
		Faculty_Application_Date_lbl.setFont(new Font("Arial Black", Faculty_Application_Date_lbl.getFont().getStyle(), 14));
		Faculty_Application_Date_lbl.setBounds(548, 178, 46, 14);
		frame.getContentPane().add(Faculty_Application_Date_lbl);
		
		JLabel Faculty_Application_HOD_comment_lbl = new JLabel("HOD Comment");
		Faculty_Application_HOD_comment_lbl.setForeground(Color.WHITE);
		Faculty_Application_HOD_comment_lbl.setFont(new Font("Arial Black", Faculty_Application_HOD_comment_lbl.getFont().getStyle(), 14));
		Faculty_Application_HOD_comment_lbl.setBounds(25, 471, 172, 14);
		frame.getContentPane().add(Faculty_Application_HOD_comment_lbl);
		
		JLabel Application_Approval_Status_lbl = new JLabel("Approval Status");
		Application_Approval_Status_lbl.setForeground(Color.WHITE);
		Application_Approval_Status_lbl.setFont(new Font("Arial Black", Application_Approval_Status_lbl.getFont().getStyle(), 14));
		Application_Approval_Status_lbl.setBounds(537, 538, 163, 14);
		frame.getContentPane().add(Application_Approval_Status_lbl);
		
		JLabel HOD_Sign_lbl = new JLabel("Faculty Sign");
		HOD_Sign_lbl.setForeground(Color.WHITE);
		HOD_Sign_lbl.setFont(new Font("Arial Black", HOD_Sign_lbl.getFont().getStyle(), 14));
		HOD_Sign_lbl.setBounds(633, 625, 163, 14);
		frame.getContentPane().add(HOD_Sign_lbl);
		
		JLabel Attachment_lbl = new JLabel("Attachment");
		Attachment_lbl.setForeground(Color.WHITE);
		Attachment_lbl.setFont(new Font("Arial Black", Attachment_lbl.getFont().getStyle(), 14));
		Attachment_lbl.setBounds(25, 544, 163, 14);
		frame.getContentPane().add(Attachment_lbl);
		
		JTextArea Description_txt_Field = new JTextArea();
		Description_txt_Field.setBounds(25, 203, 745, 257);
		frame.getContentPane().add(Description_txt_Field);
		
		
		JTextArea Student_Application_Comment_of_Teacher_txtfield = new JTextArea();
		Student_Application_Comment_of_Teacher_txtfield.setEnabled(false);
		Student_Application_Comment_of_Teacher_txtfield.setEditable(false);
		Student_Application_Comment_of_Teacher_txtfield.setBounds(25, 486, 745, 49);
		frame.getContentPane().add(Student_Application_Comment_of_Teacher_txtfield);
		
		JComboBox Application_Granted_Status_Combo = new JComboBox();
		Application_Granted_Status_Combo.setEnabled(false);
		Application_Granted_Status_Combo.setModel(new DefaultComboBoxModel(new String[] {"Pending", "NO", "Yes"}));
		Application_Granted_Status_Combo.setBounds(681, 538, 89, 20);
		frame.getContentPane().add(Application_Granted_Status_Combo);
		
		JPanel panel = new JPanel();
		panel.setBounds(584, 563, 186, 61);
		frame.getContentPane().add(panel);
		
		JButton Browse_Attachment_btn = new JButton("Browse");
		Browse_Attachment_btn.setForeground(Color.BLUE);
		Browse_Attachment_btn.setBackground(Color.LIGHT_GRAY);
		Browse_Attachment_btn.setFont(new Font("Hemi Head Rg", Browse_Attachment_btn.getFont().getStyle(), 14));
		Browse_Attachment_btn.setBounds(407, 587, 89, 23);
		frame.getContentPane().add(Browse_Attachment_btn);
		
		Application_ID_txtfield = new JTextField();
		Application_ID_txtfield.setBounds(142, 27, 265, 20);
		frame.getContentPane().add(Application_ID_txtfield);
		Application_ID_txtfield.setColumns(10);
		
		
		
	}

}
