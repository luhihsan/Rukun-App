/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneHasilSuratLampiranController_1 implements Initializable {

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
