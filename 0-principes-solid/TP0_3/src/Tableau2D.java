import java.util.ArrayList;

public class Tableau2D {
    private final ArrayList<ArrayList<Integer>> data;
    private final int n, m;
    private static final int INF = Integer.MAX_VALUE;

    public Tableau2D(int n, int m) {
        this.n = n;
        this.m = m;
        this.data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(INF);
            }
            data.add(row);
        }
    }

    public int getElement(int i, int j) {
        return data.get(i).get(j);
    }

    public void setElement(int i, int j, int value) {
        data.get(i).set(j, value);
    }

    public void afficher() {
        for (ArrayList<Integer> row : data) {
            for (Integer val : row) {
                System.out.print((val == INF ? "INF" : val) + " ");
            }
            System.out.println();
        }
    }
}
