package data_structures;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StaticTest {

    public static final Integer VALUE = 5;
    private String firstName;
    private String lastName;
    private Integer age;

    public void test() {
        System.out.println("Test " + firstName);
    }

    public static void testStatic() {
        System.out.println("Test static");
    }
}
