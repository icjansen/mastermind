import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;
import javax.swing.*;

public class test extends JPanel {

    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
    }


    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button btn = new Button("");
        HBox hbBtn = new HBox(10);
        btn.setId("button");
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        int aantalknoppen=10;
        for (int i = 0; i < aantalknoppen; ++i) {
            Button[] button = new Button[aantalknoppen];
            button[i] = new Button();
            button[i].setText("Knopjes"+i);
            hbBtn.getChildren().add(button[i]);
            grid.add(hbBtn, 12, 12);
        }

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        actiontarget.setId("actiontarget");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("Sign in button pressed");
            }
        });


        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(test.class.getResource("test.css").toExternalForm());
        primaryStage.show();
    }
}