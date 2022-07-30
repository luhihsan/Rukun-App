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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneLoginController_1 implements Initializable {

    @FXML
    private PasswordField PFpassLogin;

    @FXML
    private TextField TFUserLogin;

    @FXML
    private Label labelErrorLogin;

    @FXML
    private void signUp(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneAkun_1.fxml");
    }
    @FXML
    void backToLogin(ActionEvent event) {
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneMasukSebagai.fxml");
    }


    @FXML
    private void handleButtonLogin(ActionEvent event) throws IOException {
        if (TFUserLogin.getText().equals(d.getUsername()) && PFpassLogin.getText().equals(d.getPassword())) {
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "MainMenu_1.fxml");
        } else {
            labelErrorLogin.setText("Please Try Again");
//        else if(TFUserLogin.getText().isEmpty()|| PFpassLogin.getText().isEmpty()){
//            if(TFUserLogin.getText().isEmpty()){
//                labelErrorLogin.setText("Masukkan data yang benar");
//            }
//            else{
//                labelErrorLogin.setText("");
//            }
//            if(PFpassLogin.getText().isEmpty()){
//                labelErrorLogin.setText("");
//            }else{
//                labelErrorLogin.setText("");
        }

    }
    DataAkun d = new DataAkun();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ambilData();
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
