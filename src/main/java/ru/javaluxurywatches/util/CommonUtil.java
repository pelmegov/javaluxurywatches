package ru.javaluxurywatches.util;

import lombok.NonNull;

public class CommonUtil {

    public static String toUpperCaseFirstChar(@NonNull String name) {
        String s1 = name.trim().substring(0, 1).toUpperCase();
        return s1 + name.trim().substring(1);
    }
}
