package edu.icet.pos.controllers.user;

import com.jfoenix.controls.JFXTextField;
import edu.icet.pos.bo.custom.Impl.UserBoImpl;
import edu.icet.pos.bo.custom.UserBo;
import edu.icet.pos.dto.User;
import edu.icet.pos.entity.UserEntity;
import edu.icet.pos.util.RegExPattern;
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
import java.util.regex.Pattern;

public class SignUpFormController {

    public JFXTextField txtUserName;
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

        boolean validatedEMail = validateEMail(txtEMail.getText());

        if (validatedEMail) {
            userDto.setEMail(txtEMail.getText());

            boolean validatedUsername = validateUsername(txtUser.getText());
            if (validatedUsername){
                userDto.setUsername(txtEMail.getText());

                boolean validatedPassword = validatePassword(txtPassword.getText());
                if (validatedPassword){
                    userDto.setPassword(txtPassword.getText());

                    if (txtPassword.equals(txtReEnterPassword)){

                        boolean saved = userBo.addUser(userDto);
                        new Alert(Alert.AlertType.INFORMATION,"Registration Successs").show();

                    }
                }
            }


        }

    }

    private boolean validatePassword(String text) {
        boolean matches = Pattern.matches(RegExPattern.getPasswordPattern().pattern(), text);
        return matches;
    }

    private boolean validateEMail(String text) {
        boolean matches = Pattern.matches(RegExPattern.getEMailPattern().pattern(), text);
        return matches;
    }

    private boolean validateUsername(String text) {
        boolean matches = Pattern.matches(RegExPattern.getUsernamePattern().pattern(), text);
        return false;
    }

    private String generateNextID() {

        String userID = userBo.generateNewUserID();

        return userID;
    }

}
