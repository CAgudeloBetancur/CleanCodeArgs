package com.app;


import com.app.args.current.Args;
import com.app.args.current.exceptions.ArgsException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }

    private static void executeApplication(boolean logging, int port, String directory) {
        if (logging) {
            System.out.println("--- Modo de registro (Logging) activado ---");
        }

        System.out.printf("Iniciando servidor en el puerto: %d\n", port);
        System.out.printf("Directorio de trabajo: %s\n", directory);
    }
}