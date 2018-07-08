package rest.rest.domain;

import java.util.Arrays;

public enum VocationEnum {
    DOCENT("docent"),
    DOKTOR("doktor"),
    VANREDNIPROFESOR("vanredni profesor"),
    REDOVNIPROFESOR("redovni profesor"),
    PROFESOREMERITUS("profesor emeritus");

    private String value;

    VocationEnum(String value) {
        this.value = value;
    }

    public static VocationEnum fromValue(String value) {
        for (VocationEnum vocation : values()) {
            if (vocation.value.equalsIgnoreCase(value)) {
                return vocation;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }
}
