package edu.icet.pos.controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {

    @FXML
    private JFXTextField NumOfEmpToday;

    @FXML
    private JFXTextField NumOfOrderToday;

    @FXML
    private JFXTextField NumOfProToday;

    @FXML
    private JFXTextField NumOfSupToday;

    @FXML
    private Text UserId;
    private Stage stage;

    @FXML
    void BackBtnOnAction(MouseEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/LogInForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void EmployeeBtnOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageEmpForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OrdersBtnOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageOrdersForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ProductBtnOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageProductsForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void SupplierBtnOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageSupForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

}
