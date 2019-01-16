package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity_Layer.Admin_Info_Entity;




public class Admin_Dao {
	
private Connection admincon;
	
	public Admin_Dao()
	{
		try
		{
			admincon = DriverManager.getConnection("jdbc:mysql://localhost:3306/appele","root","");
		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
		
	}
	
	public ArrayList<Admin_Info_Entity> GetAllAdmin()
	{
		ArrayList<Admin_Info_Entity> Adminobj=new ArrayList<Admin_Info_Entity>();
		Statement adminStatement=null;
		ResultSet adminResultset=null;
		
		try
		{
			if(admincon==null)
			{
				throw(new Exception("Connection Unsuccessfull"));
			}
			adminStatement= admincon.createStatement();
			adminResultset= adminStatement.executeQuery("Select * from admin_info");
			
			while(adminResultset.next())
			{
				Admin_Info_Entity adm= ConvertRowToAdmin(adminResultset);
				Adminobj.add(adm);
			}
		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
		
		finally
		{
			close(adminStatement,adminResultset);
		}
		
		return Adminobj;
	}
	
	private Admin_Info_Entity ConvertRowToAdmin(ResultSet adminResultset) throws SQLException
	{
		Admin_Info_Entity Adm = new Admin_Info_Entity();
		
		Adm.setAdmin_ID(adminResultset.getInt("Admin_ID"));
		Adm.setAdmin_Name(adminResultset.getString("Admin_Name"));
		Adm.setAdmin_DEPT(adminResultset.getString("Admin_DEPT"));
		Adm.setAdmin_Sign(adminResultset.getString("Admin_Sign"));
		Adm.setAdmin_Pass(adminResultset.getString("Admin_Password"));
		
		return Adm;
	}
	
	
	private void close(Statement adminStatement,ResultSet adminResultset)
	{
		try
		{
		if(adminStatement!=null)
			adminStatement.close();
		if(adminResultset!=null)
			adminResultset.close();

		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
	}
	

	


}
