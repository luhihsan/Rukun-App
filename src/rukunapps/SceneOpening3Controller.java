/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Arya Andhika
 */
public class SceneOpening3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    public void opening3(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneMasukSebagai.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
