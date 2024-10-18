public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit();
        p1.setLibele("Produit A");
        p1.setPrix(10.0);

        Produit p2 = new Produit();
        p2.setLibele("Produit B");
        p2.setPrix(20.0);

        Facture facture = new Facture(1);
        Facture.setTVA(0.2); // 20% TVA

        facture.addProduit(p1, 2);
        facture.addProduit(p2, 3);

        ImprimerFacture imprimerFacture = new ImprimerFacture();
        imprimerFacture.imprimer(facture);

        EnregistrerFacture enregistrerFacture = new EnregistrerFacture();
        enregistrerFacture.saveFacture(facture);
    }
}