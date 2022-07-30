/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneSosialController_1 implements Initializable {

    public void changeScreenButtonSceneKeluhan(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneKeluhan_1.fxml");
    }

    public void UMKM(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneUmkm_1.fxml");
    }

    public void informasi(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePengumuman_1.fxml");
    }

    @FXML
    void BackToMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");

    }

    ///////////////MENU INFORMASI//////////////
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
