package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ScenePecelPincukController implements Initializable {

    @FXML
    private ImageView backMain2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void btnBacktoUMKM(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneUmkm.fxml");

    }
}
