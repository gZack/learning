package mpp.previousExams.april2017.again.Problem5.Exam;

public class CS implements Graduate
{
	int fee;
	int courses;
	public CS(int f,int c)
	{
		fee=f;
		courses=c;
	}

	@Override
	public int getFee() {
		return fee;
	}

	@Override
	public int getCourse() {
		return courses;
	}

	@Override
	public int feeCal() {
		return fee*courses+1500;
	}
	// You can add your code here
}
