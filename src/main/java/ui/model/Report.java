package ui.model;

/**
 * Created by kuanysh on 20.03.18.
 */
public class Report {

    private String shortsNames;
    private String reportsNames;

    public Report(String shortsNames, String reportsNames) {
        this.shortsNames = shortsNames;
        this.reportsNames = reportsNames;
    }

    public String getShortsNames() {
        return shortsNames;
    }

    public void setShortsNames(String shortsNames) {
        this.shortsNames = shortsNames;
    }

    public String getReportsNames() {
        return reportsNames;
    }

    public void setReportsNames(String reportsNames) {
        this.reportsNames = reportsNames;
    }
}
