import javax.json.JsonObject;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method");

        JsonObject jsonObject = JsonGenerator.getSimpleRequestDataJsonObject();
        System.out.println("This is a jsonObject created with a builder: \n" + jsonObject);

        Map map = null;

        try {
            map = JsonToMapUtils.getMapFromJsonWithGson(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n\nMapSize: " + map.size());


        String requestData = MapToXmlUtils.getXmlRequestData(map);
        System.out.println("\n\nRequestData String: " + requestData);


        System.out.println("\n\nTesting method to convert javaObject to json without any annotations\n");
        MockPerson mockResult = new MockPerson();
        mockResult.setFirstName("George");
        mockResult.setLastName("Mammos");
        mockResult.setAge(12);

        System.out.println("Pojo: \n");

        String jsonString = PojoToJsonUtils.getJsonStringFromPojo(mockResult);
        System.out.println("Printing jsonString from above Pojo:\n" + jsonString);
    }


}

