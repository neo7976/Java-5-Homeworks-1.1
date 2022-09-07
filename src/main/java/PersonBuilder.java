public class PersonBuilder {
    private Person person;

    //todo заполнить корректно класс builder

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
