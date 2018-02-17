package com.jug.modules.displayer.api;

public interface Displayer {
    boolean supports(DisplayerPlatform p);

    void display(String s);
}
