package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class SuratLampiranController_1 implements Initializable {

    ArrayList<DataLampiran> l = new ArrayList<>();

    int status = 0;

    @FXML
    private Label labelFile;
    @FXML
    private Label label11;

    @FXML
    private TextField tfNIK;

    @FXML
    private TextField tfNamaDokumen;

    @FXML
    private TextField tfNamaPemohon;

    @FXML
    private TextField tfTelepon;
    final FileChooser fc = new FileChooser();

    @FXML
    void ajukan(ActionEvent event) {
        DataLampiran baru = new DataLampiran("-", "-", "-", "-");
        status = 0;
        if (tfNamaDokumen.getText().isEmpty()) {
            label11.setText("Formulir Tidak Boleh Kosong");
        } else {
            baru.setNamaDokumen(tfNamaDokumen.getText());
            label11.setText("");
            status++;
        }

        if (tfNamaPemohon.getText().isEmpty()) {
            label11.setText("Formulir Tidak Boleh Kosong");
        } else {
            baru.setNamaPemohon(tfNamaPemohon.getText());
            label11.setText("");
            status++;
        }

        if (tfNIK.getText().isEmpty()) {
            label11.setText("Formulir Tidak Boleh Kosong");
        } else {
            baru.setNik(tfNIK.getText());
            label11.setText("");
            status++;
        }

        if (tfTelepon.getText().isEmpty()) {
            label11.setText("Formulir Tidak Boleh Kosong");
        } else {
            baru.setNoTelepon(tfTelepon.getText());
            label11.setText("");
            status++;
        }

        l.add(baru);

        if (status == 4) {
            SimpanDataLampiran();
            tfNamaDokumen.setText("");
            tfNamaPemohon.setText("");
            tfNIK.setText("");
            tfTelepon.setText("");
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneHasilSuratLampiran_1.fxml");
        }
    }

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }
        @FXML
  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void importFile(ActionEvent event) {
        File file = fc.showOpenDialog(null);
        if (file != null) {
            labelFile.setText(file.getAbsolutePath() + "\n");
        } else {
            labelFile.setText("*lampirkan file surat pengantar jika ada");
        }
    }

    void SimpanDataLampiran() {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(l);
        FileOutputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileOutputStream("xmlDataLampiran.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            FileSimpanan.write(byteKu);
            FileSimpanan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
