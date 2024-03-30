package com.example.cafeapp;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader fxmlloader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
            primaryStage.setTitle("Bakery Menu");
            primaryStage.setScene(new Scene(fxmlloader.load(), 700, 400));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

