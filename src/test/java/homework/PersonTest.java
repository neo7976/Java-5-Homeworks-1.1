package homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.OptionalInt;
import java.util.stream.Stream;

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
    void getName_test() {
        Assertions.assertEquals("Дмитрий", person.getName());
    }

    public static Stream<Arguments> sourceAge() {
        return Stream.of(
                Arguments.of(27),
                Arguments.of(28),
                Arguments.of(0),
                Arguments.of(10)
        );
    }

    @ParameterizedTest
    @MethodSource("sourceAge")
    void getAge_test(int expected) {
        Assertions.assertEquals(expected, person.setAge(expected));
    }

    @Test
    void happyBirthday_test() {
        person.happyBirthday();
        Assertions.assertEquals(OptionalInt.of(28), person.getAge());
    }

    @Test
    void ageException_test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-5));
        Assertions.assertDoesNotThrow(()->person.setAge(10));
    }

}