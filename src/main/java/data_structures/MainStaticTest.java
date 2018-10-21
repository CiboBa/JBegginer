package data_structures;

public class MainStaticTest {

    public static void main(String[] args) {
        StaticTest object1 = new StaticTest();
        object1.setFirstName("Waldek");
        object1.setLastName("Nowak");
        object1.setAge(65);
        printText(object1);
        StaticTest object2 = new StaticTest();
        object2.setFirstName("Marek");
        object2.setLastName("Paluch");
        object2.setAge(42);
        printText(object2);

        object1.test();
        object2.test();

        StaticTest.testStatic();
    }

    private static void printText(StaticTest object1) {
        System.out.println("Name: " + object1.getFirstName() +
                ", surname: " + object1.getLastName() +
                ", age: " + object1.getAge() +
                ", value: " + StaticTest.VALUE);
    }
}
