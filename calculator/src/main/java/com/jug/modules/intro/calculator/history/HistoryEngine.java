package com.jug.modules.intro.calculator.history;

import com.jug.modules.intro.calculator.AddCommand;
import com.jug.modules.intro.calculator.Engine;
import com.jug.modules.intro.calculator.Result;
import com.jug.modules.intro.calculator.validation.AddValidator;
import com.jug.modules.intro.math.MathLib;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class HistoryEngine implements Engine {
    private static final Logger logger = Logger.getLogger(HistoryEngine.class.getName());

    private List<AddCommand> history=new LinkedList<>();

    @Override
    public Result add(AddCommand add) {
        if(!AddValidator.isValid(add))
            return Result.empty();

        history.add(add);

        Optional<Integer> r = MathLib.add(add.getI1(), add.getI1());

        return new Result(r);
    }
}
