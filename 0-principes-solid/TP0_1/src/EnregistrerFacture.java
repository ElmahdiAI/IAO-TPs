import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class EnregistrerFacture {
    public void saveFacture(Facture facture) {
        try {
            // create a FileWriter object with the file name
            String file = "Facture" + facture.getId() + ".txt";
            FileWriter writer = new FileWriter(file);
            writer.write("Facture ID: " + facture.getId() + "\n");
            // write the string to the file
            for (Map.Entry mapentry : facture.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() + "\n");
            }
            writer.write("- Prix = " + facture.getTotal() + "\n");
            writer.write("- PrixTTC = " + facture.getTotalTTC() + "\n");
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
