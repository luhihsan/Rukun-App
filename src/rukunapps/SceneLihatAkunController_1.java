/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneLihatAkunController_1 implements Initializable {

    DataAkun d = new DataAkun();
    @FXML
    private Label Alamat;

    @FXML
    private Label NIK;

    @FXML
    private Label NOHP;

    @FXML
    private Label Nama;

 
    @FXML
    void edit(ActionEvent event) {
          PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneEditAkun_1.fxml");
    }

    @FXML
    void simpan(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }
    @FXML
    void switchButton(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneMasukSebagai_1.fxml");
    }
    
    @FXML
    void logout(ActionEvent event) {
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ambilData();
        Nama.setText(d.getUsername().toUpperCase());
        NIK.setText(d.getNik());
        NOHP.setText(d.getNoHp());
        Alamat.setText(d.getAlamat().toUpperCase());

    }

    void ambilData() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileInputStream("xmlDataAkun.xml");
            int kodeKu;
            String pesanKu = "";
            while ((kodeKu = FileSimpanan.read()) != -1) {
                pesanKu += (char) kodeKu;
            }
            d = (DataAkun) xstream.fromXML(pesanKu);
            FileSimpanan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
