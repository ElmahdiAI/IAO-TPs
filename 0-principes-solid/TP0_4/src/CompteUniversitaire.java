public class CompteUniversitaire {
    private Person person;
    private String login;

    public CompteUniversitaire(Person person) {
        this.person = person;
        genererLogin();
    }
    private void genererLogin() {
        if (person instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) person;
            this.login = person.getPrenom().charAt(0) + person.getNom() + "@usms.ac.ma";
        } else if (person instanceof Enseignant) {
            Enseignant enseignant = (Enseignant) person;
            this.login = person.getPrenom() + person.getNom() + enseignant.getGrade() + "@usms.ma";
        }
    }

    public String getLogin() {
        return login;
    }
}
