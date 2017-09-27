package mpp.lab1;

import java.util.List;

public class ProjectManager {
    private String name;
    private List<Project> projects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static List<Feature> assignFeaturesToRelease(Backlog backlog){

        return backlog.getFeatures();

    }

    public static double remainingWork(Sprint sprint){
        return sprint.calculateRemainingWork();
    }

    public static double completedWOrk(Sprint sprint){
        return sprint.calculateCompleteWork();
    }
}
