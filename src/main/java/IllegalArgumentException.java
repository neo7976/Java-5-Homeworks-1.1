public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(String message) {
        System.out.printf("Ошибка - %s! Введите корректные данные!\n", message);
    }
}

