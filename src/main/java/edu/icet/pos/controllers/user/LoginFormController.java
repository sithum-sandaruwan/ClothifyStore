package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private JFXTextField txtEMail;

    @FXML
    private JFXTextField txtUser;
    private Stage stage;

    @FXML
    void LogInBtnOnAction(ActionEvent event) throws IOException {

        Parent load = new FXMLLoader(getClass().getResource("/view/DashBoardForm.fxml")).load();
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        stage.show();
    }

}
