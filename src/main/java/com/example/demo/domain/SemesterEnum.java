package rest.rest.domain;


import java.util.Arrays;

public enum SemesterEnum {
    PRVI ("prvi"),
    DRUGI("drugi"),
    TRECI("treci"),
    CETVRTI("cetvrti"),
    PETI("peti"),
    SESTI("sesti"),
    SEDMI("sedmi"),
    OSMI("osmi");

    private String value;

    SemesterEnum(String value) {
        this.value = value;
    }

    public static SemesterEnum fromValue(String value) {
        for (SemesterEnum semesterEnum : values()) {
            if (semesterEnum.value.equalsIgnoreCase(value)) {
                return semesterEnum;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }


}
