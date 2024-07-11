package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import edu.icet.pos.bo.custom.Impl.UserBoImpl;
import edu.icet.pos.bo.custom.UserBo;
import edu.icet.pos.dto.User;
import edu.icet.pos.entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
    private Stage stage;

    UserEntity userEntity =  new UserEntity();

    UserBo userBo = new UserBoImpl();

    User userDto = new User();

    @FXML
    void BackBtnOnAction(MouseEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/LogInForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void RegisterBtnOnAction(ActionEvent event) {
        String userID = generateNextID();
        userDto.setU_id(userID);

        new Alert(Alert.AlertType.INFORMATION,"Registration Successs").show();
    }

    private String generateNextID() {

        String userID = userBo.generateNewUserID();

        return userID;
    }

}
