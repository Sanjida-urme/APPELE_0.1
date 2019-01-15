package Student_User_Dashboard;
import Student_User_Dashboard.Student_Info_Window;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Student_Dashboard_window {

	private JFrame frmStudentDashboard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Dashboard_window window = new Student_Dashboard_window();
					window.frmStudentDashboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_Dashboard_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDashboard = new JFrame();
		frmStudentDashboard.setResizable(false);
		frmStudentDashboard.setTitle("Student Dashboard");
		frmStudentDashboard.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frmStudentDashboard.setBounds(100, 100, 872, 497);
		frmStudentDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
		JMenuBar menuBar = new JMenuBar();
		frmStudentDashboard.setJMenuBar(menuBar);
		
		JMenu Message_menu_btn = new JMenu("Message");
		Message_menu_btn.setFont(new Font("Hemi Head Rg", Message_menu_btn.getFont().getStyle(), 16));
		menuBar.add(Message_menu_btn);
		
		JMenuItem Inbox_menu_btn = new JMenuItem("Inbox");
		Inbox_menu_btn.setForeground(SystemColor.windowBorder);
		Inbox_menu_btn.setFont(new Font("Hemi Head Rg", Font.PLAIN, 16));
		Message_menu_btn.add(Inbox_menu_btn);
		
		JMenuItem mntmSendMessage = new JMenuItem("Send Message");
		mntmSendMessage.setForeground(SystemColor.windowBorder);
		mntmSendMessage.setFont(new Font("Hemi Head Rg", mntmSendMessage.getFont().getStyle(), 16));
		Message_menu_btn.add(mntmSendMessage);
		
		JMenuItem NewMessage_menu_btn = new JMenuItem("New Message");
		NewMessage_menu_btn.setForeground(SystemColor.windowBorder);
		NewMessage_menu_btn.setFont(new Font("Hemi Head Rg", NewMessage_menu_btn.getFont().getStyle(), 16));
		Message_menu_btn.add(NewMessage_menu_btn);
		
		JMenu Notice_Menu_btn = new JMenu("Notice");
		Notice_Menu_btn.setForeground(new Color(102, 51, 255));
		Notice_Menu_btn.setFont(new Font("Hemi Head Rg", Notice_Menu_btn.getFont().getStyle(), 16));
		menuBar.add(Notice_Menu_btn);
		
		JMenuItem NewNotice_Menu_btn = new JMenuItem("New Notice");
		NewNotice_Menu_btn.setForeground(SystemColor.windowBorder);
		NewNotice_Menu_btn.setFont(new Font("Hemi Head Rg", NewNotice_Menu_btn.getFont().getStyle(), 16));
		Notice_Menu_btn.add(NewNotice_Menu_btn);
		
		JMenuItem CreateNotice_Menu_btn = new JMenuItem("Create Notice");
		CreateNotice_Menu_btn.setForeground(SystemColor.windowBorder);
		CreateNotice_Menu_btn.setFont(new Font("Hemi Head Rg", CreateNotice_Menu_btn.getFont().getStyle(), 16));
		Notice_Menu_btn.add(CreateNotice_Menu_btn);
		
		JMenu Application_Menu_btn = new JMenu("Application");
		Application_Menu_btn.setFont(new Font("Hemi Head Rg", Application_Menu_btn.getFont().getStyle(), 16));
		menuBar.add(Application_Menu_btn);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		menuBar.add(verticalStrut);
		
		JButton LogOut_btn = new JButton("Log Out");
		LogOut_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
			}
		});
		LogOut_btn.setForeground(new Color(51, 153, 255));
		LogOut_btn.setFont(new Font("Hemi Head Rg", LogOut_btn.getFont().getStyle(), 16));
		menuBar.add(LogOut_btn);
		frmStudentDashboard.getContentPane().setLayout(null);
		
		JButton Info_Profile_btn = new JButton("Profile Info");
		Info_Profile_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Student_Info_Window window = new Student_Info_Window();
				window.frmStudentProfile.setVisible(true);
				
			}
		});
		
		
		Info_Profile_btn.setFont(new Font("Hemi Head Rg", Info_Profile_btn.getFont().getStyle(), 16));
		Info_Profile_btn.setToolTipText("Click here for your Info.");
		Info_Profile_btn.setBounds(25, 36, 128, 29);
		frmStudentDashboard.getContentPane().add(Info_Profile_btn);
		
		JButton Faculty_list_btn = new JButton("Faculty list");
		Faculty_list_btn.setFont(new Font("Hemi Head Rg", Faculty_list_btn.getFont().getStyle(), 16));
		Faculty_list_btn.setToolTipText("Click here for your Faculty list.");
		Faculty_list_btn.setBounds(25, 92, 128, 29);
		frmStudentDashboard.getContentPane().add(Faculty_list_btn);
		
		
		JPanel Admin_dashboard_panel = new JPanel();
		
		
		Admin_dashboard_panel.setBounds(175, 22, 671, 394);
		frmStudentDashboard.getContentPane().add(Admin_dashboard_panel);
	}

}
