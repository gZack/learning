package mpp.previousExams.april2017.Problem5.Exam;

import java.util.ArrayList;
import java.util.List;

public class Program
{
	private List<Student> students;
	private String name;
	public Program(String n)
	{
		name=n;
		students = new ArrayList<>();
		
	}
// You can write any method required here

	public void addStd(Student student){
		this.students.add(student);
	}

	public static int totalFee(List<Student> list){
		return list.stream()
				.mapToInt(Student::getSchoFee)
				.sum();
	}

	public List<Student> getstdlst() {
		return students;
	}

	public static void main(String args[])
  {
			 Program p=new Program("Data Science Program");
			 Student std1=new Student("Mahd",1,new CS(4,4));
			 Student std2=new Student("Davis",1,new CS(3,2));
			 Student std3=new Student("Rick",1,new MIS(3,3));
			 p.addStd(std1);
			 p.addStd(std2);
			 p.addStd(std3);
			 System.out.println("Total fee:"+Program.totalFee(p.getstdlst()));
  }

}
