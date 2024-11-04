import java.util.HashMap;
import java.util.Map;

public class DataAdapter {
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    public Map<String, String > toExternalFormat() {
        Map<String, String> data = new HashMap<>();
        data.put("first_name", internalData.getFirstName());
        data.put("last_name", internalData.getLastName());

        return data;
    }
}
