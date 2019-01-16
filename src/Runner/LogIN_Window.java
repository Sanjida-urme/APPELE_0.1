package Runner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Admin_User_Dashbord.Admin_Info_Edit_Window;
import Admin_User_Dashbord.Admin_User_Dashboard_window;
import Faculty_User_Dashboard.Faculty_Info_Window;
import HOD_User_Dashboard.HOD_Info_Window;
import Student_User_Dashboard.Student_Dashboard_window;
import Student_User_Dashboard.Student_Info_Window;

import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LogIN_Window {

	public JFrame frmAppele;
	private JTextField UserID_field;
	private JPasswordField passwordField;
	private JButton Forget_Pass_Btn;
	//private JPanel image_panel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIN_Window window = new LogIN_Window();
					window.frmAppele.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIN_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmAppele = new JFrame();
		frmAppele.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\Appele-logo.png"));
		frmAppele.setTitle("Appele");
		frmAppele.getContentPane().setBackground(new Color(102, 51, 255));
		frmAppele.setBackground(SystemColor.inactiveCaption);
		frmAppele.setBounds(100, 100, 822, 493);
		frmAppele.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAppele.getContentPane().setLayout(null);
		//image_panel=new JPanel(new ImageIcon("background.png").getImage());
		
		JLabel lblUserId = new JLabel("User ID ");
		lblUserId.setFont(new Font("Hemi Head Rg", Font.BOLD, 19));
		lblUserId.setBounds(201, 147, 119, 39);
		frmAppele.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Hemi Head Rg", Font.BOLD, 19));
		lblPassword.setBounds(201, 198, 119, 51);
		frmAppele.getContentPane().add(lblPassword);
		
		UserID_field = new JTextField();
		UserID_field.setBounds(330, 156, 220, 27);
		frmAppele.getContentPane().add(UserID_field);
		UserID_field.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(330, 213, 220, 27);
		frmAppele.getContentPane().add(passwordField);
		
		JButton Log_IN_Button = new JButton("Log IN");
		Log_IN_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Admin_User_Dashboard_window window1 = new Admin_User_Dashboard_window();
				window1.frame.setVisible(true);
				
				HOD_Info_Window window2 = new HOD_Info_Window();
				window2.frame.setVisible(true);
				
				Faculty_Info_Window window3 = new Faculty_Info_Window();
				window3.frmStudentProfile.setVisible(true);
				
				Student_Dashboard_window window4 = new Student_Dashboard_window();
				window4.frmStudentDashboard.setVisible(true);

			}
		});
		Log_IN_Button.setToolTipText("Click here for Log In.");
		Log_IN_Button.setForeground(SystemColor.text);
		Log_IN_Button.setBackground(SystemColor.textHighlight);
		
		Log_IN_Button.setFont(new Font("Hemi Head Rg", Font.BOLD, 15));
		Log_IN_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Log_IN_Button.setBounds(445, 260, 103, 39);
		frmAppele.getContentPane().add(Log_IN_Button);
		
		Forget_Pass_Btn = new JButton("FORGET PASSWORD");
		Forget_Pass_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Forget_Pass_Btn.setBackground(SystemColor.inactiveCaptionBorder);
		Forget_Pass_Btn.setForeground(SystemColor.textHighlight);
		Forget_Pass_Btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 10));
		Forget_Pass_Btn.setToolTipText("If you forget your password or User-ID please click here.");
		Forget_Pass_Btn.setBounds(201, 270, 137, 23);
		Forget_Pass_Btn.setBorder(new LineBorder(Color.white,1));
		frmAppele.getContentPane().add(Forget_Pass_Btn);
	}
}
