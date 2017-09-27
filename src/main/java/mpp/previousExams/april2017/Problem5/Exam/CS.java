package mpp.previousExams.april2017.Problem5.Exam;

public class CS implements Graduate
{
	int fee;
	int courses;
	public CS(int f,int c)
	{
		fee=f;
		courses=c;
	}
	// You can add your code here


	@Override
	public int getCourse() {
		return courses;
	}

	@Override
	public int getFee() {
		return fee;
	}
}
