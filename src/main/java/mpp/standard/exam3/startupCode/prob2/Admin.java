package mpp.standard.exam3.startupCode.prob2;

public class Admin {
	//implement
	private Department[] departments;

	public Admin(final Department[] departments){
	    this.departments = departments;
    }

    public String hourlyCompanyMessage(){

	    String result = "";

	    for(Department department : departments){
            try {
                result += format(department.getName(),department.nextMessage());
            } catch (EmptyQueueException e) {
            }
        }

        return result;
    }

    public String format(String name, String msg){
        return String.format("%s: %s\n", name,msg);
    }
}
