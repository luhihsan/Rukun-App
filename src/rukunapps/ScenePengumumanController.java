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
import javafx.scene.control.Label;

public class ScenePengumumanController implements Initializable {
    @FXML
    private Label hari3;

    @FXML
    private Label hari1;

    @FXML
    private Label hari2;

    @FXML
    private Label judul1;

    @FXML
    private Label judul2;

    @FXML
    private Label judul3;

    @FXML
    private Label tempat1;

    @FXML
    private Label tempat2;

    @FXML
    private Label tempat3;

    @FXML
    private Label waktu1;

    @FXML
    private Label waktu2;

    @FXML
    private Label waktu3;
DataPengumuman p = new DataPengumuman();
    @FXML
    void BackToSosial(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSosial_1.fxml");
    }
    String menu1 = "Pengumuman 1";
    String menu2 = "Pengumuman 2";
    String menu3 = "Pengumuman 3";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ambilDataPengumuman();
        if (p.getMenu().equals("Pengumuman 1")) {
            judul1.setText(p.getJudul().toUpperCase());
            waktu1.setText("Waktu : "+p.getWaktu());
            tempat1.setText("Tempat : " + p.getTempat());
            hari1.setText("Hari/Tanggal " + p.getHari());
        }
        if (p.getMenu().equals("Pengumuman 2")) {
            judul2.setText(p.getJudul().toUpperCase());
            waktu2.setText("Waktu :"+p.getWaktu());
            tempat2.setText("Tempat : " + p.getTempat());
            hari2.setText("Hari/Tanggal " + p.getHari());
        }
        if (p.getMenu().equals("Pengumuman 3")) {
            judul3.setText(p.getJudul().toUpperCase());
            waktu3.setText("Waktu :"+p.getWaktu());
            tempat3.setText("Tempat : " + p.getTempat());
            hari3.setText("Hari/Tanggal : " + p.getHari());
        }

    }
        void ambilDataPengumuman() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileInputStream("xmlDataPengumuman.xml");
            int kodeKu;
            String pesanKu = "";
            while ((kodeKu = FileSimpanan.read()) != -1) {
                pesanKu += (char) kodeKu;
            }
            p = (DataPengumuman) xstream.fromXML(pesanKu);
            FileSimpanan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
