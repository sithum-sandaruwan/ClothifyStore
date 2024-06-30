package edu.icet.pos.controllers.products;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AddProductFormController {

    @FXML
    private ImageView btnBack;

    @FXML
    private JFXComboBox<?> cmbCatogary;

    @FXML
    private JFXComboBox<?> cmbSize;

    @FXML
    private Text txtProductID;

    @FXML
    private JFXTextField txtProductName;

    @FXML
    private JFXTextField txtProductPrize;

    @FXML
    private JFXTextField txtQTY;
    private Stage stage;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(MouseEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/ManageProductsForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnClearFormOnAction(ActionEvent event) {

    }

}
