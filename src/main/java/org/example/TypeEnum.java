package org.example;

import java.util.Objects;

public enum TypeEnum {
    SINGLE(1, "个人"),
    GROUP(2,"团队"),
    ;
    Integer value;
    String name;

    TypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static boolean isSingle(Integer value) {
        return Objects.equals(SINGLE.value, value);
    }
}
