import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**********************************************************
 * @author Rudolph Stephen
 * @version 1st March 2025
 * A simple calculator 
 *********************************************************/
public class CalculatorCustom extends Application
{   
    
        int num1;
        int num2;
        double Dnum1;
        double Dnum2;
        String sign = "";
        int grade = 4;
        String resultString;
    @Override
    public void start (Stage MyCalculator)
    {
        VBox myVbox = new VBox();
        TextField line1 = new TextField();
        TextField line2 = new TextField();
        
        
        
        ToggleGroup grade = new ToggleGroup();
        RadioButton grade4 = new RadioButton("Grade 4");
        RadioButton grade5 = new RadioButton("Grade 5");
        RadioButton grade6 = new RadioButton("Grade 6");
        grade4.setToggleGroup(grade);
        grade4.setOnAction(event -> {
        this.grade = 4;
        });
        grade5.setToggleGroup(grade);
         grade5.setOnAction(event -> {
        this.grade = 5;
        });
        grade6.setToggleGroup(grade);
         grade6.setOnAction(event -> {
        this.grade = 6;
        });
        grade4.setSelected(true);
        
        
        GridPane mygrid = new GridPane();
        
        mygrid.setAlignment(Pos.CENTER);
        mygrid.setVgap(5);
        mygrid.setHgap(5);
        
        Button one = new Button("1");
        one.setPrefWidth(50);
        one.setPrefHeight(50);
        
        Button two = new Button("2");
        two.setPrefWidth(50);
        two.setPrefHeight(50);
        
        Button three = new Button("3");
        three.setPrefWidth(50);
        three.setPrefHeight(50);
        Button four = new Button("4");
        four.setPrefWidth(50);
        four.setPrefHeight(50);
        Button five = new Button("5");
        five.setPrefWidth(50);
        five.setPrefHeight(50);
        Button six = new Button("6");
        six.setPrefWidth(50);
        six.setPrefHeight(50);
        Button seven = new Button("7");
        seven.setPrefWidth(50);
        seven.setPrefHeight(50);
        Button eight = new Button("8");
        eight.setPrefWidth(50);
        eight.setPrefHeight(50);
        Button nine = new Button("9");
        nine.setPrefWidth(50);
        nine.setPrefHeight(50);
        Button zero = new Button("0");
        zero.setPrefWidth(50);
        zero.setPrefHeight(50);
        Button mult = new Button("x");
        mult.setPrefWidth(50);
        mult.setPrefHeight(50);
        Button div = new Button("/");
        div.setPrefWidth(50);
        div.setPrefHeight(50);
        Button add = new Button("+");
        add.setPrefWidth(50);
        add.setPrefHeight(50);
        Button minus = new Button("-");
        minus.setPrefWidth(50);
        minus.setPrefHeight(50);
        Button decimal = new Button(".");
        decimal.setPrefWidth(50);
        decimal.setPrefHeight(50);
        Button equal = new Button("=");
        equal.setPrefWidth(50);
        equal.setPrefHeight(50);
        Button clear = new Button("clear");
        clear.setPrefWidth(50);
        clear.setPrefHeight(20);
        
        add.setOnAction(event -> {
        num1 = Integer.parseInt(line1.getText());
        sign = "+";
        line1.setText(""); 
        });
        minus.setOnAction(event -> {
        num1 = Integer.parseInt(line1.getText());
        sign = "-";
        line1.setText(""); 
        });
        div.setOnAction(event -> {
        num1 = Integer.parseInt(line1.getText());
        sign = "/";
        line1.setText(""); });
        mult.setOnAction(event -> {
        num1 = Integer.parseInt(line1.getText());
        sign = "x";
        line1.setText(""); });
        equal.setOnAction(event -> {
        num2 = Integer.parseInt(line1.getText());
        int result = 0;
        double resultDecimal = 0;
            switch(sign){
                case "+":
                    result = num1 + num2;
                    line2.setText(String.valueOf(result));
                    break;
                case "-":
                    if(this.grade == 4)
                    {   if(num2 > num1)
                        {
                            line2.setText("Error! please select grade 5 or 6");
                        }
                        else
                        {
                            result = num1 - num2;
                            line2.setText(String.valueOf(result));
                        }
                        
                    }
                    else 
                    {
                        result = num1 - num2;
                        line2.setText(String.valueOf(result));
                    }
                    break;
                case "/":
                    if(this.grade == 4)
                    {
                        if(num1%num2 == 0){
                            
                            result = num1/num2;
                            line2.setText(String.valueOf(result));
                        }
                        else
                        {
                            line2.setText("Error! please select grade 5 or 6");

                        }
                        
                    }
                    else if(this.grade == 5)
                    {
                        resultString = String.valueOf(num1/num2) + "R" + String.valueOf(num1%num2);
                        line2.setText(resultString);
                    }
                    else 
                    {   resultDecimal = (double) num1/num2;
                        resultString = String.format("%.4f", resultDecimal);
                        line2.setText(resultString);
                    }
                    break;
                case "x":
                    result = num1*num2;
                    line2.setText(String.valueOf(result));
                    break;
                }
            
        
        });
        clear.setOnAction(event -> {
        line1.setText("");
        line2.setText("");
        });
        
        
        mygrid.add(seven, 0,0);
        mygrid.add(eight, 1,0);
        mygrid.add(nine, 2,0);
        mygrid.add(four, 0,1);
        mygrid.add(five, 1,1);
        mygrid.add(six, 2,1);
        mygrid.add(one, 0,2);
        mygrid.add(two, 1,2);
        mygrid.add(three, 2,2);
        mygrid.add(zero, 0,3);
        mygrid.add(decimal,1,3);
        mygrid.add(equal, 2,3);
        mygrid.add(div,3,0);
        mygrid.add(mult,3,1);
        mygrid.add(minus,3,2);
        mygrid.add(add,3,3);
        
        zero.setOnAction(e -> line1.setText(line1.getText() + "0"));
        one.setOnAction(e -> line1.setText(line1.getText() + "1"));
        two.setOnAction(e -> line1.setText(line1.getText() + "2"));
        three.setOnAction(e -> line1.setText(line1.getText() + "3"));
        four.setOnAction(e -> line1.setText(line1.getText() + "4"));
        five.setOnAction(e -> line1.setText(line1.getText() + "5"));
        six.setOnAction(e -> line1.setText(line1.getText() + "6"));
        seven.setOnAction(e -> line1.setText(line1.getText() + "7"));
        eight.setOnAction(e -> line1.setText(line1.getText() + "8"));
        nine.setOnAction(e -> line1.setText(line1.getText() + "9"));
        
        
        
        HBox myHbox = new HBox();
        myHbox.setSpacing(5);
        myHbox.getChildren().addAll(grade4, grade5, grade6 , clear);
        myVbox.setSpacing(5);
        myVbox.getChildren().addAll(line1, line2, myHbox, mygrid);
        
        Scene myscene = new Scene(myVbox, 400, 400);
        MyCalculator.setScene(myscene);
        
        MyCalculator.show();
        
        
        
        



        
    }
}
