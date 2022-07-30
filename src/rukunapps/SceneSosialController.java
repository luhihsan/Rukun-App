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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneSosialController implements Initializable {

    @FXML
    private ImageView IVChat;

    @FXML
    private ImageView IVIconChat;

    @FXML
    private ImageView IVIconInformasi;

    @FXML
    private ImageView IVIconKeluhan;

    @FXML
    private ImageView IVInformasi;

    @FXML
    private ImageView IVKeluhan;

    @FXML
    private ImageView IVillus;

    @FXML
    private ImageView backMain2;

    @FXML
    private Button btnKeluhan;

    @FXML
    private Label labelChat;

    @FXML
    private Label labelInformasi;

    @FXML
    private Label labelKeluhan;

    public void changeScreenButtonSceneKeluhan(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneKeluhan.fxml");
    }

    public void UMKM(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneUmkm.fxml");
    }

    public void informasi(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneInputPengumuman.fxml");
    }

    @FXML
    void BackToMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");

    }

    ///////////////MENU INFORMASI//////////////
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
