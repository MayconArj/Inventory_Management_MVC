package com.site.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.site.model.Item;
import com.site.util.ConnectionFactory;

public class ItemDAO {

	// database connection
	private Connection conn;
	
	// preparedStatement
	private PreparedStatement ps;
	
	//resultset
	ResultSet rs;
	Item item;
	
	
	public ItemDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e){
			throw new Exception("Error: \n" + e.getMessage());
		}
	}
	
	// To Save
	public void Save(Item item) throws Exception{
		if(item == null) {
			throw new Exception("The valor can't be null");
		}
		try {
			String SQL = "INSERT INTO item("
					+ "id, item, amount, "
					+ "inside_date, out_date, obs) "
					+ "values(?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, item.getId());
			ps.setString(2, item.getItem());
			ps.setInt(3, item.getAmount());
			ps.setString(4, item.getInside_date());
			ps.setString(5, item.getOut_date());
			ps.setString(6, item.getObs());
			ps.executeUpdate();
		} catch (SQLException sqle){
			throw new Exception("Error to insert values " + sqle);
		} finally {
			// close connection
			ConnectionFactory.closeConnection(conn, ps);
		}
	}
	
}
