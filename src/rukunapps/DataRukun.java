package rukunapps;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;

public class DataRukun {

    public void simpanDataLaporan(ObservableList data, String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(data);
        FileOutputStream xmlKu = null;

        try {
            xmlKu = new FileOutputStream(namaFile + ".xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            xmlKu.write(byteKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public ObservableList ambilDataLaporan(String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream xmlKu = null;
        ObservableList hasil = observableArrayList();

        try {
            xmlKu = new FileInputStream(namaFile + ".xml");
            int kodeKu;
            String pesanKu = "";

            while ((kodeKu = xmlKu.read()) != -1) {
                pesanKu += (char) kodeKu;
            }

            hasil = (ObservableList) xstream.fromXML(pesanKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        return hasil;

    }

    public void simpanDataLampiran(ObservableList data, String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(data);
        FileOutputStream xmlKu = null;

        try {
            xmlKu = new FileOutputStream(namaFile + "xmlDataLampiran.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            xmlKu.write(byteKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public ObservableList ambilDataLampiran(String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream xmlKu = null;
        ObservableList hasil = observableArrayList();

        try {
            xmlKu = new FileInputStream(namaFile + "xmlDataLampiran.xml");
            int kodeKu;
            String pesanKu = "";

            while ((kodeKu = xmlKu.read()) != -1) {
                pesanKu += (char) kodeKu;
            }

            hasil = (ObservableList) xstream.fromXML(pesanKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        return hasil;

    }

    public static void simpanDataVoting(DataVoting x, String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(x);
        FileOutputStream xmlKu = null;

        try {
            xmlKu = new FileOutputStream(namaFile + ".xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            xmlKu.write(byteKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void ambilDataVoting(DataVoting x, String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream xmlKu = null;

        try {
            xmlKu = new FileInputStream(namaFile + ".xml");
            int kodeKu;
            String pesanKu = "";

            while ((kodeKu = xmlKu.read()) != -1) {
                pesanKu += (char) kodeKu;
            }

            x = (DataVoting) xstream.fromXML(pesanKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void simpanDataJadwal(ObservableList data, String namaFile) {
        XStream xstream = new XStream(new StaxDriver());
        String dataKu = xstream.toXML(data);
        FileOutputStream xmlKu = null;

        try {
            xmlKu = new FileOutputStream(namaFile + "xmlDataJadwal.xml");
            byte[] byteKu = dataKu.getBytes("UTF-8");
            xmlKu.write(byteKu);
            xmlKu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
