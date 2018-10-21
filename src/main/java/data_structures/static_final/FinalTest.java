package data_structures.static_final;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinalTest {

    private String firstName;
    private final String lastName;

    private FinalTest(String lastName) {
        this.lastName = lastName;
    }

    private String testMedthod() {
        return "test";
    }

    private final String testFinalmethod() {
        return "test final";
    }

    public static void main(String[] args) {
        FinalTest object1 = new FinalTest("Nowacki");
        object1.setFirstName("Karol");
        object1.setFirstName("Żuk");

        System.out.println(object1.testMedthod());
        System.out.println(object1.testFinalmethod());
    }
}
