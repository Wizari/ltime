package com.wizaripost.ltime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
//    public static ArrayList<Employee> Wor() {
//        ArrayList<Employee> workers = new ArrayList<>();
//        workers.add(new Employee(true, "Бивис"));
//        workers.add(new Employee(false, "Баттхед"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(false, "Кукуруза"));
//        return workers;
//    }

    public static void main(String[] args) {
        launch(args);

    }
}
