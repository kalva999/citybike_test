package enums;

import lombok.Getter;

@Getter
public enum Country {

    Germany("DE");
    private final String code;

    Country(String code) {
        this.code = code;
    }
    }
