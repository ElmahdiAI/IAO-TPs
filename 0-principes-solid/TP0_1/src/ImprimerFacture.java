import java.util.Map;

public class ImprimerFacture {
    public void imprimer(Facture facture){
        double prix;
        for (Map.Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * Double.valueOf(mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}
