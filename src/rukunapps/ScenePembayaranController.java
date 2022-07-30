package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ScenePembayaranController implements Initializable {

    @FXML
    void Pembayaran(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaranOnline.fxml");
    }

    @FXML
    void Tagihan(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneInputTagihan.fxml");
    }
    private Button btnBack_Pembayaran;
    /////////BACK BUTTON////////////

    public void ctrlBacktoMain(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
