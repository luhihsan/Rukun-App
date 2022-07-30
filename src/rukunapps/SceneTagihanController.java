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

public class SceneTagihanController implements Initializable {

    DataTagihan t = new DataTagihan();
    @FXML
    private Label Judul1;

    @FXML
    private Label Judul2;

    @FXML
    private Label Judul3;

    @FXML
    private Label waktu1;

    @FXML
    private Label waktu2;

    @FXML
    private Label waktu3;

    @FXML
    private Label kode1;

    @FXML
    private Label kode2;

    @FXML
    private Label kode3;

    @FXML
    private Label tagihan1;

    @FXML
    private Label tagihan2;

    @FXML
    private Label tagihan3;

    String menu1 = "Tagihan 1";
    String menu2 = "Tagihan 2";
    String menu3 = "Tagihan 3";

    @FXML
    void BackToMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ambilDataTagihan();
        if (t.getMenu().equals("Tagihan 1")) {
            Judul1.setText(t.getJudul().toUpperCase());
            waktu1.setText(t.getWaktu());
            kode1.setText("Kode Bayar : " + t.getKode());
            tagihan1.setText("Rp. " + t.getTagihan());
        }
        if (t.getMenu().equals("Tagihan 2")) {
            Judul2.setText(t.getJudul().toUpperCase());
            waktu2.setText(t.getWaktu());
            kode2.setText("Kode Bayar : " + t.getKode());
            tagihan2.setText("Rp. " + t.getTagihan());
        }
        if (t.getMenu().equals("Tagihan 3")) {
            Judul3.setText(t.getJudul().toUpperCase());
            waktu3.setText(t.getWaktu());
            kode3.setText("Kode Bayar : " + t.getKode());
            tagihan3.setText("Rp. " + t.getTagihan());
        }

    }

    void ambilDataTagihan() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileInputStream("xmlDataTagihan.xml");
            int kodeKu;
            String pesanKu = "";
            while ((kodeKu = FileSimpanan.read()) != -1) {
                pesanKu += (char) kodeKu;
            }
            t = (DataTagihan) xstream.fromXML(pesanKu);
            FileSimpanan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
