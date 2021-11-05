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
                .add("VatNumber", "123456789")
                .add("FirstName", "George")
                .add("LastName", "Mammos")
                .add("FatherName", "Michalis")
                .add("DebtCode", "HFS-HDS-2321321421")
                .add("DebtAmount", "12345.66")
                .add("IsOverdue", "1")
                .build();

        return jo;
    }

    public static String getJsonString() {
        return "{ \"color\" : \"Black\", \"type\" : \"Fiat\", \"year\" : \"1970\" }";
    }
}
