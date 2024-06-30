package edu.icet.pos.controllers.supplier;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AddSupplierFormController {

    @FXML
    private ImageView btnBack;

    @FXML
    private TableColumn<?, ?> colItem;

    @FXML
    private TableColumn<?, ?> colSupCompany;

    @FXML
    private TableColumn<?, ?> colSupID;

    @FXML
    private TableColumn<?, ?> colSupMail;

    @FXML
    private TableColumn<?, ?> colSupName;

    @FXML
    private JFXTextField txtItem;

    @FXML
    private JFXTextField txtSupCompany;

    @FXML
    private Text txtSupID;

    @FXML
    private JFXTextField txtSupMail;

    @FXML
    private JFXTextField txtSupName;
    private Stage stage;

    @FXML
    void btnBackOnAction(MouseEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageSupForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnClearFormOnAction(ActionEvent event) {

    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

}
