package Admin_User_Dashbord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Choice;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class Admin_User_Dashboard_window {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_User_Dashboard_window window = new Admin_User_Dashboard_window();
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
	public Admin_User_Dashboard_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA_PROJECT_APPELE\\2697649.png"));
		frame.setBounds(100, 100, 872, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
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
		LogOut_btn.setForeground(new Color(51, 153, 255));
		LogOut_btn.setFont(new Font("Hemi Head Rg", LogOut_btn.getFont().getStyle(), 16));
		menuBar.add(LogOut_btn);
		frame.getContentPane().setLayout(null);
		
		JButton Info_Profile_btn = new JButton("Profile Info");
		Info_Profile_btn.setFont(new Font("Hemi Head Rg", Info_Profile_btn.getFont().getStyle(), 16));
		Info_Profile_btn.setToolTipText("Click here for your Info.");
		Info_Profile_btn.setBounds(25, 36, 128, 29);
		frame.getContentPane().add(Info_Profile_btn);
		
		JButton Student_list_btn = new JButton("Student list");
		Student_list_btn.setFont(new Font("Hemi Head Rg", Student_list_btn.getFont().getStyle(), 16));
		Student_list_btn.setToolTipText("Click here for your Student list.");
		Student_list_btn.setBounds(25, 92, 128, 29);
		frame.getContentPane().add(Student_list_btn);
		
		JButton HOD_List_btn = new JButton("HOD list");
		HOD_List_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HOD_List_btn.setFont(new Font("Hemi Head Rg", HOD_List_btn.getFont().getStyle(), 16));
		HOD_List_btn.setToolTipText("Click here for your HOD list.");
		HOD_List_btn.setBounds(25, 147, 128, 29);
		frame.getContentPane().add(HOD_List_btn);
		
		JButton Faculty_list_btn = new JButton("Faculty list");
		Faculty_list_btn.setFont(new Font("Hemi Head Rg", Faculty_list_btn.getFont().getStyle(), 16));
		Faculty_list_btn.setToolTipText("Click here for your Faculty list.");
		Faculty_list_btn.setBounds(25, 204, 128, 29);
		frame.getContentPane().add(Faculty_list_btn);
		
		
		JPanel Admin_dashboard_panel = new JPanel();
		
		
		Admin_dashboard_panel.setBounds(175, 22, 671, 394);
		frame.getContentPane().add(Admin_dashboard_panel);
	}
}
