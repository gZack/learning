package mpp.previousExams.april2017.again.Problem5.Exam;

public interface Graduate 
{
	//You can change 
	static int scholarships(){
	    return 2500;
    };
    default int feeCal(){
        return feeCal()*getCourse() + 1000;
    };
    int getFee();
    int getCourse();
}
