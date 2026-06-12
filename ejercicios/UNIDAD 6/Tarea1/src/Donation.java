public class Donation {
    private String date;
    private String document;
    private String ngo;
    private String projectCode;
    private double amount;

    public Donation(String date, String document, String ngo, String projectCode, double amount) {
        this.date = date;
        this.document = document;
        this.ngo = ngo;
        this.projectCode = projectCode;
        this.amount = amount;
    }

    public String toString(){
        return date + ";" + document + ";" + ngo + ";" + projectCode + ";" + amount;
    }


    public String getDate() {
        return date;
    }

    public String getDocument() {
        return document;
    }

    public String getProjectCode() {
        return projectCode;
    }
}
