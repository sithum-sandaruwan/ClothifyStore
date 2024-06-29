package edu.icet.pos.controllers.employee;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AddEmpFormController {

    @FXML
    private TableColumn<?, ?> colEmpAddress;

    @FXML
    private TableColumn<?, ?> colEmpID;

    @FXML
    private TableColumn<?, ?> colEmpName;

    @FXML
    private TableColumn<?, ?> colEmpPhone;

    @FXML
    private TableColumn<?, ?> colMail;

    @FXML
    private JFXTextField txtEmpAddress;

    @FXML
    private Text txtEmpID;

    @FXML
    private JFXTextField txtEmpMail;

    @FXML
    private JFXTextField txtEmpName;

    @FXML
    private JFXTextField txtEmpPhone;

    @FXML
    void btnBackOnAction(MouseEvent event) {

    }

    @FXML
    void btnClearFormOnAction(ActionEvent event) {

    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

}
