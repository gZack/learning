package mpp.previousExams.april2017.Problem5.Exam;

public class Student 
{
  private Graduate grd;
  String name;
  int id;
//  You can define any Data member or Method here
  public Student(String n,int i,Graduate g)
  {
	  name=n;
	  id=i;
	  grd=g;
  }
  
  public int getSchoFee(){
    return grd.getFee();
  }
  
}
