package test;

import java.util.Set;

public class Person1 {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person1> parents;

    /* ---=== getters are supposed to be here. We skipped this part of code to make it simple ===--- */

    public static class Builder {
        private Person1 newPerson;

        public Builder() {
            newPerson = new Person1();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person1> parents) {
            newPerson.parents = parents;
            return this;
        }

        public Person1 build() {
            return newPerson;
        }

    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }

    public static void main(String[] args) {
        Person1 myPerson = new Person1.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
        System.out.println(myPerson);
    }

}
