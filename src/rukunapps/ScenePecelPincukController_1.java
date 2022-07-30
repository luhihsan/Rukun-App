package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

public class ScenePecelPincukController_1 implements Initializable {
 @FXML
    private void btnBacktoUMKM(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneUmkm_1.fxml");

    }
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

   
}
