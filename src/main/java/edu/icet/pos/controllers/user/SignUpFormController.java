package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {

    @FXML
    private JFXTextField txtEMail;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtReEnterPassword;

    @FXML
    private JFXTextField txtUser;

    @FXML
    void BackBtnOnAction(MouseEvent event) throws IOException {
        Parent load = new FXMLLoader(getClass().getResource("/view/LogInForm.fxml")).load();
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        stage.show();
    }

    @FXML
    void RegisterBtnOnAction(ActionEvent event) {
        new Alert(Alert.AlertType.INFORMATION,"Registration Successs").show();
    }

}
