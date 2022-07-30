/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneMasukSebagaiController_1 implements Initializable {

    public void ButtonMasukPengurus(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    public void ButtonMasukWarga(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }

    public void ButtonLogout(ActionEvent event) throws IOException {

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
