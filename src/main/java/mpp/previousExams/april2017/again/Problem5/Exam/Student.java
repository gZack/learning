package mpp.previousExams.april2017.again.Problem5.Exam;

public class Student
{
  Graduate grd;
  String name;
  int id;
//  You can define any Data member or Method here
  public Student(String n,int i,Graduate g)
  {
	  name=n;
	  id=i;
	  grd=g;
  }
  
  public int getFee(){
    return grd.feeCal();
  }
  
}
