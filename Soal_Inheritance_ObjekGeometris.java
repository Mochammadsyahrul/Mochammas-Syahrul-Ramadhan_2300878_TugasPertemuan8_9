package Tugas_Pertemuan_8_Inheritance_PBO;

/**
 * @author Mochammad Syahrul Ramadhan
 */
public class Soal_Inheritance_ObjekGeometris {
    private String warna = "putih";
    private boolean terisi;

    public Soal_Inheritance_ObjekGeometris() {
    }

    public Soal_Inheritance_ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean SudahTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "Warna: " + warna + ", Terisi: " + terisi;
    }
}
