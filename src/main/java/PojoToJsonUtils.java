import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PojoToJsonUtils {


    public static void testPojoToJson(){

        MockResult mockResult = new MockResult();
        mockResult.firstName= "George";
        mockResult.lastName = "Mammos";
        mockResult.age = 12;

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(mockResult);// obj is your object

        System.out.println(json);

    }





    // Just a private class for testing
    public static class MockResult {
        private String firstName;
        private String lastName;
        private Integer age;

        public MockResult(){

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
