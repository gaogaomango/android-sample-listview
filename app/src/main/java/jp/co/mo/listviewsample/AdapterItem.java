package jp.co.mo.listviewsample;

public class AdapterItem {

    private int id;
    private String jobTitle;
    private String description;

    public AdapterItem(int id, String jobTitle, String description) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
