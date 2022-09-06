public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    //todo заполнить корректно класс builder


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) { /*...*/ }

    public PersonBuilder setAddress(String address) { /*...*/ }

    public Person build() { /*...*/ }
}
