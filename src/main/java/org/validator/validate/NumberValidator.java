package org.validator.validate;

import org.validator.exception.ValidationException;

import java.util.function.Consumer;

class NumberValidator {

    public static boolean isNullOrZero(Number value) {
        return value == null || value.doubleValue() == 0.0d;
    }

    public static boolean isNullOrNegative(Number value) {
        return value == null || value.doubleValue() < 0.0d;
    }

    public static boolean isNullOrZeroOrNegative(Number value) {
        return value == null || value.doubleValue() <= 0.0d;
    }

    public static void requirePositive(Number value, String message) {
        if (isNullOrZeroOrNegative(value)) {
            throw new ValidationException(message);
        }
    }

    public static <T extends Number> void requirePositiveOrElseThrow(T value, Consumer<T> consumer) {
        if (isNullOrZeroOrNegative(value)) {
            consumer.accept(value);
        }
    }
}
