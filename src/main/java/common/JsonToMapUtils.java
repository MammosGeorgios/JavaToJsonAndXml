package common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.json.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class JsonToMapUtils {

    private JsonToMapUtils() {
    }

    public static Map getMapFromJsonString(JsonObject jsonObject) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Map<String, String>> map = mapper.readValue(jsonObject.toString(), Map.class);
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            result.putAll(entry.getValue());
        }

        return result;
    }

    // Version Using Gson
    public static Map getMapFromJsonWithGson(JsonObject jsonObject){

        return new Gson().<Map<String, Object>>fromJson(
                jsonObject.toString(), new TypeToken<HashMap<String, Object>>() {}.getType()
        );
    }
}
