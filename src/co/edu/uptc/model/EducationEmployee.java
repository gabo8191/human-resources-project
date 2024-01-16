package co.edu.uptc.model;

public class EducationEmployee {
    private String educationLevel;
    private String educationTitle;
    private String educationInstitution;
    private int educationYear;

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationTitle() {
        return educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public String getEducationInstitution() {
        return educationInstitution;
    }

    public void setEducationInstitution(String educationInstitution) {
        this.educationInstitution = educationInstitution;
    }

    public int getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }

    @Override
    public String toString() {
        return "EducationEmployee{" + "educationLevel=" + educationLevel + ", educationTitle=" + educationTitle
                + ", educationInstitution=" + educationInstitution + ", educationYear=" + educationYear + '}';
    }

}
