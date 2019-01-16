package Student_User_Dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Student_Application_Form {

	JFrame frame;
	private JTextField Application_ID_txt_Field;
	private JTextField Student_ID_txt_Field;
	private JTextField Student_Application_Subject_txtField;
	private JTextField Section_Txt_Field;
	private JTextField Course_Title_txtField;
	private JTextField Student_Name_txt_Field;
	private JTextField Faculty_ID_txtfield;
	private JTextField textField;
	private JTextField Student_Application_Date_txtfield;
	private JTextField Attachment_File_Directory_txtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Application_Form window = new Student_Application_Form();
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
	public Student_Application_Form() {
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
		
		JLabel Student_ID_lbl = new JLabel("Student ID");
		Student_ID_lbl.setForeground(Color.WHITE);
		Student_ID_lbl.setFont(new Font("Arial Black", Student_ID_lbl.getFont().getStyle(), 14));
		Student_ID_lbl.setBounds(25, 50, 123, 25);
		frame.getContentPane().add(Student_ID_lbl);
		
		JLabel Faculty_ID_lbl = new JLabel("Faculty ID");
		Faculty_ID_lbl.setForeground(Color.WHITE);
		Faculty_ID_lbl.setFont(new Font("Arial Black", Faculty_ID_lbl.getFont().getStyle(), 14));
		Faculty_ID_lbl.setBounds(430, 23, 123, 25);
		frame.getContentPane().add(Faculty_ID_lbl);
		
		JLabel Student_Name_lbl = new JLabel("Student Name");
		Student_Name_lbl.setForeground(Color.WHITE);
		Student_Name_lbl.setFont(new Font("Arial Black", Student_Name_lbl.getFont().getStyle(), 14));
		Student_Name_lbl.setBounds(430, 50, 123, 25);
		frame.getContentPane().add(Student_Name_lbl);
		
		JLabel Student_Department_lbl = new JLabel("Student Department");
		Student_Department_lbl.setForeground(Color.WHITE);
		Student_Department_lbl.setFont(new Font("Arial Black", Student_Department_lbl.getFont().getStyle(), 14));
		Student_Department_lbl.setBounds(25, 78, 159, 25);
		frame.getContentPane().add(Student_Department_lbl);
		
		JLabel Course_Title_lbl = new JLabel("Course Title");
		Course_Title_lbl.setForeground(Color.WHITE);
		Course_Title_lbl.setFont(new Font("Arial Black", Course_Title_lbl.getFont().getStyle(), 14));
		Course_Title_lbl.setBounds(430, 78, 114, 25);
		frame.getContentPane().add(Course_Title_lbl);
		
		JLabel Section_lbl = new JLabel("Section");
		Section_lbl.setForeground(Color.WHITE);
		Section_lbl.setFont(new Font("Arial Black", Section_lbl.getFont().getStyle(), 14));
		Section_lbl.setBounds(430, 102, 89, 25);
		frame.getContentPane().add(Section_lbl);
		
		
		JLabel Application_Subject_lbl = new JLabel("Subject");
		Application_Subject_lbl.setForeground(Color.WHITE);
		Application_Subject_lbl.setFont(new Font("Arial Black", Application_Subject_lbl.getFont().getStyle(), 14));
		Application_Subject_lbl.setBounds(25, 138, 70, 25);
		frame.getContentPane().add(Application_Subject_lbl);
		
		JLabel Student_Application_Date_lbl = new JLabel("Date");
		Student_Application_Date_lbl.setForeground(Color.WHITE);
		Student_Application_Date_lbl.setFont(new Font("Arial Black", Student_Application_Date_lbl.getFont().getStyle(), 14));
		Student_Application_Date_lbl.setBounds(548, 178, 46, 14);
		frame.getContentPane().add(Student_Application_Date_lbl);
		
		JLabel Student_Application_Teachers_comment_lbl = new JLabel("Teacher's Comment");
		Student_Application_Teachers_comment_lbl.setForeground(Color.WHITE);
		Student_Application_Teachers_comment_lbl.setFont(new Font("Arial Black", Student_Application_Teachers_comment_lbl.getFont().getStyle(), 14));
		Student_Application_Teachers_comment_lbl.setBounds(25, 471, 172, 14);
		frame.getContentPane().add(Student_Application_Teachers_comment_lbl);
		
		JLabel Application_Approval_Status_lbl = new JLabel("Approval Status");
		Application_Approval_Status_lbl.setForeground(Color.WHITE);
		Application_Approval_Status_lbl.setFont(new Font("Arial Black", Application_Approval_Status_lbl.getFont().getStyle(), 14));
		Application_Approval_Status_lbl.setBounds(537, 538, 163, 14);
		frame.getContentPane().add(Application_Approval_Status_lbl);
		
		JLabel Faculty_Sign_lbl = new JLabel("Faculty Sign");
		Faculty_Sign_lbl.setForeground(Color.WHITE);
		Faculty_Sign_lbl.setFont(new Font("Arial Black", Faculty_Sign_lbl.getFont().getStyle(), 14));
		Faculty_Sign_lbl.setBounds(633, 625, 163, 14);
		frame.getContentPane().add(Faculty_Sign_lbl);
		
		JLabel Attachment_lbl = new JLabel("Attachment");
		Attachment_lbl.setForeground(Color.WHITE);
		Attachment_lbl.setFont(new Font("Arial Black", Attachment_lbl.getFont().getStyle(), 14));
		Attachment_lbl.setBounds(25, 544, 163, 14);
		frame.getContentPane().add(Attachment_lbl);
		
		Application_ID_txt_Field = new JTextField();
		Application_ID_txt_Field.setBounds(160, 27, 260, 20);
		frame.getContentPane().add(Application_ID_txt_Field);
		Application_ID_txt_Field.setColumns(10);
		
		Student_ID_txt_Field = new JTextField();
		Student_ID_txt_Field.setBounds(194, 54, 226, 20);
		frame.getContentPane().add(Student_ID_txt_Field);
		Student_ID_txt_Field.setColumns(10);
		
		JComboBox Student_Department_Combo = new JComboBox();
		Student_Department_Combo.setEditable(true);
		Student_Department_Combo.setModel(new DefaultComboBoxModel(new String[] {"Select your Department", "CSE", "USB", "MSJ", "DEH", "ETE"}));
		Student_Department_Combo.setBounds(194, 82, 226, 20);
		frame.getContentPane().add(Student_Department_Combo);
		
		Student_Application_Subject_txtField = new JTextField();
		Student_Application_Subject_txtField.setBounds(98, 137, 672, 30);
		frame.getContentPane().add(Student_Application_Subject_txtField);
		Student_Application_Subject_txtField.setColumns(10);
		
		Section_Txt_Field = new JTextField();
		Section_Txt_Field.setBounds(548, 106, 222, 20);
		frame.getContentPane().add(Section_Txt_Field);
		Section_Txt_Field.setColumns(10);
		
		Course_Title_txtField = new JTextField();
		Course_Title_txtField.setBounds(548, 82, 222, 20);
		frame.getContentPane().add(Course_Title_txtField);
		Course_Title_txtField.setColumns(10);
		
		Student_Name_txt_Field = new JTextField();
		Student_Name_txt_Field.setBounds(548, 54, 222, 20);
		frame.getContentPane().add(Student_Name_txt_Field);
		Student_Name_txt_Field.setColumns(10);
		
		Faculty_ID_txtfield = new JTextField();
		Faculty_ID_txtfield.setBounds(548, 27, 222, 20);
		frame.getContentPane().add(Faculty_ID_txtfield);
		Faculty_ID_txtfield.setColumns(10);
		
		JTextArea Description_txt_Field = new JTextArea();
		Description_txt_Field.setBounds(25, 203, 745, 257);
		frame.getContentPane().add(Description_txt_Field);
		
		Student_Application_Date_txtfield = new JTextField();
		Student_Application_Date_txtfield.setBounds(590, 177, 180, 20);
		frame.getContentPane().add(Student_Application_Date_txtfield);
		Student_Application_Date_txtfield.setColumns(10);
		
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
		
		Attachment_File_Directory_txtField = new JTextField();
		Attachment_File_Directory_txtField.setEnabled(false);
		Attachment_File_Directory_txtField.setEditable(false);
		Attachment_File_Directory_txtField.setText("No Attachment attached.");
		Attachment_File_Directory_txtField.setBounds(25, 563, 471, 20);
		frame.getContentPane().add(Attachment_File_Directory_txtField);
		Attachment_File_Directory_txtField.setColumns(10);
		
		JButton Browse_Attachment_btn = new JButton("Browse");
		Browse_Attachment_btn.setForeground(Color.BLUE);
		Browse_Attachment_btn.setBackground(Color.LIGHT_GRAY);
		Browse_Attachment_btn.setFont(new Font("Hemi Head Rg", Browse_Attachment_btn.getFont().getStyle(), 14));
		Browse_Attachment_btn.setBounds(407, 587, 89, 23);
		frame.getContentPane().add(Browse_Attachment_btn);
		
		
		
	
		
		
		
		
	}
}
