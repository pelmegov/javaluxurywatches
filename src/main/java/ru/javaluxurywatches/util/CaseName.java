package ru.javaluxurywatches.util;

public class CaseName {

    public static String checkName(String name) {
        String s1 = name.substring(0, 1).toUpperCase();
        return s1 + name.substring(1);
    }
}
