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
import javafx.scene.control.Button;
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
public class SceneInputPengumumanController implements Initializable {
    DataPengumuman p = new DataPengumuman();
    int status = 0;
    @FXML
    private ChoiceBox Cb1;

    @FXML
    private Button back;

    @FXML
    private ImageView backMain2;

    @FXML
    private ImageView btnBack;

    @FXML
    private DatePicker dp1;

    @FXML
    private Button tambah;

    @FXML
    private TextField tfJudul;

    @FXML
    private TextField tfTempat;

    @FXML
    private TextField tfwaktu;

    @FXML
    private Label warning;

    @FXML
    void addPengumuman(ActionEvent event) {
        status = 0;

        if (tfJudul.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            p.setJudul(tfJudul.getText());

            status++;
        }

        if (Cb1.getValue().toString().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            Cb1.getValue();
            p.setMenu(Cb1.getValue().toString());
            
            status++;
        }

        if (dp1.getValue().toString().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {

            p.setHari(dp1.getValue().toString());

            status++;
        }

        if (tfTempat.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            p.setTempat(tfTempat.getText());
//            label11.setText("");
            status++;
        }
        if (tfwaktu.getText().isEmpty()) {
            warning.setText("*Isian tidak boleh kosong");
        } else {
            p.setWaktu(tfwaktu.getText());

            status++;
        }

        if (status == 5) {
            SimpanDataPengumuman();
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "ScenePengumuman_1.fxml");

        }
    }

    @FXML
    void back(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSosial.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
          Cb1.getItems().addAll("Pengumuman 1", "Pengumuman 2", "Pengumuman 3");

    }
    void SimpanDataPengumuman() {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(p);
        FileOutputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileOutputStream("xmlDataPengumuman.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            FileSimpanan.write(byteKu);
            FileSimpanan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
