package mpp.lab5.prob4.personbirthinfo.db;

import java.time.LocalDate;
import java.util.HashMap;


public class Database {
	public static HashMap<String, PersonBirthRecord> h = new HashMap<>();
	static {
		h.put("1", new PersonBirthRecord("Bob", LocalDate.of(1990,9,4)));
		h.put("2", new PersonBirthRecord( "Alan", LocalDate.of(1980,9,8)));
		h.put("3", new PersonBirthRecord( "Dave", LocalDate.of(1970,7,7)));
		h.put("4", new PersonBirthRecord( "Perry", LocalDate.of(2000,5,6)));
	}
}
