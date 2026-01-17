package org.validator.validate;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/*
* author : gkfaiz123@gmail.com
*/

public final class Validate {

    private Validate() {
    }

    public static class number extends NumberValidator {}
    public static class string extends StringValidator {}
    public static class collection extends CollectionValidator {}


    static boolean isNull(Object value) {
        return value == null;
    }

    static boolean isNullOrEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    static boolean isNullOrEmptyGeneric(Object val) {
        if (val == null) return true;
        if (val instanceof String s) return s.trim().isEmpty();
        if (val instanceof Collection<?> c) return c.isEmpty();
        if (val instanceof Map<?, ?> m) return m.isEmpty();
        if (val.getClass().isArray()) return Array.getLength(val) == 0;
        return false;
    }
}
