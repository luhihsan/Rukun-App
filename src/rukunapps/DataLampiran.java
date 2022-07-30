package rukunapps;

public class DataLampiran {

    private String namaDokumen, namaPemohon, nik, noTelepon;

    public DataLampiran(String namaDokumen, String namaPemohon, String nik, String noTelepon) {
        
        this.namaDokumen = namaDokumen;
        this.namaPemohon = namaPemohon;
        this.nik = nik;
        this.noTelepon = noTelepon;
    }

    public String getNamaDokumen() {
        return namaDokumen;
    }

    public void setNamaDokumen(String namaDokumen) {
        this.namaDokumen = namaDokumen;
    }

    public String getNamaPemohon() {
        return namaPemohon;
    }

    public void setNamaPemohon(String namaPemohon) {
        this.namaPemohon = namaPemohon;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}
