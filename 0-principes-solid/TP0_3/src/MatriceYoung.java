import java.util.ArrayList;

/*Un tableau de Young (ou tableau de Young-Ferrers) est une disposition d'entiers dans un tableau de cases,
 où les lignes et les colonnes sont ordonnées de manière croissante.
Plus formellement, un tableau de Young remplit ces deux conditions :
 */
/*Les nombres dans chaque ligne sont disposés dans un ordre croissant, c'est-à-dire que
 chaque élément dans une ligne est inférieur ou égal à celui qui le suit.
 */
/*Les nombres dans chaque colonne sont également disposés dans un ordre croissant, c'est-à-dire
que chaque élément dans une colonne est inférieur ou égal à celui qui se trouve en dessous.
 */
/*Le tableau de Young doit implementer deux opérations : Extraire Min et inserer, il faut garder les deux
conditions valables aprs chaque opération.
 */
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */
public class MatriceYoung  extends ArrayList<Object> {
    private static final int INF = Integer.MAX_VALUE;
    private int n, m;
    private final Tableau2D tableau;
    public MatriceYoung(int n , int m) {
        super(n);
        this.n=n;
        this.m = m;
        this.tableau = new Tableau2D(n, m);
    }
    public int extraireMin(){
        /*Aucun élément n'est inséré dans le tableau*/
        int min = tableau.getElement(0, 0);
        if (min == INF) {
            System.out.println("Tableau vide.");
            return INF;
        }
        equilibrer(0, 0);
        return min;
    }
    private void maintenirPropriete(int i, int j, int value) {
        while (i >= 0 && j >= 0) {
            int top = (i > 0) ? tableau.getElement(i - 1, j) : INF;
            int left = (j > 0) ? tableau.getElement(i, j - 1) : INF;

            if (value >= Math.min(top, left)) break;

            if (top < left) {
                tableau.setElement(i, j, top);
                i--;
            } else {
                tableau.setElement(i, j, left);
                j--;
            }
        }

        tableau.setElement(Math.max(i, 0), Math.max(j, 0), value);  // Handle edge case
    }

    public boolean add(int value){
        if (tableau.getElement(n - 1, m - 1) != INF) {
            System.out.println("Tableau plein.");
            return false;
        }
        tableau.setElement(n - 1, m - 1, value);
        maintenirPropriete(n - 1, m - 1, value);
        return true;
    }
    // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum
    private void equilibrer(int i , int j){
        int down = (i + 1 < n) ? tableau.getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? tableau.getElement(i, j + 1) : INF;

        if (down == INF && right == INF) return;

        if (down < right) {
            tableau.setElement(i, j, down);
            equilibrer(i + 1, j);
        } else {
            tableau.setElement(i, j, right);
            equilibrer(i, j + 1);
        }
    }
    public void afficher(){
        tableau.afficher();
    }
}
