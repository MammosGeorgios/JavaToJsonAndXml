package common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PojoToJsonUtils {

    private PojoToJsonUtils() {
    }

    public static String getJsonStringFromPojo(Object object) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(object);
    }

}
