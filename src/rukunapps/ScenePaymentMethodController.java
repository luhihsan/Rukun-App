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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author adyutaindraadyatma
 */
public class ScenePaymentMethodController implements Initializable {

    @FXML
    private ImageView backMain2;
    @FXML
    private ImageView btnBack;
    @FXML
    private Button btnBack_Pembayaran;
    @FXML
    private Button MBANKbtn;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void aksiPindahBtn(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaran.fxml");

    }

    @FXML
    private void ctrlBacktoMain(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
