package mpp.demos.lecture5.factorymethods3.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Dao {
	public String getSql();
	public void unpackResultSet(ResultSet rs) throws SQLException;
	public List<?> getResults();
}
