package com.prac.springboot.domain.user;


public enum Role {
    GUEST("ROLE_GUEST", "GUEST"),
    USER("ROLE_USER", "USER");

    private final String key;
    private final String title;

    Role(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
