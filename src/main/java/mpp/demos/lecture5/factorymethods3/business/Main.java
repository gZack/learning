package mpp.demos.lecture5.factorymethods3.business;

import mpp.demos.lecture5.factorymethods3.dataaccess.Dao;
import mpp.demos.lecture5.factorymethods3.dataaccess.DataAccess;
import mpp.demos.lecture5.factorymethods3.dataaccess.DataAccessFactory;

import java.sql.SQLException;
import java.util.List;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Dao dao = new AddressDao();
		DataAccess da = DataAccessFactory.getDataAccess();
		try {
			da.read(dao);
			List<Address> addresses = (List<Address>)dao.getResults();
			//display addresses
		} catch(SQLException e) {
			//handle
		}
		

	}

}
