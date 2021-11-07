package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockPerson {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<MockPerson> siblings;

    public MockPerson(){}
    public MockPerson(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public List<MockPerson> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<MockPerson> siblings) {
        this.siblings = siblings;
    }

    @Override
    public String toString() {
        return "common.MockPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", siblings=" + siblings +
                '}';
    }

    public static MockPerson getMockPerson(){
        MockPerson mockPerson1 = new MockPerson("George","Mammos", 7);
        MockPerson sibling1 = new MockPerson("Michael","Mammos", 21237);
        MockPerson sibling2 = new MockPerson("John","Mammos", 217);
        MockPerson sibling3 = new MockPerson("Silvester","Mammos", 17);


        mockPerson1.setSiblings(new ArrayList<>(Arrays.asList(
                sibling1,sibling2,sibling3)));

        return mockPerson1;
    }
}
