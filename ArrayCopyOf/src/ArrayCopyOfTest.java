import java.util.Arrays;

class Person {
    Person() {}
    Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ArrayCopyOfTest {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i ++) {
            persons[i] = new Person("name_" + i);
        }
        Person[] copyPersons = Arrays.copyOf(persons, 3);

//        persons[0].setName("nb");
        copyPersons[0].setName("bnb");

        for (int i = 0; i < 3; i ++) {
            System.out.println(copyPersons[i].getName());
        }
        for (int i = 0; i < 3; i ++) {
            System.out.println(persons[i].getName());
        }
    }
}
