public class Main {
    public static void main(String[] args) {
        InternalData internalData = new InternalData("Mehdi", "AI");
        DataAdapter adapter = new DataAdapter(internalData);

        ExternalAPI api = new ExternalAPI();
        api.getData(adapter.toExternalFormat());
    }
}