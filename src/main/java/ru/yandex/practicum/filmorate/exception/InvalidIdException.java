package ru.yandex.practicum.filmorate.exception;

//Тесты из ТЗ требуют код ошибки 500
//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidIdException extends RuntimeException {
    public InvalidIdException(String message) {
        super(message);
    }
}