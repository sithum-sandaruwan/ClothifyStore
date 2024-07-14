package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import edu.icet.pos.bo.custom.Impl.UserBoImpl;
import edu.icet.pos.bo.custom.UserBo;
import edu.icet.pos.dao.custom.impl.UserDaoImpl;
import edu.icet.pos.dto.User;
import edu.icet.pos.entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoginFormController {

    public JFXTextField txtUsername;
    public JFXTextField txtPassword;
    @FXML
    private JFXTextField txtEMail;

    @FXML
    private JFXTextField txtUser;
    private Stage stage;

    UserEntity user = new UserEntity();

    UserBo userBo = new UserBoImpl();

    @FXML
    void LogInBtnOnAction(ActionEvent event) throws IOException {
        String enteredUsername = txtUsername.getText();
        String enteredPassword = encryptPassword (txtPassword.getText());

        Parent load = FXMLLoader.load(getClass().getResource("/view/DashBoardForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();

        for (User userDto : userBo.getUserDetails()){
            if (userDto.getUsername().equals(enteredUsername) && userDto.getPassword().equals(enteredPassword)) {
                user.setId(user.getId());
                user.setUsername(user.getUsername());
                user.setPassword(user.getPassword());
                user.setEMail(user.getEMail());

//                Parent load = FXMLLoader.load(getClass().getResource("/view/DashBoardForm.fxml"));
//                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//                Scene scene = new Scene(load);
//                stage.setScene(scene);
//                stage.show();
                return;
            }

        }
        new Alert(Alert.AlertType.INFORMATION,"Invalid Username or Password").show();


    }

    @FXML
    public void CreateAccLinkOnAction(ActionEvent actionEvent) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/view/SignUpForm.fxml"));
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();

    }

    private String encryptPassword(String text) {
        String encryptPassword = new String(Base64.encodeBase64(text.getBytes(StandardCharsets.UTF_8)));
        return encryptPassword;
    }
}
