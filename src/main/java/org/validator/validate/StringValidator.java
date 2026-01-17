package org.validator.validate;

import org.validator.exception.ValidationException;

import java.util.function.Consumer;

class StringValidator {

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static void requireNotEmpty(String value, String message) {
        if (isNullOrEmpty(value)) {
            throw new ValidationException(message);
        }
    }

    public static void requireMaxLength(String value, int maxLength, String message) {
        if (value == null || value.length() > maxLength) {
            throw new ValidationException(message);
        }
    }

     public static void requireMaxLengthOrElseThrow(String value, int maxLength, Consumer<String> consumer) {
         if (value == null || value.length() > maxLength) {
             consumer.accept(value);
         }
     }
}
