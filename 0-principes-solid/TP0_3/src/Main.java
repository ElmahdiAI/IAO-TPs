// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MatriceYoung matrice = new MatriceYoung(3, 3);

        System.out.println("Insertion des éléments...");
        matrice.add(1);
        matrice.add(2);
        matrice.add(3);
        matrice.add(4);
        matrice.add(5);
        matrice.add(6);
        matrice.add(7);
        matrice.add(8);

        System.out.println("Tableau après insertion :");
        matrice.afficher();

        System.out.println("Extraction du minimum : " + matrice.extraireMin());

        System.out.println("Tableau après extraction :");
        matrice.afficher();
    }
}