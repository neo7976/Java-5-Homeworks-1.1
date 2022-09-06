import java.util.OptionalInt;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = setAge(age);
    }


    public boolean hasAge() { /*...*/ }

    public boolean hasAddress() { /*...*/ }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Такого возраста не существует");
        else
            this.age = age;
        return age;
    }

    public OptionalInt getAge() {
        if (hasAge())
            return OptionalInt.of(age);
        return OptionalInt.of(-1);
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() { /*...*/ }
}
}
