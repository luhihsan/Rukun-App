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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneInputTagihanController implements Initializable {

    DataTagihan t = new DataTagihan();
    int status = 0;
    @FXML
    private ImageView backMain2;
    @FXML
    private Label warning;

    @FXML
    private ImageView btnBack;

    @FXML
    private ChoiceBox cb;

    @FXML
    private DatePicker dp;

    @FXML
    private TextField tfHarga;

    @FXML
    private TextField tfJudul;

    @FXML
    private TextField tfKode;

    @FXML
    void TambahTagihan(ActionEvent event) {

        status = 0;

        if (tfJudul.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            t.setJudul(tfJudul.getText());

            status++;
        }

        if (cb.getValue().toString().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            cb.getValue();
            t.setMenu(cb.getValue().toString());
            
            status++;
        }

        if (dp.getValue().toString().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {

            t.setWaktu(dp.getValue().toString());

            status++;
        }

        if (tfKode.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            t.setKode(tfKode.getText());
//            label11.setText("");
            status++;
        }
        if (tfHarga.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            t.setTagihan(tfHarga.getText());

            status++;
        }

        if (status == 5) {
            SimpanData();
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneTagihan.fxml");

        }
    }

    @FXML
    void back(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaran.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb.getItems().addAll("Tagihan 1", "Tagihan 2", "Tagihan 3");

    }

    void SimpanData() {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(t);
        FileOutputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileOutputStream("xmlDataTagihan.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            FileSimpanan.write(byteKu);
            FileSimpanan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
