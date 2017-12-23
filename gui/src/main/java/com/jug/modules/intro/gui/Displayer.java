package com.jug.modules.intro.gui;

import com.jug.modules.intro.calculator.AddCommand;
import com.jug.modules.intro.calculator.Engine;
import com.jug.modules.intro.calculator.EngineProvider;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;


public class Displayer {

    private static Consumer<Integer> printResult=(i) -> System.out.println("result is : "+i);
    private static Runnable errorProcedure = () -> System.out.println("unable to add integeres, overflow");

    private final static Engine engine=EngineProvider.provide();

    public static void displayMath(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("i1 : ");
        Integer i1=scanner.nextInt();
        System.out.print("i2 : ");
        Integer i2=scanner.nextInt();


        Optional<Integer> result = engine.add(new AddCommand(i1, i2)).result;

        result.ifPresentOrElse(printResult,errorProcedure);
    }

    public static void main(String[] args) {
        displayMath();
    }
}
