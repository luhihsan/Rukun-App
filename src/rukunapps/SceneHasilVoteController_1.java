package rukunapps;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class SceneHasilVoteController_1 implements Initializable {
    XYChart.Series<String, Integer> series = new XYChart.Series();

  
    @FXML
    private PieChart PieChart_HasilVote;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        DataVoting dv = new DataVoting(40, 50);
        //ambilDataVoting(dv, "xmlDataVoting");

        ObservableList<PieChart.Data> datPie = FXCollections.observableArrayList(
                new PieChart.Data("Calon 1", dv.getA()),
                new PieChart.Data("Calon 2", dv.getB())
        );

        PieChart_HasilVote.setData(datPie);
    }

    @FXML
    void ctrlBacktoMain(ActionEvent event) {

        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");

    }
}
