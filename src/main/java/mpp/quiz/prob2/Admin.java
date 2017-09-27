package mpp.quiz.prob2;

public class Admin {
	//implement

    private Department[] departments;

    public Admin(final Department[] departments){
        this.departments = departments;
    }

    public String hourlyCompanyMessage(){

        String hourlyMesage = "";

        for (Department department : departments){
            hourlyMesage += format(department.getName(),department.nextMessage());
        }

        return hourlyMesage;

    }

    public String format(String name, String msg){
        return String.format("%s: %s\n",name,msg);
    }


}
