package edu.icet.pos.controllers.orders;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ReturnedFormController {

    @FXML
    private DatePicker ReturnDate;

    @FXML
    private ImageView btnBack;

    @FXML
    private JFXTextField txtItemID;

    @FXML
    private JFXTextField txtOrderID;

    @FXML
    private JFXTextField txtReason;

    @FXML
    private Text txtReturnID;
    private Stage stage;

    @FXML
    void btnBackOnAction(MouseEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageOrdersForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnClearFormOnAction(ActionEvent event) {

    }

    @FXML
    void btnReturnAddOnAction(ActionEvent event) {

    }

}
