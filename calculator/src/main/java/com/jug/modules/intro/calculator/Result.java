package com.jug.modules.intro.calculator;

import java.util.Optional;

public class Result {
    public final Optional<Integer> result;

    public Result(Optional<Integer> result) {
        this.result = result;
    }

    public static Result empty() {
        return EMPTY_RESULT;
    }

    private static Result EMPTY_RESULT = new Result(Optional.empty());

}
