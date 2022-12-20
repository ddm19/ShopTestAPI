package com.IWTech.IWTechApp.model;

public class Example
{

    private final long id;
    private final String content;

    public Example(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}