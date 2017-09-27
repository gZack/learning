package mpp.previousExams.april2017.Problem5.Exam;

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
		return courses;
	}

	@Override
	public int getCourse() {
		return fee;
	}
	//You can add your code here
}
