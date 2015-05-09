package com.epam.chorniak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FileDAO extends AbstractDAO<Integer,Entity> {
	public static final String SQL_SELECT_ALL_FILES="SELECT * FROM file";
	  public static final String SQL_SELECT_FILES_BY_PARENTCATALOG=
	  "SELECT id, name, volume FROM file WHERE parentCatalog=?";
	@Override
	public List<Entity> findAll() {
		List<File>  files= new ArrayList<>();
		  Connection cn=null;
		  Statement st=null;
		  try {
		cn=ConnectorDB.getConnection();
		st=cn.createStatement();
		ResultSet rs= st.executeQuery(SQL_SELECT_ALL_FILES);
		while(rs.next()){
		int id=rs.getInt(1);
		String parentCatalogOfCatalog =rs.getString(2);
		String nameOfCatalog=rs.getString(3);
		int volume=rs.getInt(4);
		files.add(new File(id,parentCatalogOfCatalog,nameOfCatalog,volume));
		}

		} catch (SQLException e) {
		System.err.println("SQL Exeption (request or table failed):"+e);
		}
		  
		return null;
	}

	@Override
	public Entity findEntityById(Integer Id) {
		
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean delete(Integer Id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean delete(Entity entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean create(Entity entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Entity update(Entity entity) {
		
		return null;
	}
	public File findFileByParentCatalog(String parentCatalog){
		File file =new File();
		Connection cn=null;
		PreparedStatement st=null;
		try {
		cn=ConnectorDB.getConnection();
		st=cn.prepareStatement(SQL_SELECT_FILES_BY_PARENTCATALOG);
		st.setString(1, parentCatalog);
		ResultSet resultSet = st.executeQuery();
		resultSet.next();
		file.setId(resultSet.getInt("id"));
		file.setParentCatalogOfFile(resultSet.getString("parentCatalog"));
		file.setNameOfFile(resultSet.getString("name"));
		file.setVolume(resultSet.getInt("volume"));
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.err.println("SQL exception (request or table failed):"+e);
		}

		return file;

		}

	

}
