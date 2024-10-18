import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Facture {
    private int id;
    private HashMap<Produit, Integer> produits;
    private static double TVA;

    public Facture(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Facture.TVA = TVA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Produit, Integer> getProduits() {
        return produits;
    }

    public void setProduits(HashMap<Produit, Integer> produits) {
        this.produits = produits;
    }

    public void addProduit(Produit produit, int quantité){
        this.produits.put(produit, quantité);
    }
    public double getTotal(){
        double total = 0;
        for (Map.Entry<Produit, Integer> mapentry : this.produits.entrySet()) {
            total+= ((Produit)mapentry.getKey()).getPrix() * Double.valueOf(mapentry.getValue());
        }
        return total;
    }
    public double getTotalTTC(){
        return this.getTotal()*(1+this.TVA);
    }


}