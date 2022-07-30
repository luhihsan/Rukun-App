package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SceneHasilJadwalRondaController_1 implements Initializable {

    DataJadwal j = new DataJadwal();

    @FXML
    private ImageView backMain2;

    @FXML
    private ImageView btnBack;

    @FXML
    private Label hari1;

    @FXML
    private Label hari2;

    @FXML
    private Label hari3;

    @FXML
    private Label hari4;

    @FXML
    private Label judul1;

    @FXML
    private Label judul2;

    @FXML
    private Label judul3;

    @FXML
    private Label judul4;

    @FXML
    private Label kelompok1;

    @FXML
    private Label kelompok2;

    @FXML
    private Label kelompok3;

    @FXML
    private Label kelompok4;

    @FXML
    private Label tempat1;

    @FXML
    private Label tempat2;

    @FXML
    private Label tempat3;

    @FXML
    private Label tempat4;

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }
    String Kelompok1 = "Kelompok 1";
    String Kelompok2 = "Kelompok 2";
    String Kelompok3 = "Kelompok 3";
    String Kelompok4 = "Kelompok 4";
    SceneJadwal1Controller p = new SceneJadwal1Controller();

    @FXML
    void BackToMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        ambilDataJadwal();
        if (j.getKelompok().equals("Kelompok 1")) {
            judul1.setText(j.getJudul().toUpperCase());
            hari1.setText("Hari/Tanggal : " + j.getHari());
            kelompok1.setText(j.getKelompok());
            tempat1.setText("Tempat" + j.getTempat());

        }

        if (j.getKelompok().equals("Kelompok 2")) {
            judul2.setText(j.getJudul().toUpperCase());
            hari2.setText("Hari/Tanggal : " + j.getHari());
            kelompok2.setText(j.getKelompok());
            tempat2.setText("Tempat" + j.getTempat());
        }
        if (j.getKelompok().equals("Kelompok 3")) {
            judul3.setText(j.getJudul().toUpperCase());
            hari3.setText("Hari/Tanggal : " + j.getHari());
            kelompok3.setText(j.getKelompok());
            tempat3.setText("Tempat" + j.getTempat());
        }
        if (j.getKelompok().equals("Kelompok 4")) {
            judul4.setText(j.getJudul().toUpperCase());
            hari4.setText("Hari/Tanggal : " + j.getHari());
            kelompok4.setText(j.getKelompok());
            tempat4.setText("Tempat" + j.getTempat());
        }
    }

    void ambilDataJadwal() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileInputStream("xmlDataJadwal.xml");
            int kodeKu;
            String pesanKu = "";
            while ((kodeKu = FileSimpanan.read()) != -1) {
                pesanKu += (char) kodeKu;
            }
            j = (DataJadwal) xstream.fromXML(pesanKu);
            FileSimpanan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
