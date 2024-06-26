package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

         Parent load = FXMLLoader.load(getClass().getResource("/view/DashBoardForm.fxml"));
         stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(load);
         stage.setScene(scene);
         stage.show();


    }

    @FXML
    public void CreateAccLinkOnAction(ActionEvent actionEvent) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/view/SignUpForm.fxml"));
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();

    }
}
