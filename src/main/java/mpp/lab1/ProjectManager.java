package temp.lab1;

import mpp.mpp.lab1.Backlog;
import mpp.mpp.lab1.Feature;
import mpp.mpp.lab1.Project;
import mpp.mpp.lab1.Sprint;

import java.util.List;

public class ProjectManager {
    private String name;
    private List<mpp.mpp.lab1.Project> projects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<mpp.mpp.lab1.Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static List<Feature> assignFeaturesToRelease(Backlog backlog){

        return backlog.getFeatures();

    }

    public static double remainingWork(mpp.mpp.lab1.Sprint sprint){
        return sprint.calculateRemainingWork();
    }

    public static double completedWOrk(Sprint sprint){
        return sprint.calculateCompleteWork();
    }
}
