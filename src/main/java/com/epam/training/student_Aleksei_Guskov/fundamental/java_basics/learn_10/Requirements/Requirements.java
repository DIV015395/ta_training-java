package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_10.Requirements;

public class Requirements {

    public static void requireNonNull(Object obj) {
        if (obj == null) throw new NullPointerException("obj is null");
    }

    public static void requireNonNull(Object obj, String message) {
        if (obj == null) throw new NullPointerException(message);
    }

    public static void checkArgument(boolean value) {
        if (value == false) throw new IllegalArgumentException("value is false");
    }

    public static void checkArgument(boolean value, String message) {
        if (value == false) throw new IllegalArgumentException(message);
    }

    public static void checkState(boolean value) {
        if (value == false) throw new IllegalStateException("value2 is false");
    }

    public static void checkState(boolean value, String message) {
        if (value == false) throw new IllegalStateException(message);
    }

    public static void checkIndex(int index, int size) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("not inside of [0, " + size + "]");
    }

}
