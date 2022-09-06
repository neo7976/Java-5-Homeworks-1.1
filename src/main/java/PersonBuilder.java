public class PersonBuilder {
    private Person person;

    //todo заполнить корректно класс builder

    public PersonBuilder setName(String name) {
        person.getName() = name;
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
        return new Person();
    }
}
