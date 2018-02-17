module displayerProvider1 {
    requires com.jug.modules.displayer.api;


    provides com.jug.modules.displayer.api.Displayer
            with com.jug.modules.displayer.console.ConsoleDisplayer;
}