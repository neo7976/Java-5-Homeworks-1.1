package homework;

import java.util.Objects;
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

    public Person() {
    }

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = setAge(personBuilder.age);
        this.address = personBuilder.address;
    }

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        else
            this.age = age;
        return age;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return hasAddress() ? address : "Отсутствует поле адреса";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge())
            this.age += 1;
        else
            throw new IllegalArgumentException("Мы не знаем возраст Персоны");
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }

    @Override
    public String toString() {
        return "homework.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private int age;
        private String address;

        public PersonBuilder() {
            super();
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = null;
            if (validatePerson())
                person = new Person(this);
            return person;
        }

        private boolean validatePerson() {
            if (name == null && surname == null) {
                throw new IllegalStateException("Не хватает обязательных параметров для создания класса");
            } else
                return true;
        }
    }
}

