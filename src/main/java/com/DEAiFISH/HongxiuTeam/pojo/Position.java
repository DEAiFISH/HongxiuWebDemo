package com.DEAiFISH.HongxiuTeam.pojo;

public enum Position {
    LEADER("LEADER"),
    VICE_CAPTION("VICE_CAPTION"),
    ADMIN("ADMIN"),
    MEMBER("MEMBER");

    private String name;

    Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
