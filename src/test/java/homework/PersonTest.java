package homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person.PersonBuilder()
                .setName("Дмитрий")
                .setSurname("Собин")
                .setAge(27)
                .setAddress("Москва")
                .build();
    }

    @AfterEach
    void tearDown() {
        person = null;
    }

    @Test
    void getName() {
        Assertions.assertEquals("Дмитрий", person.getName());
    }
}