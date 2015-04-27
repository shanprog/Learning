package ch_30.book.lst_02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FlashText extends Application {

    private String text = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Label lblText = new Label("Programming is fun");

        pane.getChildren().add(lblText);

        new Thread(() -> {
            try {
                while (true) {
                    if (lblText.getText().trim().length() == 0)
                        text = "Welcome";
                    else
                        text = "";

                    Platform.runLater(() -> lblText.setText(text));

                    Thread.sleep(200);
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }).start();

        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("FlashText"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }
}
