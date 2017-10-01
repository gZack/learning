package mpp.previousExams.april2017.again.Problem5.Exam;

public class MIS implements Graduate
{
	int fee;
	int courses;
	public MIS(int f,int c)
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
		return fee*courses+1700;
	}
	//You can add your code here
}
