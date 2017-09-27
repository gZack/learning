package mpp.lab5.prob4.factorymethods6;
import mpp.lab5.prob4.factorymethods6.otherpackage.DataRecord;
import mpp.lab5.prob4.factorymethods6.otherpackage.Database;
import mpp.lab5.prob4.factorymethods6.studreport.GradeReport;
import mpp.lab5.prob4.factorymethods6.studreport.StudentAndReport;
import mpp.lab5.prob4.factorymethods6.studreport.StudentGradeReportFactory;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		//two setters
		printTopStudents();
		
			
		
	}
	public static void printTopStudents() {
		Collection<DataRecord> data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for(DataRecord d : data) {
			StudentAndReport sr
			  = StudentGradeReportFactory
			      .createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.getReport());	
		}
		
		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while((next =it.next()) != null && next.getGrade().equals("A")) {
			System.out.print(next.getStudent().getName() + " ");
		}
	}
	

}
