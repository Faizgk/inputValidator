package org.validator.validate;

import org.validator.exception.ValidationException;

import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

class CollectionValidator {

    public CollectionValidator() {}

    public static boolean isNullOrEmpty(Collection<?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(Map<?, ?> value) {
        return value == null || value.isEmpty();
    }

    public static <C extends Collection<?>> void requireNotEmpty(C value, String message) {
        if (isNullOrEmpty(value)) {
            throw new ValidationException(message);
        }
    }

     public static <C extends Collection<?>> void requireNotEmptyOrElseThrow(C value, Consumer<C> consumer) {
         if (isNullOrEmpty(value)) {
             consumer.accept(value);
         }
     }
}
