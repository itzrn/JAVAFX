package com.example.PermutationCombination;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Start extends Application {
    Stage window;
    Button permutation,combination,exit;
    public void start(Stage primaryStage){
        PermutationCombination permutationCombination=new PermutationCombination();
        window=primaryStage;
        window.setTitle("Permutation & Combination");
        permutation=new Button("PERMUTATION");
        permutation.setOnAction(e->permutationCombination.permutationCombination(1,"PERMUTATION"));
        combination=new Button("COMBINATION");
        combination.setOnAction(e->permutationCombination.permutationCombination(2,"COMBINATION"));
        exit=new Button("exit");
        exit.setMinSize(50,20);
        exit.setOnAction(e->window.close());
        permutation.setMinSize(50,20);
        combination.setMinSize(50,20);
        GridPane gridPane=new GridPane();
        gridPane.getChildren().addAll(permutation,combination,exit);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(75,0,0,85));
        GridPane.setConstraints(permutation,0,0);
        GridPane.setConstraints(combination,2,0);
        GridPane.setConstraints(exit,1,1);

        Scene scene=new Scene(gridPane,450,200);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
