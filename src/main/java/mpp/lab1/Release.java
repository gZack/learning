package temp.lab1;

import mpp.mpp.lab1.Sprint;

import java.util.Date;
import java.util.List;

public class Release {

    private String releaseTag;
    private Date releaseDate;
    private List<mpp.mpp.lab1.Sprint> sprints;

    public String getReleaseTag() {
        return releaseTag;
    }

    public void setReleaseTag(String releaseTag) {
        this.releaseTag = releaseTag;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<mpp.mpp.lab1.Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
    }
}
