package common;

import javax.json.Json;
import javax.json.JsonObject;

public class JsonGenerator {

    private JsonGenerator() {
    }

    public static JsonObject getAJsonObject() {
        return Json.createObjectBuilder()
                .add("requestData", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("firstName", "John")
                                .add("lastName", "Doe")))
                .build();
    }

    public static JsonObject getSimpleRequestDataJsonObject() {
        return Json.createObjectBuilder()
                .add("VatNumber", "123456789")
                .add("FirstName", "George")
                .add("LastName", "Mammos")
                .add("FatherName", "Michalis")
                .add("DebtCode", "HFS-HDS-2321321421")
                .add("DebtAmount", "12345.66")
                .add("IsOverdue", "1")
                .build();
    }

    public static String getJsonString() {
        return "{ \"color\" : \"Black\", \"type\" : \"Fiat\", \"year\" : \"1970\" }";
    }
}
