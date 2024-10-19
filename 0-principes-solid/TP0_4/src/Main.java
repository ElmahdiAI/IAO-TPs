// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Dupont", "Jean", 12345);
        Enseignant enseignant = new Enseignant("Martin", "Marie", "Professeur");

        CompteUniversitaire compteEtudiant = new CompteUniversitaire(etudiant);
        CompteUniversitaire compteEnseignant = new CompteUniversitaire(enseignant);

        System.out.println("Login Etudiant: " + compteEtudiant.getLogin());
        System.out.println("Login Enseignant: " + compteEnseignant.getLogin());
    }
}