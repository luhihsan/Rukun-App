/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Hasan Rama
 */
public class SceneAkunController implements Initializable {

    DataAkun d = new DataAkun();
    int status = 0;

    @FXML
    private CheckBox CBAcc;

    @FXML
    private Label labelCentang;
    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField tfAlamat;

    @FXML
    private TextField tfNIK;

    @FXML
    private TextField tfNamaLengkap;

    @FXML
    private TextField tfNoHP;
    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelNama;

    @FXML
    private Label labelNik;

    @FXML
    private Label labelNoHp;

    @FXML
    private ImageView image;

    @FXML
    private Label labelPassword;

    public void register(ActionEvent event) {
        status = 0;
        if (tfNamaLengkap.getText().isEmpty()) {
            labelNama.setText("Masukkan Nama");
        } else {
            d.setUsername(tfNamaLengkap.getText());
            labelNama.setText("");
            status++;
        }

        if (tfNIK.getText().isEmpty()) {
            labelNik.setText("Masukkan NIK");
        } else {
            d.setNik(tfNIK.getText());
            labelNik.setText("");
            status++;
        }

        if (tfAlamat.getText().isEmpty()) {
            labelAlamat.setText("Masukkan alamat");
        } else {
            d.setAlamat(tfAlamat.getText());
            labelAlamat.setText("");
            status++;
        }

        if (tfNoHP.getText().isEmpty()) {
            labelNoHp.setText("Masukkan Nomer Telepon");
        } else {
            d.setNoHp(tfNoHP.getText());
            labelNoHp.setText("");
            status++;
        }

        if (passwordField.getText().isEmpty()) {
            labelPassword.setText("Masukkan Password");

        } else if (passwordField.getText().length() < 8) {
            labelPassword.setText("Password Minimal 8 digit");
        } else {
            d.setPassword(passwordField.getText());
            labelPassword.setText("");
            status++;
        }
        if (CBAcc.isSelected()) {
            status++;
        } else {
            labelCentang.setText("Anda Belum Menyetujui Persyaratan");
        }

        if (status == 6) {
            SimpanData();
            tfNamaLengkap.setText("");
            tfNoHP.setText("");
            tfNIK.setText("");
            passwordField.setText("");
            tfAlamat.setText("");
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneLogin.fxml");
        }
    }
   @FXML
    void backToLogin(ActionEvent event) {
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneLogin.nfxml");
    }
    
    

    void SimpanData() {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(d);
        FileOutputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileOutputStream("xmlDataAkun.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            FileSimpanan.write(byteKu);
            FileSimpanan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
