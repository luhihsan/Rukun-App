/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rukunapps;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author Lenovo
 */
public class OpenScene {

    private Pane halaman;

    public Pane getPane(String p) {
        try {
            URL fileHalaman = RukunApps.class.getResource("/rukunapps/" + p + ".FXML");
            if (fileHalaman == null) {
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            halaman = FXMLLoader.load(fileHalaman);
        } catch (Exception e) {
            System.out.println("Tidak Ditemukan Halaman Tersebut");
        }
        return halaman;
    }
}
