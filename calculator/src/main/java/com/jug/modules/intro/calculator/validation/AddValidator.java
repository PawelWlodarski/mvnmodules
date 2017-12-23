package com.jug.modules.intro.calculator.validation;

import com.jug.modules.intro.calculator.AddCommand;

public class AddValidator {
    public static boolean isValid(AddCommand addCommand){
        return addCommand!=null;
    }
}
