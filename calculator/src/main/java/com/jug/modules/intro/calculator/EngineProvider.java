package com.jug.modules.intro.calculator;

import com.jug.modules.intro.calculator.history.HistoryEngine;

public class EngineProvider {
    public static Engine provide(){
        return new HistoryEngine();
    }

}
