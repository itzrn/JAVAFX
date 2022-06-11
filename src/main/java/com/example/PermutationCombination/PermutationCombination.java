package com.example.PermutationCombination;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PermutationCombination {

    private double factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private double calCombination(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    private double calPermutation(int n, int r){
        return factorial(n)/factorial(n-r);
    }

    private void isInteger(int a) {
        try {
            if(a==1)
                answer.setText(String.valueOf(calCombination(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()))));
            else
                answer.setText(String.valueOf(calPermutation(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()))));
        } catch (Exception e) {
            answer.setText("Error! ---> Enter Valid Input");
        }catch (StackOverflowError e1){
            answer.setText("'r>n' <--- Not Allowed");
        }

    }


    TextField textField1,textField2;
    Text t1,t2,t3,answer;
    Stage window;
    Button calculate,exit;

    public void permutationCombination(int choice,String title) {
        window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        calculate = new Button("solve");
        switch (choice){
            case 1:
                window.setTitle(title);
                t3 = new Text("P(n, r) ---> ");
                calculate.setOnAction(e -> isInteger(2));
                break;
            case 2:
                window.setTitle(title);
                t3 = new Text("C(n, r) ---> ");
                calculate.setOnAction(e -> isInteger(1));
                break;
        }
        exit = new Button("exit");
        exit.setOnAction(e -> window.close());
        answer = new Text();
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20, 0, 0, 20));
        textField1 = new TextField("Enter 'n'");
        textField2 = new TextField("Enter 'r'");
        t1 = new Text("n ---> ");
        t2 = new Text("r ---> ");
        GridPane.setConstraints(answer, 1, 0);
        GridPane.setConstraints(t1, 0, 1);
        GridPane.setConstraints(textField1, 1, 1);
        GridPane.setConstraints(t2, 0, 2);
        GridPane.setConstraints(textField2, 1, 2);
        GridPane.setConstraints(calculate, 1, 3);
        GridPane.setConstraints(exit, 1, 5);
        GridPane.setConstraints(t3, 0, 0);

        gridPane.getChildren().addAll(t1, textField1, textField2, calculate, t2, exit, answer, t3);
        Scene scene = new Scene(gridPane, 400, 400);
        window.setScene(scene);
        window.show();
    }
}