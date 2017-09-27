package mpp.lab1;

import java.util.Date;
import java.util.List;

public class Sprint {
    private Date dueDate;
    private String coach;
    private List<Feature> features;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCoach() {
            return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }


    public double calculateRemainingWork(){
        return 0.0;
    }

    public double calculateCompleteWork(){
        return 0.0;
    }

}

