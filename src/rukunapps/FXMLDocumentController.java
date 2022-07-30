package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    DataAkun d = new DataAkun();
    @FXML
    private Label Alamat;
    @FXML
    private ImageView image;
    @FXML
    private Label NamaLengkap;

    @FXML
    private Label User;

    @FXML
    private BorderPane mainPane;
    @FXML
    private ImageView backMain;
    @FXML
    private ImageView backMain2;
    
    
    ////////////INI UNTUK TRANSISI KE MENU LAIN//////////
    //////MENU JADWAL/////////////

    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneJadwal1.fxml");
    }
    ///////////////MENU PEMBAYARAN//////////////

    public void changeScreenButtonPembayaran(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaran.fxml");
    }
    ///////////MENU INVENTARIS////////////

    public void changeScreenButtonInventaris(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneInventaris.fxml");
    }
    ///////////////MENU SURAT LAMPIRAN////////

    public void changeScreenButtonSuratLampiran(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSuratLampiran.fxml");
    }
    ///////////////MENU E-VOTING///////

    public void changeScreenButtonEVoting(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneEVoting.fxml");
    }
    ///////////////MENU E-VOTING///////

    public void changeScreenButtonSosial(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSosial.fxml");
    }

    @FXML
    void lihatAkun(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneLihatAkun.fxml");

    }

    final FileChooser fc = new FileChooser();

    @FXML
    void importFoto(ActionEvent event) {
        fc.setInitialDirectory(new File(System.getProperty("user.home")));
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpeg", "*.jpg"));
        File file = fc.showOpenDialog(null);
        if (file != null) {
            image.setImage(new Image(file.toURI().toString()));
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ambilData();
        NamaLengkap.setText(d.getUsername().toUpperCase());
        User.setText("PENGURUS RT 07/08");
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
