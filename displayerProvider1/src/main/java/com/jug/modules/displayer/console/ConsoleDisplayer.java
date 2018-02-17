package com.jug.modules.displayer.console;


import com.jug.modules.displayer.api.Displayer;
import com.jug.modules.displayer.api.DisplayerPlatform;

import java.util.Set;

public class ConsoleDisplayer implements Displayer {

    private Set<DisplayerPlatform> supportedplatforms= Set.of(DisplayerPlatform.LINUX,DisplayerPlatform.ANDROID);

    @Override
    public boolean supports(DisplayerPlatform p) {
        return supportedplatforms.contains(p);
    }

    @Override
    public void display(String s) {
        System.out.println("DISPLAYING ON LINUX : "+s);
    }
}
