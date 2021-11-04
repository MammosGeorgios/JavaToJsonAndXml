import javax.json.Json;
import javax.json.JsonObject;

public class JsonGenerator {

    public static JsonObject getAJsonObject() {
        JsonObject jo = Json.createObjectBuilder()
                .add("requestData", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("firstName", "John")
                                .add("lastName", "Doe")))
                .build();

        return jo;
    }

    public static JsonObject getSimpleRequestDataJsonObject() {
        JsonObject jo = Json.createObjectBuilder()
                .add("vatNumber", "123456789")
                .add("parameter1", "data1")
                .build();

        return jo;
    }

    public static String getJsonString() {
        return "{ \"color\" : \"Black\", \"type\" : \"Fiat\", \"year\" : \"1970\" }";
    }
}
