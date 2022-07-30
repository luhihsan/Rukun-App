/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rukunapps;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class SceneKeluhan implements Initializable {

    ObservableList data = observableArrayList();

    private void tambahData(String laporan) {
        data.add(new DataKeluhan(laporan));
    }

    @FXML
    private TableColumn TLaporan;

    @FXML
    private TableView<?> TVutama;
    @FXML
    private TextField tfKeluhan;

    @FXML
    void btnTambah(ActionEvent event) {
        tambahData(tfKeluhan.getText());
        tfKeluhan.setText("");
        DataRukun l = new DataRukun();
        l.simpanDataLaporan(data, "laporan");
    }

    @FXML
    void buttonReset(ActionEvent event) {

        data.remove(data.size() - 1);
        DataRukun l = new DataRukun();
        l.simpanDataLaporan(data, "laporan");
    }

    @FXML
    void BacktoSosial(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "SceneSosial.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DataRukun l = new DataRukun();
        data = l.ambilDataLaporan("laporan");

        TLaporan.setCellValueFactory(new PropertyValueFactory<DataKeluhan, String>("laporan"));
        TVutama.setItems(data);

    }

}
