import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PojoToJsonUtils {

    public static String getJsonStringFromPojo(Object object) {
        Gson gson = new GsonBuilder().create();
        String jsonString = gson.toJson(object);
        return jsonString;
    }

}
