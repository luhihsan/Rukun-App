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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ScenePembayaranOnlineController implements Initializable {

    @FXML
    private ImageView backMain2;

    @FXML
    private ImageView btnBack;

    @FXML
    private Button btnBack_Pembayaran;

    @FXML
    private Button btnOK;

    @FXML
    void aksiKembali(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaran.fxml");
    }

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
