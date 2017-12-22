package com.jug.modules.intro.math.internal;

import java.util.Optional;

public class OverflowDetector {
    public static Optional<Integer> add(int a, int b){
        try{
            return Optional.of(java.lang.Math.addExact(a,b));
        }catch(Exception e){
            return Optional.empty();
        }
    }

}
