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

/**
 * FXML Controller class
 *
 * @author Arya Andhika
 */
public class SceneUmkmController_1 implements Initializable {

    @FXML
    void BackToSosial(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSosial_1.fxml");

    }

    @FXML
    void topecel(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePecelPincuk_1.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
