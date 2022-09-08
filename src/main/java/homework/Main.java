package homework;

public class Main {
    public static void main(String[] args) {
        Person mom = new Person.PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        Person.PersonBuilder pap = new Person.PersonBuilder().setName("Dmitrii");
        pap.setSurname("Sobin");
        Person papa = pap.build();
        Person son2 = papa.newChildBuilder().setName("Mile").build();
        System.out.println("У " + papa + " есть сын, " + son2);

        try {
            // Не хватает обязательных полей
            new Person.PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new Person.PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
