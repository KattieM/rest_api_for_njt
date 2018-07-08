package rest.rest.domain;

import java.util.Arrays;

public enum SubjectTypeEnum {
    OBAVEZAN("obaveza"),
    REDOVAN("redovan");

    private String value;

    SubjectTypeEnum(String value) {
        this.value = value;
    }

    public static SubjectTypeEnum fromValue(String value) {
        for (SubjectTypeEnum subjectType : values()) {
            if (subjectType.value.equalsIgnoreCase(value)) {
                return subjectType;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }
}
