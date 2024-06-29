package edu.icet.pos.controllers.products;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

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

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(MouseEvent event) {

    }

    @FXML
    void btnClearFormOnAction(ActionEvent event) {

    }

}
