package com.example.fx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DummyFX extends Application {
    public static int fibonacci(int n){
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    Stage window;
    Button button;
    public  void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Aryan Prajpati");
        button=new Button("Aryan");
        StackPane stackPane=new StackPane();
        stackPane.getChildren().add(button);
        Scene scene=new Scene(stackPane,300,300);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);   }
//    public static void main(String[] args) {
//        int n=5;
//        for (int i=0;i<n;i++) {
//            System.out.println(fibonacci(i));
//        }
//    }
}
