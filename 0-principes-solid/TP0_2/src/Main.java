// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Compte compteCourant = new CompteCourant("C001", "15/10/2020");
        Compte compteEpargne = new CompteEpargne("E001", "01/01/2024");

        Operation debit = new Operation(500, TypeOperation.Debit);
        Operation credit = new Operation(200, TypeOperation.Credit);

        System.out.println("Ajout Opérations Compte Courant:");
        System.out.println("Débit : " + compteCourant.addOperation(debit));
        System.out.println("Crédit : " + compteCourant.addOperation(credit));
        System.out.println("Montant final : " + compteCourant.getMontant());

        System.out.println("\nAjout Opérations Compte Épargne:");
        System.out.println("Débit : " + compteEpargne.addOperation(debit));
        System.out.println("Crédit : " + compteEpargne.addOperation(credit));
        System.out.println("Montant final : " + compteEpargne.getMontant());

        System.out.println("\nListe des opérations Compte Courant:");
        for (Operation op : compteCourant.getOperations()) {
            System.out.println(op);
        }

        System.out.println("\nListe des opérations Compte Épargne:");
        for (Operation op : compteEpargne.getOperations()) {
            System.out.println(op);
        }
    }
}