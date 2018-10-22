package arisyrifki.app.kumpulanhadist.model;

/**
 * Created by rfkchrl on 10/19/2018.
 */

public class DoaModel {
    private int img;
    private String nama;
    private String arti;
    private String surah;

    /*
     *Constructor
     * Menginisialisasikan Variable
     */

    public DoaModel(int img, String nama, String arti, String surah) {
        this.img = img;
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

     /*
     * Getter
     * untuk mengambil isian dari constructor
     */

    public int getImg() {
        return img;
    }

    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() {
        return surah;
    }
}
