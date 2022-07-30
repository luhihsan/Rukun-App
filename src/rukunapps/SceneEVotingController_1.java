package rukunapps;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckBox;
import static rukunapps.DataRukun.ambilDataVoting;
import static rukunapps.DataRukun.simpanDataVoting;

public class SceneEVotingController_1 implements Initializable {

    ObservableList data = observableArrayList();
    XYChart.Series<String, Integer> series = new XYChart.Series();
    Boolean Hasil_vote;

    @FXML
    private CheckBox pilih1;
    @FXML
    private CheckBox pilih2;

    DataVoting dv;

    /////////Button Lihat Hasil////////////
    public void changeScreenButtonSceneHasilVote(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneHasilVote_1.fxml");
    }

    /////////Button back to Main////////
    public void ctrlBacktoMain(ActionEvent event) throws IOException {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu_1.fxml");
    }

    public void vote(ActionEvent event) {
        if (pilih1.isSelected()) {
            dv.setA(dv.getA() + 1);
            simpanDataVoting(dv, "xmlDataVoting");
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneHasilVote.fxml");

        } else if (pilih2.isSelected()) {
            dv.setB(dv.getB() + 1);
            simpanDataVoting(dv, "xmlDataVoting");
            PindahHalaman h = new PindahHalaman();
            h.pindahHalaman(event, "SceneHasilVote_1.fxml");
        }

    }

    @FXML
    private void pilihan1(ActionEvent event) {
        if (pilih1.isSelected()) {
            pilih2.setSelected(false);
        }
    }

    @FXML
    private void pilihan2(ActionEvent event) {
        if (pilih2.isSelected()) {
            pilih1.setSelected(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dv = new DataVoting();
        ambilDataVoting(dv, "xmlDataVoting");
    }

}
