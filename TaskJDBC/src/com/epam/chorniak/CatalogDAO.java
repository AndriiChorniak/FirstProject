package com.epam.chorniak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CatalogDAO extends AbstractDAO<Integer, Catalog> {

	public static final String SQL_SELECT_ALL_CATALOGS="SELECT * FROM catalog";
	  public static final String SQL_SELECT_CATALOGS_BY_PARENTCATALOG=
	  "SELECT id, name FROM catalog WHERE parentCatalog=?";
	  @Override
	public List<Catalog> findAll() {
	  List<Catalog>  catalogs= new ArrayList<>();
	  Connection cn=null;
	  Statement st=null;
	  try {
	cn=ConnectorDB.getConnection();
	st=cn.createStatement();
	ResultSet rs= st.executeQuery(SQL_SELECT_ALL_CATALOGS);
	while(rs.next()){
	int id=rs.getInt(1);
	String parentCatalogOfCatalog =rs.getString(2);
	String nameOfCatalog=rs.getString(3);
	catalogs.add(new Catalog(id,parentCatalogOfCatalog,nameOfCatalog));
	}

	} catch (SQLException e) {
	System.err.println("SQL Exeption (request or table failed):"+e);
	}
	  
	return null;
	}

	@Override
	public Catalog findEntityById(Integer Id) {
	throw new UnsupportedOperationException();
	}

	@Override
	public boolean delete(Integer Id) {
	throw new UnsupportedOperationException();
	}

	@Override
	public boolean delete(Catalog entity) {
	throw new UnsupportedOperationException();
	}

	@Override
	public boolean create(Catalog entity) {
	throw new UnsupportedOperationException();
	}

	@Override
	public Catalog update(Catalog entity) {
	// TODO Auto-generated method stub
	return null;
	}
	public Catalog findCatalogByParentCatalog(String parentCatalog){
	Catalog catalog =new Catalog();
	Connection cn=null;
	PreparedStatement st=null;
	try {
	cn=ConnectorDB.getConnection();
	st=cn.prepareStatement(SQL_SELECT_CATALOGS_BY_PARENTCATALOG);
	st.setString(1, parentCatalog);
	ResultSet resultSet = st.executeQuery();
	resultSet.next();
	catalog.setId(resultSet.getInt("id"));
	catalog.setParentCatalogOfCatalog(resultSet.getString("parentCatalog"));
	catalog.setNameOfCatalog(resultSet.getString("name"));
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.err.println("SQL exception (request or table failed):"+e);
	}

	return catalog;

	}

	

}
