public class Enseignant extends Person{
    private String Grade;

    public Enseignant(String nom, String prenom, String grade) {
        super(nom, prenom);
        Grade = grade;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}
