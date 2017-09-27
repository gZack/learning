package mpp.lab1;

import java.util.Date;
import java.util.List;

public class Project {

    private String name;
    private Date deadline;
    private List<Release> releases;
    private Backlog backlog;
    private ProjectManager projectManager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }


}
