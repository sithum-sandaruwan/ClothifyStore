package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.stage.EmbeddedWindow;
import edu.icet.pos.controllers.DashBoardController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtUsername;
    private Stage stage;
    private Scene scene;


    public void LogInBtnOnAction(ActionEvent actionEvent) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoardForm.fxml"))));
        stage.show();

    }
}
