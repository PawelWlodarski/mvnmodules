package com.jug.modules.displayer.consumer;

import com.jug.modules.displayer.api.Displayer;
import com.jug.modules.displayer.api.DisplayerPlatform;

import java.util.Optional;
import java.util.ServiceLoader;
import java.util.stream.Stream;

public class DisplayerConsumerMain {
    public static void main(String[] args) {
        ServiceLoader<Displayer> displayers = ServiceLoader.load(Displayer.class);

        Stream<ServiceLoader.Provider<Displayer>> providerStream = displayers.stream();


        Optional<Displayer> firstPotentialDisplayer = providerStream
                .map(ServiceLoader.Provider::get)
                .filter(d -> d.supports(DisplayerPlatform.LINUX))
                .findFirst();


        Displayer displayer = firstPotentialDisplayer.orElseThrow(() -> new RuntimeException("No Displayer her"));


        displayer.display("Displayer Found Successfully : "+displayer.getClass());

    }
}
