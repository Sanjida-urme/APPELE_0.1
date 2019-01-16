package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import Entity_Layer.Admin_Info_Entity;
import Entity_Layer.Faculty_Info_Entity;

public class Faculty_Dao {
	
private Connection Facultycon;
	
	public Faculty_Dao()
	{
		try
		{
			Facultycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/appele","root","");
		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
		
	}
	
	public ArrayList<Faculty_Info_Entity> GetAllAdmin()
	{
		ArrayList<Faculty_Info_Entity> facultyinobj=new ArrayList<Faculty_Info_Entity>();
		Statement facultyStatement=null;
		ResultSet facultyResultset=null;
		
		try
		{
			if(Facultycon==null)
			{
				throw(new Exception("Connection Unsuccessfull"));
			}
			facultyStatement= Facultycon.createStatement();
			facultyResultset= facultyStatement.executeQuery("Select * from faculty_info");
			
			while(facultyResultset.next())
			{
				Faculty_Info_Entity adm= ConvertRowToFaculty(facultyResultset);
				facultyinobj.add(adm);
			}
		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
		
		finally
		{
			close(facultyStatement,facultyResultset);
		}
		
		return facultyinobj;
	}
	
	private Faculty_Info_Entity ConvertRowToFaculty(ResultSet facultyResultset) throws SQLException
	{
		Faculty_Info_Entity Adm = new Faculty_Info_Entity();
		
		Adm.setFaculty_ID(facultyResultset.getInt("Admin_ID"));
		

		
		return Adm;
	}
	
	
	private void close(Statement facultyStatement,ResultSet facultyResultset)
	{
		try
		{
		if(facultyStatement!=null)
			facultyStatement.close();
		if(facultyResultset!=null)
			facultyResultset.close();

		}
		catch(Exception eh)
		{
			JOptionPane.showMessageDialog(null,eh.getMessage());
		}
	}
	

}
