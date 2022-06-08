package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FX_07 extends Application {//Main
    Stage window;
    Button button;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("JavaFx");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });//this do the same thing even if that particular window is
        // closed using that red cross button, try once after commenting above line

        button=new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane stackPane=new StackPane();
        stackPane.getChildren().add(button);

        Scene scene=new Scene(stackPane,500,500);
        window.setScene(scene);
        window.show();
    }


//    private void closeProgram1(){
//        System.out.println("File is saved");
//        window.close();
//    }

    private void closeProgram(){//using this we can first confirm the user do he
        // wants to close the window or not
        boolean answer= FX_06b.display("Title","Sure You Want to Exit!");//using a class made previously
        if (answer)
            window.close();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
