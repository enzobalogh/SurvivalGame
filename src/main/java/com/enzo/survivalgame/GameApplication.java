package com.enzo.survivalgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameApplication extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Ambiente JavaFX configurado com sucesso!");
        label.setStyle("-fx-font-size: 20px;");

        StackPane root = new StackPane(label);
        root.setAlignment(Pos.CENTER);

        stage.setTitle("SurvivalGame");
        stage.setScene(new Scene(root, 640, 360));
        stage.show();
    }
}
