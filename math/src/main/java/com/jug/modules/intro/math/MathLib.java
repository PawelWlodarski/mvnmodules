package com.jug.modules.intro.math;

import com.jug.modules.intro.math.internal.OverflowDetector;

import java.util.Optional;

public class MathLib {

    public static Optional<Integer> add(Integer i1, Integer i2){
        return OverflowDetector.add(i1,i2);
    }

}
