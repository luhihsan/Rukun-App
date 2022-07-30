/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneInventarisController implements Initializable {

    int totalHarga = 0;

    String th = String.valueOf(totalHarga);

    @FXML
    private Label labelHarga;

    @FXML
    private CheckBox CB1;

    @FXML
    private CheckBox CB2;

    @FXML
    private CheckBox CB3;
    @FXML
    private CheckBox CB4;

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        labelHarga.setText("Total Harga");

    }

    @FXML
    private void handleCB3(ActionEvent event) {
        if (CB3.isSelected()) {
            totalHarga += 250000;
        } else {
            totalHarga -= 250000;
        }
        th = String.valueOf(totalHarga);

        labelHarga.setText("Rp " + th);
    }

    @FXML
    private void handleCB2(ActionEvent event) {
        if (CB2.isSelected()) {
            totalHarga += 100000;
        } else {
            totalHarga -= 100000;
        }
        th = String.valueOf(totalHarga);

        labelHarga.setText("Rp " + th);

    }

    @FXML
    private void handleCB1(ActionEvent event) {
        if (CB1.isSelected()) {
            totalHarga += 50000;
        } else {
            totalHarga -= 50000;
        }
        th = String.valueOf(totalHarga);

        labelHarga.setText("Rp " + th);

    }

    @FXML
    private void handleCB4(ActionEvent event) {
        if (CB4.isSelected()) {
            totalHarga += 50000;
        } else {
            totalHarga -= 50000;
        }
        th = String.valueOf(totalHarga);

        labelHarga.setText("Rp " + th);

    }

    @FXML
    private void checkout(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneHasilInventaris.fxml");

    }
}
