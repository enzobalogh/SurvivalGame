package com.enzo.survivalgame;

import javafx.application.Application;

/**
 * Ponto de entrada. Fica separado de {@link GameApplication} (que estende Application)
 * para que a inicialização do JavaFX funcione de forma consistente.
 */
public class Main {

    public static void main(String[] args) {
        Application.launch(GameApplication.class, args);
    }
}
