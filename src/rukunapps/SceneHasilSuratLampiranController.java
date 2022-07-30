/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SceneHasilSuratLampiranController implements Initializable {

    @FXML
    private TableColumn tvKeterangan;

    @FXML
    private TableColumn tvNama;

    @FXML
    private TableView tvUtama;

    @FXML
    void ctrlBacktoMain(ActionEvent event) {
        PindahHalaman h = new PindahHalaman();
        h.pindahHalaman(event, "MainMenu.fxml");
    }

    ObservableList data = observableArrayList();
    ArrayList<DataLampiran> l = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        data.add(new DataLampiran("Surat Persetujuan RT", "Suryanto", "", ""));
        data.add(new DataLampiran("Surat KIP", "Triyono", "", ""));
        data.add(new DataLampiran("Surat Bantuan Sosial", "Dessy", "", ""));
        data.add(new DataLampiran("Surat Permohonan", "Juamanji", "", ""));
        ambilDataLampiran();
        for (int i = 0; i < l.size(); i++) {
            data.add((DataLampiran) l.get(i));
        }

        tvNama.setCellValueFactory(new PropertyValueFactory<DataLampiran, String>("namaPemohon"));
        tvKeterangan.setCellValueFactory(new PropertyValueFactory<DataLampiran, String>("namaDokumen"));
        tvUtama.setItems(data);

    }

    void ambilDataLampiran() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream FileSimpanan = null;
        try {
            FileSimpanan = new FileInputStream("xmlDataLampiran.xml");
            int kodeKu;
            String pesanKu = "";
            while ((kodeKu = FileSimpanan.read()) != -1) {
                pesanKu += (char) kodeKu;
            }
            l = (ArrayList<DataLampiran>) xstream.fromXML(pesanKu);
            FileSimpanan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
