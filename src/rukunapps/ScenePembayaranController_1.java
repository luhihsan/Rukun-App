package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ScenePembayaranController_1 implements Initializable {

    @FXML
    void Pembayaran(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "ScenePembayaranOnline_1.fxml");
    }

    @FXML
    void Tagihan(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneTagihan_1.fxml");
    }
    private Button btnBack_Pembayaran;
    /////////BACK BUTTON////////////

    public void ctrlBacktoMain(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
