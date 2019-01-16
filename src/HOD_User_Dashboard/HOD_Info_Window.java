package HOD_User_Dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HOD_Info_Window {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOD_Info_Window window = new HOD_Info_Window();
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
	public HOD_Info_Window() {
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
		
		JLabel HOD_info_label = new JLabel("HOD Info");
		HOD_info_label.setForeground(new Color(75, 0, 130));
		HOD_info_label.setFont(new Font("Hemi Head Rg", Font.BOLD, 29));
		HOD_info_label.setBounds(22, 11, 166, 53);
		frame.getContentPane().add(HOD_info_label);
		
		JLabel HOD_Name_lbl = new JLabel("Name");
		HOD_Name_lbl.setFont(new Font("Forvertz", Font.PLAIN, 22));
		HOD_Name_lbl.setForeground(Color.DARK_GRAY);
		HOD_Name_lbl.setBounds(22, 60, 303, 32);
		frame.getContentPane().add(HOD_Name_lbl);
		
		JLabel HOD_ID_lbl = new JLabel("ID");
		HOD_ID_lbl.setFont(new Font("Hemi Head Rg", Font.PLAIN, 18));
		HOD_ID_lbl.setForeground(Color.DARK_GRAY);
		HOD_ID_lbl.setBounds(55, 130, 27, 22);
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
		HOD_info_Edit_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				HOD_Info_Edit_Window window = new HOD_Info_Edit_Window();
				window.frame.setVisible(true);
				
			}
		});
		HOD_info_Edit_btn.setBackground(Color.GRAY);
		HOD_info_Edit_btn.setForeground(Color.WHITE);
		HOD_info_Edit_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 17));
		HOD_info_Edit_btn.setToolTipText("Click here for Edit your info.");
		HOD_info_Edit_btn.setBounds(55, 300, 127, 43);
		frame.getContentPane().add(HOD_info_Edit_btn);
		
		JButton Back_btn = new JButton("<<  Back");
		Back_btn.setToolTipText("Back to the Dashboard !");
		Back_btn.setFont(new Font("Hemi Head Rg", Font.BOLD, 16));
		Back_btn.setBounds(55, 391, 121, 32);
		frame.getContentPane().add(Back_btn);
		
	
		
	}

}
