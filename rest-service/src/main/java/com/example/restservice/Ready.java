package com.example.restservice;

public class Ready {

    private final String state;

    public Ready(String newstate) {
        this.state = newstate;
    }

    public String getState() {
        return state;
    }
}
