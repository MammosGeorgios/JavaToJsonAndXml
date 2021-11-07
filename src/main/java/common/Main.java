package common;

import javax.json.JsonObject;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("common.Main Method");

        JsonObject jsonObject = JsonGenerator.getSimpleRequestDataJsonObject();
        System.out.println("This is a jsonObject created with a builder: \n" + jsonObject);

        Map map = null;

        try {
            map = JsonToMapUtils.getMapFromJsonWithGson(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println("\n\nMapSize: " + map.size());


        String requestData = MapToXmlUtils.getXmlRequestData(map);
        System.out.println("\nRequestData String extracted from a map created by a json object " +
                "without a premade class:\n" + requestData);


        System.out.println("\nTesting method to convert javaObject to json without any annotations\n");

        MockPerson mockResult = MockPerson.getMockPerson();

        System.out.println("Pojo:\n" + mockResult.toString());
        String jsonString = PojoToJsonUtils.getJsonStringFromPojo(mockResult);

        System.out.println("Printing jsonString from above Pojo(we use Object class as parameter so any object will work) :\n" + jsonString);
    }


}

