package edu.icet.pos.controllers.employee;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;

public class UpdateEmpDetailsFormController {

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
    private JFXTextField txtEmpID;

    @FXML
    private JFXTextField txtEmpMail;

    @FXML
    private JFXTextField txtEmpName;

    @FXML
    private JFXTextField txtEmpPhoneNumber;

    @FXML
    void btnBackOnAction(MouseEvent event) {

    }

    @FXML
    void btnRemoveOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
