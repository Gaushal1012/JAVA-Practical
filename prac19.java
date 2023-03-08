package application;

import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.layout.StackPane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.stage.Stage;

public class prac19 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        double width = 450;
        double height = 450;
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.BLUE);

        c.setStroke(Color.WHITE);

        StackPane pane = new StackPane(c);

        primaryStage.setScene(new Scene(pane, width, height));
        pane.setOnMousePressed(e -> c.setFill(Color.RED));
        pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
        primaryStage.setTitle("SMIT KAKADIYA Click circle..");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);

    }
}
 16  
prac2.java
@@ -0,0 +1,16 @@
class prac2{
public static void main(String args []){
double a=3.4;
double b=50.2;
double c=2.1;
double d=0.55;
double e=44.5;
double f=5.9;

double x=c*d -b*f/a*d-b*c;
double y=a*f -e*c/a*d-b*c;

System.out.println("Solution for the Equation is x = "+x+"  y = "+y);

}
} 